package com.banyuan.club.polymorphic;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 1:48 下午
 */
public class Person {

  /*
   *  多态前提:
   *      1.子类继承父类
   *      2.子类重写父类方法
          3.父类引用指向子类对象
   */
    public   String   country="🇨🇳";
    private  String   name="父类名字叫汪晟";
    private  String   address="父类在下水道...";

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public Person() {
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


  public  void   method(){

    System.out.println("我是父类的method方法...");

  }
  public static  void   show(){

    System.out.println("我是父类的静态方法...");

  }








  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
