package club.banyuan.demo.entity;

import java.util.Objects;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/16 1:56 下午
 */
public class Person {
  private String name;
  private Integer age;
  private String  address;

  public Person() {
  }

  public Person(String name, Integer age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(name, person.name) &&
        Objects.equals(age, person.age) &&
        Objects.equals(address, person.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, address);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        '}';
  }
}
