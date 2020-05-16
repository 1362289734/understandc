package com.banyuan.club.interfaceCode;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 9:59 上午
 */
public class Work  extends Person implements WorkInterface
{

  public Work() {
    System.out.println("我是子类的无参构造...");
  }

  @Override
  public void eat() {
    System.out.println("这是工人的吃饭行为...");
  }

  @Override
  public void sleep() {
    System.out.println("这是工人的睡觉行为...");
  }

  @Override
  public void run() {
    System.out.println("这是工人的奔跑行为...");
  }

  @Override
  public void driver() {
    System.out.println("这是工人的驾驶行为...");
  }


  @Override
  public void makeHouse() {
    System.out.println("这是工人的造房子技术1...");
  }
}
