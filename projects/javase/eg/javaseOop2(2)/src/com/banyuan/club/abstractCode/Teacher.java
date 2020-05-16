package com.banyuan.club.abstractCode;

import com.banyuan.club.interfaceCode.TeacherInterface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/11 10:00 上午
 */
public class Teacher extends  Person implements TeacherInterface {


  @Override
  public void eat() {
    System.out.println("这是老师的吃饭行为...");
  }

  @Override
  public void sleep() {
    System.out.println("这是老师的睡觉行为...");
  }

  @Override
  public void run() {
    System.out.println("这是老师的奔跑行为...");
  }

  @Override
  public void driver() {
    System.out.println("这是老师的驾驶行为...");
  }


  @Override
  public void teach() {
    System.out.println("这是老师的教书方法...");
  }
}
