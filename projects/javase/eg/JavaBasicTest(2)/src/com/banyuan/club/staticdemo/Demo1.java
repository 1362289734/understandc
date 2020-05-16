package com.banyuan.club.staticdemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/21 3:58 下午
 */
public class Demo1 {

  /*
    static
        被static修饰符修饰的是属于类的  不属于任何对象  被所有的类的对象共享
        如果被static 修饰的成员变量被其他类对象修改  那么从修改的那一行开始  后面数据都会被影响

      被static 修饰的成员 在什么时候加载到内存里面？
          随着class文件加载而加载

      静态代码块中不能出现非静态的成员和方法。
      普通方法里面可以出现静态的成员和方法.

      静态代码块是用来初始化类的，也就是对象的模板。模板还没有创建好当然不可能创建对象。
      而非静态的成员和方法都是依赖具体对象的，因此不可能出现在静态代码块中。



   */

  public String address = "王五....";

  public static String username = "张三";

  //静态代码块和构造代码块在内中 任意一个位置
  /*
      静态代码块 > 构造代码块 > 构造函数代码块 执行顺序


   */
  static{
    System.out.println("我是static代码块...");
  }

  {
    System.out.println("构造代码块....");
  }


  public static   void show()
  {
   // System.out.println("我是静态方法...."+address);
    System.out.println("我是静态方法...."+username);



  }

  public  void  run(){
    System.out.println("非静态方法调用静态属性username:"+username);
    show();
  }



  public Demo1() {
    System.out.println("我是构造函数代码块....");
  }


  public static void staticMethod() {
    /*
    静态方法内部也不能使用this，因为this指代对象，静态方法调用的方法的时候都没有创建过对象，
    所以不存在this。静态方法中可以new对象，然后使用这个对象的非静态方法和成员
     */
    //System.out.println("static method called"+this.address);
  }

}

class TestStatic {

  public static void main(String[] args) {
    //对被static修饰的属性的访问
//    Demo1   demo=new  Demo1();  创建对象时根据一个类名.class文件来创建
//    而 被static修饰的 属于 类名.class文件

//    System.out.println(demo.username);

    // System.out.println(Demo1.username);
    Demo1 demo1 = new Demo1();
    demo1.address="垃圾桶...";
    demo1.username="张三丰";
    System.out.println(demo1.address+"---"+demo1.username);



    Demo1 demo2 = new Demo1();

    System.out.println(demo2.address+"---"+demo2.username);



    Demo1.staticMethod();




  }
}
