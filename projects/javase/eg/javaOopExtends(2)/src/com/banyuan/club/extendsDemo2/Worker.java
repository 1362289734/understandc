package com.banyuan.club.extendsDemo2;

import com.banyuan.club.extendsDemo.Person;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 10:28 上午
 */
public class Worker  extends Person {

  @Override
  public void show() {
    System.out.println(country);
    //System.out.println(password+"---"+IDCard);
  }
}
