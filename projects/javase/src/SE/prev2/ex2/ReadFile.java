package SE.prev2.ex2;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {


    public static void main(String[] args) throws IOException {
        File path = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex2");
        File file = new File(path,"demo.txt");


        byte[] buf = new byte[1024];
        InputStream  inputStream =new FileInputStream(file);
        int count =0;
        List<Byte> bytes = new ArrayList<>();
        while((count=inputStream.read(buf))>0){
            for (int i = 0; i < count; i++) {
                bytes.add(buf[i]);
            }

        }
        Byte[] bytes1  = bytes.toArray(new Byte[0]);
        byte[] bytes2 = new byte[bytes1.length];
        for (int i = 0; i < bytes1.length; i++) {
            bytes2[i] = bytes1[i];
        }
//        System.arraycopy(bytes1,0,bytes2,0,bytes1.length);
        System.out.println(new String(bytes2));

    }
}
