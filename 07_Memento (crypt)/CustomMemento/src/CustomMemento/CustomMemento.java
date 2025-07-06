package CustomMemento;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.spec.KeySpec;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class CustomMemento<T extends Serializable> {
  private static final String CRYPT_PASSWORD = "MEMENTO_PASSWORD";
  private static final String CRYPT_SALT = "MEMENTO_SALT";
  private static final String PATH_TO_DATA = "data.data";

  private int maxSize;
  protected ArrayList<MementoItem<T>> cache = new ArrayList<>();

  Cipher cipher;
  Cipher decipher;

  public CustomMemento(int maxSize) throws Exception {
    if (maxSize <= 0) throw new Exception("maxSize should be above zero!");
    this.maxSize = maxSize;

    SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
    KeySpec spec = new PBEKeySpec(CRYPT_PASSWORD.toCharArray(), CRYPT_SALT.getBytes("UTF8"), 65536, 256);
    SecretKey secretKey = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");    

    cipher = Cipher.getInstance("AES");
    decipher = Cipher.getInstance("AES");
    
    cipher.init(Cipher.ENCRYPT_MODE, secretKey);
    decipher.init(Cipher.DECRYPT_MODE, secretKey);

  }

  public void setMaxSize(int maxSize) throws Exception {
    if (maxSize <= 0) throw new Exception("maxSize should be above zero!");

    this.maxSize = maxSize;
    int curSize = cache.size();
    while (curSize > maxSize) cache.remove(--curSize);
  }

  public void add(T obj) {
    if (cache.size() >= maxSize) cache.remove(0);
    cache.add(new MementoItem<T>(new Date().getTime(), obj));
  }

  public T getLast() {
    if (cache.size() == 0) return null;
    return cache.get(cache.size() - 1).data;
  }

  public T getFirst() {
    if (cache.size() == 0) return null;
    return cache.get(0).data;
  }

  public T getAt(int index) {
    if (index < 0 || index >= cache.size()) return null;
    return cache.get(index).data;
  }

  public void clearAll() {
    cache.clear();
  }

  public void removeLast() {
    if (cache.size() == 0) return;
    cache.remove(cache.size());
  }

  public void removeLast(int count) {
    if (cache.size() == 0) return;

    int curSize = cache.size();
    if (count >= curSize)cache.clear();
    else while (--count >= 0) cache.remove(--curSize);
  }

  public void removeWithoutLast(int count) {
    while (cache.size() > count) cache.remove(0);
  }

  public void save() {
    // byte[] bytes = "Hello World!!!".getBytes("UTF8");
    // byte[] encBytes = cipher.doFinal(bytes);
    // String str = Base64.getEncoder().encodeToString(encBytes);

    try (
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(bos);
      FileOutputStream fos = new FileOutputStream(PATH_TO_DATA, false)
    ) {
      oos.writeInt(maxSize);
      oos.writeObject(cache);
      oos.flush();

      byte[] bytes = bos.toByteArray();
      byte[] encBytes = cipher.doFinal(bytes);
      fos.write(encBytes);
      fos.flush();
    } 
    catch (Exception e) { }

  }

  public void restore() {
    // byte[] encBytes = Base64.getDecoder().decode("encode string")
    // byte[] decBytes = decipher.doFinal(encBytes);
    // String str = new String(decBytes);

    File file = new File(PATH_TO_DATA);
    if (!file.exists() || file.length() == 0) return;

    try (
      FileInputStream fis = new FileInputStream(PATH_TO_DATA)
    ) {
      byte[] encBytes = fis.readAllBytes();
      byte[] bytes = decipher.doFinal(encBytes);

      try (
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis)
      ) {
        int _maxSize = ois.readInt();
        ArrayList<MementoItem<T>> _cache = (ArrayList<MementoItem<T>>) ois.readObject();
  
        if (_cache != null && _maxSize > 0) {
          cache = _cache;
          maxSize = _maxSize;
        }
      }
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  }

  public void print() {
    int size = cache.size();
    int sizeLength = String.valueOf(size).length();

    for (int i = 0; i < size; i++) {
      MementoItem<T> item = cache.get(i);
      Date date = Date.from(Instant.ofEpochMilli(item.date));
      System.out.println(String.format("%-" + sizeLength + "d | %s | %s", i + 1, date, item.data));
    }
  }
}


