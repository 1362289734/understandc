package club.banyuan.demo.io_api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/30 2:40 下午
 */
public class ImgCopy {

  public static void main(String[] args) throws IOException {
    File file = new File("img/1.jpg");
    File file2 = new File("img/2.jpg");
    if(!file2.exists()){
      file2.createNewFile();
    }

    FileInputStream fileInputStream = new FileInputStream(file);
    byte [] b=new byte[(int)file.length()];
    fileInputStream.read(b);
    fileInputStream.close();

    FileOutputStream fileOutputStream = new FileOutputStream(file2);
    fileOutputStream.write(b);
    fileOutputStream.close();

  }

}
