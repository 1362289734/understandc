package com.banyuan.club;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 9:14 上午
 */
public class Demo {

  public static void main(String[] args) {
      A  a=new  B();
      B  b=(B)a;
      b.method();

  }
}
class A{
  public  void  show(){
    System.out.println("fu");

  }}

class  B  extends A{

  public  void  show(){
    System.out.println("z");

  }
  public  void  method(){
    System.out.println("zi特有的...");
  }

}