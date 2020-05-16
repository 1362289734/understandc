package com.banyuan.club.extendsDemo2;

import com.banyuan.club.extendsDemo.Person;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 10:30 上午
 */
public class Animal {

  private String name = "李思思";
  private int age = 12;

  public Animal() {
  }

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public void show() {
    System.out.println(new Person().country);
  }

}
