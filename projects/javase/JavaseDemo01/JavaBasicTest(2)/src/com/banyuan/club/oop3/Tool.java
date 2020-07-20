package com.banyuan.club.oop3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/21 2:53 下午
 */
public class Tool {

  //演示方法的重载   求和

  public  double  sum(int  x,double y){

    return x+y;
  }

  public  double  sum(double  x,int y){

    return x+y;
  }

  public  int  sum(int  x,int y,int z){

    return x+y+z;
  }

  public  double  sum(int  x,int y,double q){

    return x+y+q;
  }

  public  int  sum(int  x,int y,int  z,int w){

    return x+y+z+w;
  }



}
