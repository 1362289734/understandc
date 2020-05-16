package com.banyuan.club.oop2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/21 1:37 下午
 */
public class Car {

  //至此 一个标准的封装类就完成了    私有化属性和公有化方法的集合就叫封装
  private   String  carName;
  //全局变量(成员变量) 是属于对象的  而对象的创建是在内存里面一个叫堆的地方  计算机会给堆里面的对象进行初始化赋值
  private   String  carAddress;
  private   double  carPrice;
  private   double  carHeight;

  //变量一定要在初始化的之后才能使用   只针对于局部变量

  public  void setCarName(String  carName){
    //局部变量被优先使用
    // this 表示当前对象  就是表示当前对象在内存里面的存储区域 这块区域里面有Car对象所属的属性
    this.carName=carName;
  }
  public  String   getCarName(){
    return  carName;
  }

  public  void setCarAddress(String  carAddress){
    this.carAddress=carAddress;
  }
  public  String   getCarAddress(){
    return  carAddress;
  }

  public  void setCarPrice(double carPrice){
    //可以做判断  如果价格不合理 或者是负数
    this.carPrice=carPrice;
  }
  public  double  getCarPrice(){
    return  carPrice;
  }

  public  void setCarHeight(double carHeight){
    //做判断
    this.carHeight=carHeight;
  }
  public  double  getCarHeight(){
    return  carHeight;
  }

//  public String  show(){
//    //一般情况下 在开发的时候类里面不能有输出信息
//   return "车名:"+getCarName()+",产地:"+getCarAddress()
//        +",价格:"+getCarPrice()+",高度:"+getCarHeight();
//
//  }


  @Override
  public String toString() {
    return "Car{" +
        "carName='" + carName + '\'' +
        ", carAddress='" + carAddress + '\'' +
        ", carPrice=" + carPrice +
        ", carHeight=" + carHeight +
        '}';
  }


  //创建了 Car对象内存做了什么事   Car   car =new Car();
  /*
    1.加载类文件(Car.class) 到内存中 一个叫方法区的存储空间
    2.在内存中一个叫栈的存储空间 开辟一个 Car  car变量的存储空间
    3.在堆里面创建对象,计算机给对象赋初始化值
    4.把堆的存储空间里面的对象的地址赋值给栈里面开辟的car空间
   */




}

