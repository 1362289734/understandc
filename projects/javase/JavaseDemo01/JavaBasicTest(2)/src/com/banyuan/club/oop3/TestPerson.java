package com.banyuan.club.oop3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/21 2:41 下午
 */
public class TestPerson {

  public static void main(String[] args) {
    Person person = new Person();  //对象被构造器创建
    // 请问  这个对象时如何来的 被谁创建的？  被一个叫构造函数的创建的

    // 有参构造器:边创建对象的同时 边给对象里面的成员变量进行赋值、
//    Person person1 = new Person("张三", "下水道...");
//
//    System.out.println(person1.toString());

    /*
        1.如果一个类里面没有一个显示的构造函数 那么 系统会默认的 提供一个无参构造函数
        2.如果类里面有构造器(不管是无参构造器还是有参的) 那么系统不会自动提供无参构造器
        3.如果一个类里面有 有参构造器 那么 就不能通过无参构造器创建对象  相反 如果只有一个无参构造 那么就不能通过有参构造器来创建对象
     */

//    person1=new Person("李四");
//
//    Tool  tool=new  Tool();



  }


}
