package club.banyuan.com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/25 11:01 上午
 */
public class ExceptionDemo3 {

  public static void main(String[] args) throws Exception {  //如果最终在主方法上抛出 一个异常 那么就意味着是虚拟机处理异常了  异常后面的 代码不会再继续执行了
    Scanner  scanner=new Scanner(System.in);
    System.out.println("请输入第一个数:");
    int  num=scanner.nextInt();
    System.out.println("请输入第二个数:");
    int  num2=scanner.nextInt();

    try {
      getMod(num, num2);  //手动捕捉了异常  那就没有抛给虚拟机
    } catch (Exception e) {
      e.printStackTrace();
    }

    getMod(3, 0);

    System.out.println("哈哈是");
  }

  //方法上面声明异常  就是把错误抛给调用者处理(最终还是虚拟机处理)
  static   int   getMod(int  x,int  y) throws  Exception{
    return  x/y;
  }



}
