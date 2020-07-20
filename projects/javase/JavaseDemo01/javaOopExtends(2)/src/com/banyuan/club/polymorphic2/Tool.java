package com.banyuan.club.polymorphic2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 2:16 下午
 */
public class Tool {

  private   Tool(){  //构造器私有化 不能创建对象  只能是通过调用静态方法....

  }

//  public  static void   show1( NanJing  nanJing  ){
//      nanJing.eat();
//      nanJing.play();
//  }
//
//  public  static void   show1( GuangDong  guangDong  ){
//    guangDong.eat();
//    guangDong.play();
//  }
//  public  static void   show1( YunNan  yunNan  ){
//    yunNan.eat();
//    yunNan.play();
//  }
//  public  static void   show1( GuiZhou  guiZhou  ){
//    guiZhou.eat();
//    guiZhou.play();
//  }

  public static void show(Person person) {  //括号里能接受本类对象及其子类对象
    person.eat();
    person.play();
  }



}
