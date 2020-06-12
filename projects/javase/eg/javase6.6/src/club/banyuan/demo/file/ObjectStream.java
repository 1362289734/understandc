package club.banyuan.demo.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/6/6 9:08 上午
 */
public class ObjectStream {


  public static void main(String[] args) throws IOException, ClassNotFoundException {
    //向文件中添加对象
    File file=new File("student.txt");
    if(!file.exists()){
      file.createNewFile();
    }
//    Student student = new Student("张三","下水道",9527,23);
//    BufferedWriter  bufferedWriter=
//        new BufferedWriter(new FileWriter(file,true));
//      bufferedWriter.write(student.toString());
//      bufferedWriter.close();


      //读取文件中的数据并且塞到新创建的对象中
//    Student newStudent = new Student();
//    BufferedReader  bufferedReader=new BufferedReader(new FileReader(file));
//    String  s=bufferedReader.readLine();
//    System.out.println(s);
//    bufferedReader.close();


//    newStudent.setName();
//    newStudent.setAddress();
//    newStudent.setNumber();
//    newStudent.setAge();

    //java提供了一个专门对对象进行操作的流   叫对象流
//    ObjectOutputStream  objectOutputStream=new ObjectOutputStream(
//        new FileOutputStream(file,true));
//
//    Student student = new Student("张三","下水道",9527,23);
//    objectOutputStream.writeObject(student);
//    objectOutputStream.close();

    ObjectInputStream  objectInputStream=new ObjectInputStream(
        new FileInputStream(file));
    Student obj=(Student)objectInputStream.readObject();
    objectInputStream.close();

    Student student1 = new Student();

    student1.setName(obj.getName());
    student1.setAddress(obj.getAddress());
    student1.setNumber(obj.getNumber());
    student1.setAge(obj.getAge());

    System.out.println(student1.toString());

    /** 序列化: 对象序列化是将对象的状态转换为可保存或者传输的过程
     *  一般的格式是与平台无关的二进制流,可以将这种二进制流永久的保存在磁盘上
     *
     *  反序列化:将这种二进制流转换成对象
     *
     */





  }
}
