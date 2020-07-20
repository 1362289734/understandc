package club.banyuan.demo.file;

import java.io.Serializable;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/6 9:41 上午
 */
public class Student implements Serializable {
  private  String name;
  private  String address;
  private  Integer number; //编号
  private  Integer age;

  public Student() {
  }

  public Student(String name, String address, Integer number, Integer age) {
    this.name = name;
    this.address = address;
    this.number = number;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", number=" + number +
        ", age=" + age +
        '}';
  }
}
