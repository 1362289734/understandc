package com.banyuan.club.extendsDemo;

import com.banyuan.club.extendsDemo2.Animal;
import com.banyuan.club.extendsDemo2.Cat;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 9:20 上午
 */
public class Employee extends Person {
  //command+n

  /**
   * 子类没有继承父类的构造方法.... 子类是通过super()来访问父类的无参构造 如果子类没有无参构造器或者是只有一个无参构造器那么创建子类对象只能通过无参构造器来创建
   * <p>
   * 如果父类只有有参构造器 那么子类只能有有参构造器
   * <p>
   * 如果子类的有参构造器里面没有super(参数...) 那么子类默认的访问是父类的 无参构造器
   * <p>
   * 创建子类对象的同时要访问父类的无参构造方法(访问父类的无参构造方法其实就是为了引用父类的成员)
   * <p>
   * 问题: 1.父类和子类如果同时出现相同的成员(变量和方法)  怎么确定调用的是父类还是子类的成员(变量和方法) 结论1:如果父类和子类同时出现相同的成员变量名,那么优先使用子类自己的
   * 结论2:如果同时出现相同的方法名时,还有优先使用子类自己的(不考虑静态方法)
   * <p>
   * <p>
   * 重写的规定
   *    子类不能重写父类的private方法
   *    重写的方法名和参数列表必须与父类中完全相同
   *    重写的方法的访问修饰符不小于父类被重写方法的访问修饰符
   *  返回值
   *    父类方法是void或基本数据类型，子类重写的方法必须和父类方法保持一致
   *    父类方法是类A的对象，那么子类重写的方法必须是类A的对象或类A子类的对象
   *  异常（后续介绍）
   *    父类方法不抛出异常，则子类重写的方法也不能抛出异常 子类重写方法抛出的异常必须是父类方法抛出的异常类，或是其子类
   */

//  public Employee() {
//    //super(); //子类里面默认是隐藏super()
//    System.out.println("我是子类的无参构造方法....");
//  }

  public String country = "美国";


  public Employee(String name, int age, String sex, String address) {
    // super(name, age, sex, address);  //表示访问父类有参构造器
    System.out.println("子类的有参构造器....");
  }

  //方法重写  为什么需要方法重写：发生在继承的关系中,子类的方法和父类的方法一模一样(方法名,方法参数,返回值,访问修饰符[需要注意])
  @Override
  public void show() {
    System.out.println("我是子类的show方法..."+password+"---"+IDCard);
  }
  //父类的一号功能的方法  show有没有被继承过来  show()也被继承了...

//  private void test() {
//    System.out.println("我是父类的私有化方法...");
//  }

  @Override
  void  method(){

  }

  @Override
  public Cat  createAnimal(){
    return  new Cat();
  }


}
