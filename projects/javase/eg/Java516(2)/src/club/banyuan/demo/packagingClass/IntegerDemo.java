package club.banyuan.demo.packagingClass;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/16 2:59 下午
 */
public class IntegerDemo {

  /*
    什么是包装类？
      其实就是java为了满足各个数据之间的转换操作而对八种基本数据类型进行的封装,封装得到的类就是包装类
      byte   short  int       long  float  double  char       boolean
      Byte   Short  Integer   Long  Float  Double  Character  Boolean
   */
  public static void main(String[] args) {

    String str = "1100110";
    int val = 34;
    //求出两个数相加之和
    Integer integer = new Integer(str);    //装箱   包装 把括号里面 数据包装成Integer类型

    int val1 = integer.intValue();//得到数字字符串中的 数字   //拆箱

    System.out.println(val + val1);


    Integer i = 12;  //Integer  i=new  Integer(i);  自动装箱
    Integer value = 12;
    //int sum = i + value;  //i.intValue();  自动拆R箱
    //System.out.println("和=" + sum);

    int x=i.compareTo(value);
    System.out.println("-------------||||||"+x);

    int   in=Integer.parseInt(str,2);
    System.out.println("____>>>>"+in);


    Integer  u=Integer.valueOf(str);
    System.out.println(u+3);

    //把一个数字字符串转换成数字  可以有三种简单的方式

  }


}
