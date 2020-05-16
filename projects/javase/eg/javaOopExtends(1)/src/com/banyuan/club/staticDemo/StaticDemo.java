package com.banyuan.club.staticDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 10:50 上午
 */
public class StaticDemo {

  /**
   * static  关键字
   *
   * @param args
   *  class文件只会被加载一遍
   *  class文件在内存中加载的时候  被static 修饰的成员立即加载    static修饰的成员叫  类成员 static
   *  修饰的成员 优先于对象存在、
   *   static  修饰的成员被所有的类对象共享 静态的方法只能调用静态成员 非静态的可以任意调用
   */

  //如果想要让类的成员(成员方法和成员变量)实现共享 那么就是用static
  private String name = "张张嘴";
  private String address = "西藏...";
  public static String country = "中国"; //被 static修饰的是属于class文件

  //jvm加载的是class文件

  public   static  void  method(){  //静态的成员会在虚拟机在家class文件的时候会被立即加载到内存中 并且只会加载一次
    System.out.println("我是静态方法..."+country);
  }


  public  void   method1(){
    System.out.println("---"+address+"---"+country);
    method();
  }


  static{
    System.out.println("我是静态代码块....");
  }


  {
    System.out.println("构造代码块....");
  }

  public StaticDemo() {
    System.out.println("构造方法代码块....");
  }

  public StaticDemo(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "StaticDemo{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
