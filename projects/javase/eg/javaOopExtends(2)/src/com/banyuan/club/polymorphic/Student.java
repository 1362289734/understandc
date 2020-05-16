package com.banyuan.club.polymorphic;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 1:53 下午
 */
public class Student  extends Person {

  public   String   country="🇺🇸";
  @Override
  public void method() {
    System.out.println("我是子类的method方法...");
  }

}
