package com.banyuan.innerClass;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 1:46 下午
 */
public class Outer {

  /*
    什么是内部类？把类定义在类的内部,被定义在内部的这个类叫内部类
    例如:class  A{  class B{}   }

    内部类所在的位置:
      a.成员内部类(跟成员变量处于统一等级)
      b.局部内部类(方法内部)
   */
  private String name = "我是外部类的name";
  public String address = "下水道...";
  private static int age = 12;

  /*
      内部类访问外部类成员情况:
          1.内部的成员方法可以访问外部的成员变量和成员方法
              如果内部类的成员(包括成员变量和成员方法)和外部类的成员重名了
              那就使用 外部类名.this.成员
          2.内部类的普通方法可以访问外部类的静态成员
          3.内部类的静态方法是建立在内部类也是一个静态的情况下(静态内部类)
              能访问外部类的静态车成员

   */
  public void show() {
    System.out.println("我是外部类的show方法...");
  }

  public static void showInfo() {
    System.out.println("我是外部类的静态方法...");
  }

  static class Inner2 {

    public static void login(String name, String password) {
      System.out.println("----" + age);
    }

    public void info() {

    }

  }

  //这个是成员内部类
  class Inner {  //也会被加载到内存中去    内存中有一个 Inner.class的 文件

    private String name = "我是内部类的name";

    public void show() {
      System.out.println("我是内部类的show方法..." + age);
      showInfo();
    }


    public void method() {
      //Outer.this这种写法表示外部类对象
      System.out.println("我是内部类的method方法..." + Outer.this.name + "," + Outer.this.address);

      Outer.this.show();

    }

    public Inner() {
    }

    public Inner(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "Inner{" +
          "name='" + name + '\'' +
          '}';
    }
  }

}

class TestInner {

  public static void main(String[] args) {
    //如何在外部去使用内部类的成员,格式:外部类名.内部类名  对象名=new 外部类名().new 内部类名();
    Outer.Inner oi = new Outer().new Inner(); //得到的是内部类的对象
    oi.method();
    oi.setName("王五");
    System.out.println(oi.toString());

    //静态内部类如何访问 非静态成员
    Outer.Inner2 oi2 = new Outer.Inner2();//---->new   Inner2();
    oi2.info();

    //访问静态成员: 外部类目.内部类名.成员
    Outer.Inner2.login("是斩杀", "21312");


  }
}


