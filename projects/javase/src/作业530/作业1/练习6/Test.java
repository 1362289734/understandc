package 作业530.作业1.练习6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {



        ArrayList<Student> list = new ArrayList <>();



        for (int i = 0;i < 5;i++){

            //输入学生信息

            Scanner sc = new Scanner(System.in);

            System.out.println("请输入学生的姓名：");

            String name = sc.nextLine();

            System.out.println("请输入该学生的语文成绩：");

            int chinese = sc.nextInt();

            System.out.println("请输入该学生的数学成绩：");

            int math = sc.nextInt();

            System.out.println("请输入该学生的英语成绩：");

            int english = sc.nextInt();



            //创建学生对象并录入信息

            Student s = new Student();

            s.setName(name);

            s.setChinese(chinese);

            s.setMath(math);

            s.setEnglish(english);



            //将学生添加到集合里

            list.add(s);

        }



        //3.遍历集合并写入文件

        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\project\\understandc\\projects\\javase\\src\\作业530\\作业1\\练习6/student.txt"));

        for (Student s :list) {

            StringBuilder sb = new StringBuilder("姓名：" + s.getName()  + ", 语文成绩：" + s.getChinese() +

                    ", 数学成绩：" + s.getMath() + ", 英语成绩：" + s.getEnglish());

            writer.write(sb.toString());

            writer.newLine();

            writer.flush();

        }



        //关闭资源

        writer.close();

    }
}
