package club.banyuan.demo.packagingClass;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/16 2:59 下午
 */
public class CharacterDemo {

  /*
    什么是包装类？
      其实就是java为了满足各个数据之间的转换操作而对八种基本数据类型进行的封装,封装得到的类就是包装类
      byte   short  int       long  float  double  char       boolean
      Byte   Short  Integer   Long  Float  Double  Character  Boolean
   */
  public static void main(String[] args) {

    boolean    flag=Character.isDigit('4');  //判断该字符是否是数字

    System.out.println(flag);

    String  str="asdas21kjansd3";

    //找出以上非数字的字符并且重新拼接

    //以后做开发的时候  基本数据类型都会使用包装类来进行定义

  }
}
