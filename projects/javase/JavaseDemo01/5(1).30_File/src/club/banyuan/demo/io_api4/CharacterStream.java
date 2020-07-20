package club.banyuan.demo.io_api4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/30 3:22 下午
 */
public class CharacterStream {

  public static void main(String[] args) throws IOException {
   Reader reader = new FileReader("Readme.md");
   Writer writer = new FileWriter("Readme.md",true);
//    writer.write("张三丰");
//    writer.append("蟋蟀");
//    writer.flush();
//

//    BufferedReader  bufferedReader=new BufferedReader(reader);
//    String  str=null; //一次性读取文件里面一行的内容
//
//    while((str=bufferedReader.readLine())!=null){
//      System.out.println("----"+str);
//    }
//    bufferedReader.close();
//

    //字符缓冲流使用的好处
    BufferedWriter  bufferedWriter=new BufferedWriter(writer);
    bufferedWriter.write("太极张三丰");
    bufferedWriter.newLine();
    bufferedWriter.write("武当张无忌");
    bufferedWriter.newLine();

    bufferedWriter.flush();

  }

}
