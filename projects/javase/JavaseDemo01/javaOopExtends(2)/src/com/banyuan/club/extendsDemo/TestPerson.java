package com.banyuan.club.extendsDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 9:24 上午
 */
public class TestPerson {

  public static void main(String[] args) {
//    Person  person=new Person();
//    person.setName("黄大仙");
//    person.setAge(12);
//    person.setAddress("长白山");
//    person.setSex("雄性");
//
//    System.out.println(person.toString());
//
//    Student    student=new Student();
//    student.setName("黄芪甲");
//    student.setAddress("下水道..");
//    student.setAge(34);
//    student.setSex("雄性");
//    System.out.println(student.toString());
//
//    Employee  employee=new Employee();
//    employee.setName("王义文");
//    employee.setAddress("下水道旁边的垃圾桶...");
//    employee.setAge(24);
//    employee.setSex("雄性");
//
//    System.out.println(employee.toString());


    //请问  子类有没有继承父类的构造方法....

//    Employee  employee=new Employee();
//    employee.setName("张三");


    Employee  employee1=new Employee("战三",12,"下水道...","阿萨撒所");

   // System.out.println(employee1.toString());
    System.out.println(employee1.country);

    employee1.show();

  }

}
