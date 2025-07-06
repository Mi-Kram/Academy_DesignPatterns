package File;

public class FileItemInfo {
  protected String root = "";
  protected String name = "";
  protected long date = 0;
  protected long size = 0;
  protected boolean isFile = true;

  public FileItemInfo() { }

  public FileItemInfo(String root, String name, long date, long size, boolean isFile) {
    this.root = root;
    this.name = name;
    this.date = date;
    this.size = size;
    this.isFile = isFile;
  }

  public String getRoot() {
    return root;
  }
  
  public void setRoot(String root) {
    this.root = root;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getDate() {
    return date;
  }

  public void setDate(long date) {
    this.date = date;
  }

  public long getSize() {
    return size;
  }

  public void setSize(long size) {
    this.size = size;
  }

  public boolean isFile() {
    return isFile;
  }

  public void setIsFile(boolean isFile) {
    this.isFile = isFile;
  }
}
