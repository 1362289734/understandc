package com.banyuan.club.polymorphic;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 1:54 下午
 */
public class TestStudent {

  public static void main(String[] args) {
//    Student  student=new Student();
//    student.method();

    Person person = new Student();//多态
    person.method();
    System.out.println(person.country);

    /**
     *  1.成员变量   在编译的时候看左边  运行的时候也看左边
     *  2.成员方法   编译时看左边   运行的时候看右边
     *  3.静态方法   编译时看左边   运行时看左边
     */

    /* 如果方法在子类中有,先用子类的
     *
     */
    //只要是发生继承 那么父类类型就可以用来接受子类对象
    //Person  p=new Worker();

    Person   p=new  Son();
    Worker  worker=new  Son();





  }


}
