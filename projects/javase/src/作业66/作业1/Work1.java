package 作业66.作业1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Work1 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("D:\\project\\understandc\\projects\\javase\\src\\作业66\\作业1/test.txt");
        properties.load(fileReader);
        fileReader.close();
        Set<String> keySet = properties.stringPropertyNames();
        for (String s : keySet) {
            if ("lisi".equals(s)){
                properties.setProperty(s,"王五");
            }
        }
        FileWriter fw = new FileWriter("D:\\project\\understandc\\projects\\javase\\src\\作业66\\作业1/test.txt");
        properties.store(fw,"content");
        fw.close();
    }

}
