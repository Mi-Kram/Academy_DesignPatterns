import java.io.Serializable;

public class Person implements Serializable {
  String name = "";
  Integer age = 0;
  String address = "";
  String phone = "";

  public Person() { }

  public Person(String name, Integer age, String address, String phone) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.phone = phone;
  }

  @Override
  public String toString() {
    return String.format("%s,  %d,  %s,  %s", name, age, address, phone);
  }

}
