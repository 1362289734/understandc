package 作业66.作业1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        File file=new File("D:\\project\\understandc\\projects\\javase\\src\\作业66\\作业1/test.txt");
        properties.put("lisi3","12345");
        properties.put("lisi2","张三");
        properties.put("lisi1","Alex");
        properties.put("lisi0","abcd");
        properties.put("lisi","李四");

        if (!file.exists()){
            file.createNewFile();
        }
        Writer writer=new FileWriter(file);
        properties.store(writer,"Homework6.6"+new Date());
        writer.close();
    }
}
