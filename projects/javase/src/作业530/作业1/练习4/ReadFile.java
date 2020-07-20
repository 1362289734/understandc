package 作业530.作业1.练习4;

import java.io.*;
import java.util.ArrayList;


public class ReadFile {


    public static void main(String[] args) throws IOException {

        File file = new File("D:\\project\\understandc\\projects\\javase\\src\\作业530\\作业1\\练习4/the.txt");

        if (!file.exists()) {

            file.createNewFile();

        }


        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\project\\understandc\\projects\\javase\\src\\作业530\\作业1\\练习4/the.txt")));

        ArrayList<String> array = new ArrayList<String>();
        String str;

        while ((str = reader.readLine()) != null) {

            array.add(str);

        }


        reader.close();


        for (String s : array) {

            System.out.println(s);

        }


    }


}