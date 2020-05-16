package com.banyuan.club.interfaceCode;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 10:53 上午
 */
public class TestInterface {

  public static void main(String[] args) {

//    Teacher  t=new Teacher(); //teacher 继承了 Person 又实现了接口
//    t.teach();

    Person person = new Teacher();//抽象类多态
    person.driver();

    TeacherInterface  teacherInterface=new Teacher(); //接口多态
    teacherInterface.teach();


    WorkInterface  workInterface=new Work2();
    workInterface.makeHouse();

    WorkInterface  workInterface1=new Work();
    workInterface.makeHouse();










  }


}
