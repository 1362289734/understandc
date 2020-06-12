package 作业530.作业1.练习2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImg {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\img.jpg");
        File file2 = new File("D:\\img1.jpg");
        if (!file2.exists()){
            file2.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();
        FileOutputStream fileOutputStream=new FileOutputStream(file2);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
