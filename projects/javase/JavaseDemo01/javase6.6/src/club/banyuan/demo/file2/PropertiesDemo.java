package club.banyuan.demo.file2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Date;
import java.util.Properties;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/6 10:01 上午
 */
public class PropertiesDemo {

  public static void main(String[] args) throws IOException {
    Properties  properties=new Properties();
    File  file=new File("properties.properties");
//    properties.put("9527", "张三");
//    properties.put("root", "zhoujian");
//    properties.put("password", "123456");
//    properties.put("port", "3306");
//
//    //将上述的数据  以键值对的方式写到文件中去
//    if(!file.exists()){
//      file.createNewFile();
//    }
//    Writer  writer=new FileWriter(file);
//    properties.store(writer,"comments is ladyGaga");
//    writer.close();
//
    Reader  reader=new FileReader(file);
    properties.load(reader);
    reader.close();

    System.out.println(properties);

    /**
     * 1.我现在有一个文本文件,我只知道是键值对的方式,但是不知道其内容,写出一个程序
     * 判断是是否有一个"lisi"的键存在，如果有就改变其值,并且重新放回文本文件中
     *
     */


  }

}
