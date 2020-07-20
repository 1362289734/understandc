package club.banyuan.demo.csv;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/6 11:05 上午
 */
public class CSVDemo {

  public static void main(String[] args) throws IOException {
    //把数据存放在表格中

    File file=new File("test.csv");
    if(!file.exists()){
      file.createNewFile();
    }
    CsvWriter csvWriter=new CsvWriter(file.getName(),',', Charset.forName("UTF-8"));
    String  [] strings={"学号","姓名","年龄","住址"};
    csvWriter.writeRecord(strings);
    String [] comment1={"9527","王五1","21","垃圾桶"};
    String [] comment2={"9528","王五2","21","垃圾桶"};
    String [] comment3={"9529","王五3","21","垃圾桶"};
    csvWriter.writeRecord(comment1);
    csvWriter.writeRecord(comment2);
    csvWriter.writeRecord(comment3);


    csvWriter.close();

    CsvReader csvReader=new CsvReader(file.getName(), ',', Charset.forName("UTF-8"));

    if(csvReader.readHeaders()){
      System.out.println(csvReader.getRawRecord());
    }
    if(csvReader.readRecord()){  //读取表的每一行数据
      System.out.println(csvReader.getRawRecord());
    }
    if(csvReader.readRecord()){  //读取表的每一行数据
      System.out.println(csvReader.getRawRecord());
    }
  }
}
