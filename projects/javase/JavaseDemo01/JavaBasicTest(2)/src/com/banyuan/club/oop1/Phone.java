package com.banyuan.club.oop1;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/21 11:05 上午
 */
public class Phone {

  //以下称之为属性  也叫 特征
    String  brand="华为";//手机品牌
    String  address="上海";//产地
    private double  price=3999;//价格  private修饰的属性 只能在本类中访问
    String  color="黑色";//手机颜色

  //手机的功能  行为---->函数 (方法...)
    public  void  call(){
      System.out.println("手机在打电话..."+price);
    }
    public  void  playMusic(){
      System.out.println("手机在放歌...");
    }
    public  void playVideo(){
      System.out.println("手机在放电视....");
    }

    //提供一个对外的获取方法

  public double getPrice() {
    return price;
  }

  //提供一个对外的访问方法
    public  void  setPrice(double  outPrice){
      if(outPrice>0){
        price=outPrice;
      }else {
        System.out.println("兄弟,别闹....");
      }
    }
}
class TestPhone{

  public static void main(String[] args) {
    // 类名  变量名=new 类名();
    //变量名.属性  或者 变量.函数名(也叫方法名)
//    Phone  phone=new Phone();  //创建Phone对象
//    // System.out.println(phone.brand);
//    phone.brand="";//可以个模板的初始值进行替换
//    phone.price=45.6;
//
//    System.out.println(phone.brand=""+",价格"+phone.price);
//
//    phone.call();
//    phone.playVideo();
//
//    Phone  p=new Phone();
//    p.brand="小米";
//    p.price=567;
//    p.address="上海";
//    p.color="银色";
//
//
//    System.out.println("品牌:"+p.brand+",价格:"+p.price+",产地:"+p.address+",颜色:"+p.color);


    Phone p=new Phone();
    //p.price=-90;//如果再次输入一个非法的数值 那么数据就不对了  能不能把设置值的权限 给降下来 不让他的类直接访问其属性
    // private
    p.setPrice(120);
    //p.call();

    //在调用者这个类中 输出价格
    double  dou=p.getPrice();
    System.out.println(dou+"--"+p.getPrice());

  }
}

