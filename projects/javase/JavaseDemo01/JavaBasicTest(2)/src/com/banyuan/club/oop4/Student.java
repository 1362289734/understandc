package com.banyuan.club.oop4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/21 3:11 下午
 */
public class Student {

  //对象数组
  private String name;
  private String address;
  private int   age;
  private  int  score;//



  public Student(String name, String address, int age) {
    this.name = name;
    this.address = address;
    this.age = age;
  }

  public Student() {
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", age=" + age +
        '}';
  }
}
