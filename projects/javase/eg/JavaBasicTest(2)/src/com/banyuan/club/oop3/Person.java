package com.banyuan.club.oop3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/21 2:41 下午
 */
public class Person {

  private String name;
  private String address;

  /*
      访问修饰符  类名(){

      }

      访问修饰符  类名(参数){
        成员变量=参数
          ...
      }


   */
  public Person() {
    this("王五");
    System.out.println("我是Person无参构造器...");
  }
  public Person(String name, String address) {
    this.name = name;
    this.address = address;
    System.out.println("Person有参构造器...");
  }
  public Person(String name) {
    this.name = name;
    System.out.println("Person有参构造器...2");
  }

/*
    由上述案例咱们可以引出一个知识点 叫 方法的重载:
        方法名一样  括号里面的参数列表不一样  跟返回值 无关的 就叫方法的重载
        好处:便于阅读   提高了可读性
 */


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

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
