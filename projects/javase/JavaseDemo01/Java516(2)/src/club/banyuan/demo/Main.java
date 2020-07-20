package club.banyuan.demo;

import club.banyuan.demo.homework.Person;
import club.banyuan.demo.homework.ReadyPlayPoker;
import com.sun.xml.internal.xsom.impl.scd.Iterators.Array;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        //idea 默认的编码格式就是utf-8    gbk eclipse专用
//        char   sex='男';  //2   utf-8的情况下  字符占3字节  0~65535  比如说 汉字   日文  韩文 等等
//        //对于   char字符   编码格式所占空间详解    Unicode编码   文件  会对编码有一个更明确的认识
//        String    str="张三丰";
//        try {
//            byte  [] bytes=str.getBytes("utf-8");
//
//            System.out.println("-------"+new String((bytes)));
//
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        byte [] bytes={65,67,98,99};  //英文字符
//        try {
//            String  s=new String(bytes,"gb2312");
//            System.out.println("----"+s);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//
//        String x="avabd";
//        String y="avabc";
//
//        System.out.println(x.compareTo(y));

        String  []str= ReadyPlayPoker.getOutOfOrderPoker();
//        System.out.println(str.length);
//        for (String s: str) {
//            System.out.print(s+"  ");
//        }

        boolean  flag=false;
        //把五十一张牌发给三个人   在51张牌里面确定一张地主牌
        int index=(int)(Math.random()*(str.length-3));
        String  str_flag=str[index];//地主标志

        String [] str1=new String[17];
        String [] str2=new String[17];
        String [] str3=new String[17];
        int x=0,y=0,z=0;

        Person person1 = new Person(flag, "张三", str1);
        Person person2 = new Person(flag, "李四", str2);
        Person person3 = new Person(flag, "王五", str3);


        for (int i = 0; i < str.length-3; i++) {
            if (i % 3 == 0) {
                str1[x] = str[i];
                if (str1[x].equals(str_flag)) {
                    flag = true;
                    person1.setFlag(flag);
                }
                x++;
            }
            if (i % 3 == 1) {
                str2[y] = str[i];
                if (str2[y].equals(str_flag)) {
                    flag = true;
                    person2.setFlag(flag);
                }
                y++;
            }
            if (i % 3 == 2) {
                str3[z] = str[i];
                if (str3[z].equals(str_flag)) {
                    flag = true;
                    person3.setFlag(flag);
                }
                z++;
            }
        }

        int  key=16;

        if(person1.isFlag()){
            //数组扩容
            str1=Arrays.copyOf(str1, str1.length+3);
            for (int i = str.length-3; i <str.length; i++) {
                    str1[++key]=str[i];
            }
            person1.setStr(str1);
        }else if(person2.isFlag()){

            str2=Arrays.copyOf(str2, str2.length+3);

            for (int i = str.length-3; i <str.length; i++) {
                str2[++key]=str[i];
            }
            person2.setStr(str2);
        }else{

            str3=Arrays.copyOf(str3, str3.length+3);

            for (int i = str.length-3; i <str.length; i++) {
                str3[++key]=str[i];
            }
            person3.setStr(str3);
        }
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        //课堂作业:尝试把以上的代码 封装到方法里面去

    }
}
