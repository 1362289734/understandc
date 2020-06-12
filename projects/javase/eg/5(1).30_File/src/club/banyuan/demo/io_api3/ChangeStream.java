package club.banyuan.demo.io_api3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/30 3:05 下午
 */
public class ChangeStream {

  public static void main(String[] args) throws IOException {

    File file=new File("Readme.md");  //可能会把之前的文件给覆盖了
//    OutputStream  os=new FileOutputStream(file,true);
//    OutputStreamWriter osw=new OutputStreamWriter(os);
//    //String   s=osw.getEncoding();
//    //System.out.println(s);
//    osw.write("想着呢么写就怎么写");
//    osw.flush();


//    InputStream  is=new FileInputStream(file);
//    InputStreamReader   isr=new InputStreamReader(is);
//    char [] chars= new char[((int)file.length())/3];
//
//    System.out.println("字节长度:"+file.length());
//
//    isr.read(chars) ;
//    isr.close();
//    is.close();
//
//    String   str=new String(chars);
//    System.out.println("----->>>>"+str);
//


  }

}
