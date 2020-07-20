package com.banyuan.club.polymorphic2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 2:12 下午
 */
public class NanJing  extends Person {
  @Override
  public  void  eat(){
    System.out.println("南京人喜欢吃糖醋排骨");
  }
  // 你们喜欢吃什么   喜欢什么运动  是哪人

  @Override
  public  void  play(){
    System.out.println("南京人喜欢打乒乓球...");
  }


}
