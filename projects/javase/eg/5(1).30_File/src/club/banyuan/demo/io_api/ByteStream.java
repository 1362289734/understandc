package club.banyuan.demo.io_api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.plaf.basic.BasicTextAreaUI;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/30 1:40 下午
 */
public class ByteStream {

  public static void main(String[] args) throws IOException {

    //为什么要关闭资源？释放内存；保存数据完整性  因为在多线程的情况下 如果多个线程对同一个文件进行操作,那可能会
    //造成数据丢失或者错误的问题

    //首先确定要读取的文件  
    File file = new File("Readme.md");
    InputStream fio = new FileInputStream(file);
   //int  line=fio.read();
    byte [] bytes=new byte[(int)file.length()];
    fio.read(bytes);

    String  s=new String(bytes);
    System.out.println(s);
    fio.close();

    //往文件里面写入数据
    OutputStream  outputStream=new FileOutputStream(file,true);  //表示追加
    outputStream.write("\n".getBytes());
    outputStream.write("半圆".getBytes());  //写入数据的时候会造成之前数据被覆盖
    outputStream.close();

    //将a文件里面的内容复制到b文件里面去,写完之后考虑如果是图片或者是视频呢,如何进行复制



  }

}
