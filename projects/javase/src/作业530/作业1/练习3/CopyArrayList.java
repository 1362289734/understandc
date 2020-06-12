package 作业530.作业1.练习3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args)throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\project\\understandc\\projects\\javase\\src\\作业530\\作业1\\练习3/test.txt"));
        for (String s:arrayList) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();



    }
}
