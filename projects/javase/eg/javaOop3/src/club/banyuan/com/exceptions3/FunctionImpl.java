package club.banyuan.com.exceptions3;

import java.io.IOException;
import org.junit.Test;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/25 11:17 上午
 */
public class FunctionImpl implements Function {


  @Override
  public void login() throws ArrayIndexOutOfBoundsException {
    // 重写⽅法不能抛出⽐被重写⽅法范围更⼤的异常类型
  }

  @Override
  public void register() throws RuntimeException {

  }

  public static void main(String[] args) {
    //checkScore(-10);

    int  num=20;
    assert  num==30:"num并不是30";  // java 默认是关闭断言的
    System.out.println(num);

    //现在断言基本上没人用   连jvm停止了   现有一个 junit 测试框架    基本已经占用了assert生存空间

  }

  @Test
  public   void   show(){  //都是测试方法...
    // System.out.println(1/0);
    System.out.println("as撒大所大所");
  }





}
