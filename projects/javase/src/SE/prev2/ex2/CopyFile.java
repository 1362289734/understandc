package SE.prev2.ex2;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) throws IOException {
        //不适合字符串操作
        //字节流
        InputStream inputStream = new FileInputStream("D:\\project\\understandc\\projects\\javase\\src\\miscellaneous\\J.Fla-IntheNameofLove.mp3");
        File path = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex2");
        OutputStream os = new FileOutputStream(path+"/new.mp3");

        byte[] buf = new byte[1024];

        int count = 0;
        while((count=inputStream.read(buf))>0){
            os.write(buf,0,count);
        }











    }
}
