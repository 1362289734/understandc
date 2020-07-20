package com.banyuan.club.abstractCode;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 9:58 上午
 */
public class Demo1 {


  public static void main(String[] args) {

//    Person   p=new Teacher();
//    Person   p1=new Work();
//    p.driver();
//    p1.driver();

    Person  person=new Work();//
    //抽象类不能创建对象 但是可以通过其无参构造器去访问抽象类在内存的区域里面的成员

    System.out.println(Person.COUNTRY);



  }

}
