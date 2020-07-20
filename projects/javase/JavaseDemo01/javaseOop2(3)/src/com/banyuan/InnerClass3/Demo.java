package com.banyuan.InnerClass3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 2:59 下午
 */
public class Demo {

  public static void main(String[] args) {
//    Person person=new PersonImpl();
//    System.out.println(person.getQuery());
    //请问   如果PersonImpl这个类 只被使用了一次 那么请问  这个类在整个程序中可不可以看成是一个累赘


   // Student  stu=new Student();
    //如上学生案例 如果此学生案例也只被使用了一遍,这个学生案例在内存是不是一直存在 知道程序结束才会消失
    // 所以java 有一个垃圾回收机制  如果此对象不再被使用或者是此对象值被使用一次 那么就会进行垃圾回收

    //new  Student("哈哈是");  //匿名对象 没有名字的对象 垃圾回收机制会进行垃圾回收

      //System.gc();
      //手动启动垃圾回收机制  作为一个程序员可以手动启动垃圾回收机制  一般情况下不需要开发人员自己来启动
      //一般默认启动



    //如果只是对Person 抽象类的方法使用一次 没必要创建一个子类专门来实现其方法

    // 创建匿名对象一般是针对于抽象方法的(抽象类和接口)

//    String   st=new Person() {
//      @Override
//      public String getQuery() {
//        return "哈哈哈是";
//      }
//    }.getQuery();
//    System.out.println(st);

    /**
     * new Person() {
     *       @Override
     *       public String getQuery() {
     *         return "哈哈哈是";
     *       }
     *     }
     *
     *     这个叫匿名对象
     */

    Person  person=new Person() {
      @Override
      public String getQuery() {
        return "张三丰";
      }
      @Override
      public String select(String name) {
        return name+"你好";
      }
      @Override
      public void query(String address) {
        System.out.println("哈撒给...");
      }
    };

    System.out.println(person.select("王五"));


    //课后小练习:使用接口 里面定义几个抽象方法... 去实现一下 匿名内部类


    //接下来上的课程:内部类在的好处以及在实际开发中的应用



  }

}

abstract class Person1{
  public  abstract void show();
}
class PersonDemo{
  public  void  method(Person1 person){  //这里接受的是Person1及其子类对象
    person.show();
  }
}

class Test{
  public static void main(String[] args) {
    PersonDemo  p=new PersonDemo();
    p.method(new Person1() {
      @Override
      public void show() {
        System.out.println("我是你爸爸");
      }
    });
  }
}



