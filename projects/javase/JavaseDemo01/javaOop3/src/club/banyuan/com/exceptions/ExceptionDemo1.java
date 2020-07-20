package club.banyuan.com.exceptions;

import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/25 10:09 上午
 */
public class ExceptionDemo1 {


  public static void main(String[] args) {
    int i;
    //System.out.println(i); //程序报错
    int[] arr = new int[5];
    // System.out.println(arr[7]);
    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7

    User[] str = new User[2];

    //Exception in thread "main" java.lang.NullPointerException
//    for (User s : str) {
//      System.out.println(s.toString());
//    }

    Scanner  sc=new Scanner(System.in);
    int  key=sc.nextInt();
    /**
     assd
     Exception in thread "main" java.util.InputMismatchException
     */
    System.out.println(key);

  }
}
