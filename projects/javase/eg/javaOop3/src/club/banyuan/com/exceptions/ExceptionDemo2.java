package club.banyuan.com.exceptions;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/25 10:25 上午
 */
public class ExceptionDemo2 {

  public static void main(String[] args) {

    String[] str = new String[5];

//    try {
//      str[5]="张三"; //程序没有出错    如果出错肯定不是 编译时异常
//      System.out.println(str[5]);  //如果出线了运行时异常 后面的程序还会不会继续执行
//    }catch (ArrayIndexOutOfBoundsException e){
//      e.printStackTrace();
//    }finally {
//      //一般情况这里是用来对资源进行释放的  学到文件流就知道了问什么要对资源进行释放
//      System.out.println("不管出现什么问题finally里面的语句都会执行...");
//    }
//    //如果使用try{}catch{}后面不管怎么都会执行
//    System.out.println("sahashsahassah");

    try {
      //str[5] = "王五";  //数组下标越界异常

      int i = 12 / 2;  //java.lang.ArithmeticException: / by zero
      System.out.println(i);

      String   s=str[0].toString();  //Exception in thread "main" java.lang.NullPointerException
      System.out.println(s);

    } catch (Exception e){   //还能不能精简点 jdk1.7以后
      e.printStackTrace();
    }

//    catch (RuntimeException e){
//      e.printStackTrace();
//    } catch (ArithmeticException e){
//      e.printStackTrace();
//    }catch (NullPointerException e){
//      e.printStackTrace();
//    }
      //注意  如果使用的异常 类型大于后面的异常类型  那么就会报错




  }
}
