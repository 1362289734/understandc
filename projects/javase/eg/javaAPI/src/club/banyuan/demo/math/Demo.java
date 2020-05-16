package club.banyuan.demo.math;

import java.util.Random;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/25 3:21 下午
 */
public class Demo {

  public static void main(String[] args) {
   double   dou= Math.random(); //得到的是double类型的随机数  随机数的值在0~1之间
    //我想要得到 10以内的随机数
    int   num=(int)(Math.random()*10+1);
    System.out.println(num);

    System.out.println("得到的是绝对值:"+Math.abs(-2));

    System.out.println(Math.ceil(-9.01));  //向上取整数  只不过这个整数是double类型

    System.out.println(Math.floor(9.99999));
    System.out.println(Math.floorDiv(13, 4));
    System.out.println(Math.floorMod(2, 3));

   // int r = x - floorDiv(x, y) * y;
    System.out.println(Math.round(4.467));

    Random   random=new Random(1000);  //1000表示随机数一个种子  1000毫秒之后得到的数据  而且是固定数据
    System.out.println("----"+random.nextInt(10));



  }
}
