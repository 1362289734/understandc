package com.banyuan.InnerClass3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 3:03 下午
 */
public class Student{

  private  String name;

  public Student(String name) {
    this.name = name;
  }

  @Override
  public void  finalize() throws Throwable {

    super.finalize();

    System.out.println("---"+name+",被垃圾回收了");

  }



}
