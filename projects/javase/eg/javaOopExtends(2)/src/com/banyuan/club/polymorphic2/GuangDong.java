package com.banyuan.club.polymorphic2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 2:13 下午
 */
public class GuangDong  extends Person {
  @Override
  public  void  eat(){
    System.out.println("广东人喜欢吃肠粉...");
  }
  // 你们喜欢吃什么   喜欢什么运动  是哪人

  @Override
  public  void  play(){
    System.out.println("广东人喜欢打羽毛球...");
  }
}
