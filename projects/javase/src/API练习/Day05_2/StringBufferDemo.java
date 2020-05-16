package API练习.Day05_2;

import java.util.*;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        Character a = 'a';
//        System.out.println((char)(a+1));
        for (int i = 0; i<26;i++){
            buf.append(a);
            a= (char)(a+1);
        }
        System.out.println("添加26个字母后："+buf);
        System.out.println("26个字母逆序后："+buf.reverse());
        System.out.println("删除前五个字符："+buf.delete(0,5));
    }
}
