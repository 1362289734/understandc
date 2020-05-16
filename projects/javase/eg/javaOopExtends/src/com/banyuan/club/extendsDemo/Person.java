package com.banyuan.club.extendsDemo;

import com.banyuan.club.extendsDemo2.Animal;
import com.banyuan.club.extendsDemo2.Cat;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 9:23 上午
 */
public class Person {

  public  String  country="中国";
  String   password="123456";
  protected  String  IDCard="张三丰";

  private  String  name;
  private  int   age;
  private  String  sex;
  private  String  address;

  public Person(String name, int age, String sex, String address) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.address = address;
    System.out.println("我是父类的有参构造方法....");

  }

  public Person() {
    System.out.println("我是父类的无参构造方法....");
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

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public  void  show(){  //根据1号功能
    System.out.println("我是父类的show方法...");
  }


  private void  test(){
    System.out.println("我是父类的私有化方法...");
  }


  void method(){

  }


  public Animal  createAnimal(){

    return new Cat();
  }



  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", sex='" + sex + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
