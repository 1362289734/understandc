package com.banyuan.club.interfaceCode2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 11:10 上午
 */
public class MyAbstractClassSon  extends  MyAbstractClass{

  //抽象类可以继承接口   抽象类里面可以实现接口里面的方法也可以不用实现
  //因为接口里面是抽象方法  抽象类里面也可以有抽象方法  具体实现交给抽象类的子类来实现

  @Override
  public void show(String name, String password) {

  }

  @Override
  public void method() {

  }
}
