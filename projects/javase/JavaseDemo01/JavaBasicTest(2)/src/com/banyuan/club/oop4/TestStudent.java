package com.banyuan.club.oop4;

import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/21 3:13 下午
 */
public class TestStudent {

  public static void main(String[] args) {
    int  []arr=new  int[20];
    int []arr2={123,341,2,4};
    String  [] strings=new String[12];

    //现在把学生对象存放到数组里面去
    Student [] student=new  Student[5];
    student[0]=new  Student("张三","垃圾桶",34);
    student[1]=new  Student("张三1","垃圾桶1",24);
    student[2]=new  Student("张三2","垃圾桶2",14);
    student[3]=new  Student("张三3","垃圾桶3",4);
    student[4]=new  Student("张三4","垃圾桶4",44);

    for (int i = 0; i <student.length; i++) {
      System.out.println(student[i].getName()+",--"+student[i].getAddress());
    }



    Scanner  scanner=new Scanner(System.in);
    System.out.println("请输入数据:");
//    int  num=scanner.nextInt(); //表示从键盘录入数据
//    System.out.println("-----"+num);


   // System.out.println("请输入数据:");
    //String   str=scanner.next();//表示获取字符串
    String  str=scanner.nextLine();//表示获取一行字符串   除了换行符\n

    System.out.println("--------"+str);






  }


}
