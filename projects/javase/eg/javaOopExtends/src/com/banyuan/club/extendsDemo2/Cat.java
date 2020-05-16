package com.banyuan.club.extendsDemo2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 10:34 上午
 */
public class Cat extends Animal {
  //多继承和多重继承是一个意思    那java可以 多层继承

  private String name = "张三丰";

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public void method() {
    //System.out.println(name + "---" + this.name + "---");
    System.out.println(getName()+"---"+this.getName()+">>>"+super.getName());
    show();
    System.out.println(getAge());//这个 用的是父类的getAge()
  }
}

class Test {
  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.show();
  }
}




