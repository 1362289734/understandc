package com.banyuan.club.polymorphic2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 2:13 下午
 */
public class YunNan extends Person {
  @Override
  public  void  eat(){
    System.out.println("云南人喜欢吃高蛋白食物...");
  }
  // 你们喜欢吃什么   喜欢什么运动  是哪人

  @Override
  public  void  play(){
    System.out.println("云南人喜欢打排球...");
  }
}
