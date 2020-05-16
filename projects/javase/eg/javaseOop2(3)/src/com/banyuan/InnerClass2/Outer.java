package com.banyuan.InnerClass2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 2:11 下午
 */
public class Outer {

  private  String username="张三";
  private  static  int age=21;

  public  void   show(){
    //局部内部类的位置在方法里面

    final  String  COUNTRY="中国";  //方法里面的局部变量和局部内部类一块使用的时候变成了常量
    //为什么局部变量被final修饰的原因
    /**
     *  因为局部变量会随着方法的调用完毕而消失,这个时候,局部对象并没有里面从堆内存里面消失,
     *  还要使用这个变量。为了让数据还能继续被使用,就使用final修饰 让局部变量变成常量,加载到常量池里面.
     */
    class  Inner{
        private  String  address="下水道";
        public   void  show2(){
          username="往";
          address="赵六";
          //COUNTRY="美国";
          System.out.println("我是局部内部类的方法...."+address);
        }
    }
    Inner  inner=new Inner();
    inner.show2();
  }
}

class Test{

  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.show();

  }
}
