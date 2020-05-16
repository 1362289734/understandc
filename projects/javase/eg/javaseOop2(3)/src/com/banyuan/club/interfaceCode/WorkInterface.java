package com.banyuan.club.interfaceCode;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 10:50 上午
 */
public interface WorkInterface {

  final  static public  String  name="沾上干"; //只能是静态常量

  //建筑工人
  public  abstract  void makeHouse();  // public  abstract 可不写 默认添加

  //不能有普通方法  不能有静态方法

  //不能有构造方法   在jdk1.8之前接口里面只要抽象方法  jdk1.8之后接口里面可以有普通方法


}

class  Test{

  public static void main(String[] args) {


  }
}