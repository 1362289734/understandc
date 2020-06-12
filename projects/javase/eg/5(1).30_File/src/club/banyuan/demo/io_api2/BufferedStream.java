package club.banyuan.demo.io_api2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/30 2:47 下午
 */
public class BufferedStream {

  /**
   *     字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，
   *     这是加入了数组这样的缓冲区效果，java本身在设计的时候，
   *     也考虑到了这样的设计思想(装饰设计模式后面讲解)，所以提供了字节缓冲区流
   *         字节缓冲输出流
   *     BufferedOutputStream
   *         字节缓冲输入流
   *     BufferedInputStream
   *
   * @param args
   */

  public static void main(String[] args) throws IOException {

//    BufferedOutputStream bos=new BufferedOutputStream(
//        new FileOutputStream(new File("Readme.md"),true));
//    bos.write("哈哈是".getBytes());
//     bos.flush();  //这一步的操作是将缓冲区中的数据刷新到磁盘中,但是流没有关闭还可以继续写入数据
//   // bos.close();  以为这把流关了 不能再继续操作了
//
//    for (int i = 0; i <1000000; i++) {
//      bos.write(("詹姆斯"+i).getBytes());
//      bos.flush();
//    }

    File file = new File("Readme.md");
   BufferedInputStream  bis=new BufferedInputStream(new FileInputStream(file));
  //FileInputStream bis=new FileInputStream(file); //
    byte  [] b=new byte[(int)file.length()];
    long  start=System.currentTimeMillis();
    bis.read(b) ;
    long  end=System.currentTimeMillis();
    System.out.println("所花时间:"+(end-start)+"毫秒");




  }

}
