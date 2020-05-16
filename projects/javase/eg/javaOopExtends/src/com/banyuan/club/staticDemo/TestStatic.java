package com.banyuan.club.staticDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 10:55 上午
 */
public class TestStatic {

  public static void main(String[] args) {

    //StaticDemo.class  所有的 StaticDemo对象都是根据同一个class文件进行创建的

    StaticDemo staticDemo = new StaticDemo();
    System.out
        .println(staticDemo.getAddress() + "," + staticDemo.getName() + "," + staticDemo.country);

   // staticDemo.country="美国";
    StaticDemo.country="美国";

    StaticDemo  staticDemo1=new   StaticDemo();
    System.out.println(staticDemo1.country);
    //在同一个程序中  只要是对静态的成员进行了修改 那么就从修改的那一行开始起作用




  }

}
