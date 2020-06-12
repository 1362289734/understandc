package 作业530.作业1.练习1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxt {
    public static void main(String[] args) throws IOException {
        File file1=new File("D:\\project\\understandc\\projects\\javase\\src\\作业530\\作业1\\练习1/test1.txt");
        File file2=new File("D:\\project\\understandc\\projects\\javase\\src\\作业530\\作业1\\练习1/test2.txt");
        if (!file2.exists()){
            file2.createNewFile();
        }
        FileInputStream fileInputStream=new FileInputStream(file1);
        byte[] bytes = new byte[(int) file1.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();
        FileOutputStream fileOutputStream=new FileOutputStream(file2);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
