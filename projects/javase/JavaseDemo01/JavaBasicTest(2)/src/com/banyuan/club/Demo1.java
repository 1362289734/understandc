package com.banyuan.club;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/21 9:18 上午
 */
public class Demo1 {
//循环输入10个数(50以内),统计每个数出现的次数

  public static void main(String[] args) {
//    int  [] arr=new int[50];
//
//    for (int i = 0; i <10; i++) {
//      int  num=(int)(Math.random()*50+1);
//      for (int j = 0; j < 50; j++) {
//        if(num-1==j){
//          arr[j]++;
//        }
//      }
//    }
//
//    for (int i = 0; i < arr.length; i++) {
//      if(arr[i]!=0){
//        System.out.println((i+1)+"出现的次数为:"+arr[i]);
//      }
//    }


    int  [] []  arr=new  int[5][5];
    for (int i = 0; i < arr.length; i++) { //行
      for (int j = 0; j <=i; j++) { //列
          if(j==0||j==i){
            arr[i][j]=1;//第一列和最后一列都是1
          }else{
              arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
        }
      }
    }

    for (int i = 0; i <5; i++) {
      for (int j = 0; j <=i; j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
  }
}
