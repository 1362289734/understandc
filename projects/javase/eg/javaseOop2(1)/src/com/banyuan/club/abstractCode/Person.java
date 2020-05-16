package com.banyuan.club.abstractCode;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 9:58 上午
 */
public abstract class Person {
  /*
     刚刚的案例  我们使用了person里面 功能但是没有使用person里面的实现方法
     意味着 这些方法在某些情况下可以不写具体的实现步骤

     在子类重写父类方法的时候   没有使用父类的实现功能 我们可以把父类的实现步骤给省略
     只提供一个功能  具体的实现方法由子类自己实现

     abstract 不能跟私有化一起使用

     抽象类里面一般提供是抽象方法   具体实现靠子类

     如何对 普通的类和抽象类进行对比
          从 成员变量   成员方法  构造方法  静态方法分析 包括能不能创建对象

   */

  private   String name="张三";
  private   String  address="地下";

  public   static  final  String  COUNTRY="中国";

  public  Person(){
    System.out.println("我是抽象类的构造方法...");
  }


  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public  void  method(){
    System.out.println("我是抽象类里面的普通方法...");
  }

  public   static void  show(){
    System.out.println("我是抽象类里面的静态方法...");
  }


  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }



  public abstract void eat();

  public abstract void sleep();

  public abstract void run();

  public abstract void driver();







}
