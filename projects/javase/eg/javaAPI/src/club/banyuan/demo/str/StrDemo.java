package club.banyuan.demo.str;

public class StrDemo {

    public static void main(String[] args) {
        String str="你好大保健";  //  str 栈空间    "你好大保健" 在常量池里面

        //str=str+"我的剑"; //请问str指向的 常量池里面的 "你好大保健"内容变了没有    没有变
        //变得只要str对常量池里面 内容的引用   而常量池里面本身的两个字符串的内容根本没有变化
        System.out.println("str="+str);

//        String  str1="你好大保健";//直接引用常量池里面已有的
//        //-2003820462     -2003820462
//        System.out.println(str.hashCode()+"     "+str1.hashCode());
//        System.out.println(str==str1);  //这两个完全相等




        String   st=new String("大保健");  //请问  st 在内存中什么位置
        String   st2=new String("大保健");  //此种方式对常量池里面的引用是一样的

        System.out.println(st.equals(st2)); // true
        System.out.println(st==st2); // false

        //思考:如果两个对象的地址值一样,那么他们的内容都一样 这句话对不对？


        String  s="hello";
        String  s1=new String("hello");
        // 99162322====99162322
        System.out.println("hello".hashCode()+"===="+s.hashCode());

        System.out.println(s.equals(s1)); // true
        System.out.println(s==s1); // false

        System.out.println(">>>>>>"+s1);

        String  s2="hel"+"lo";
        String  s3="h"+"e"+"l"+"l"+"o";
        System.out.println(s.equals(s2));  //true
        System.out.println(s2==s3); //true


        String  t1="hello";
        String  t2="world";
        String  t3="helloworld";

        String  t4=t1+t2;  //相当于在堆里面完成的操作
        //编译之后的：  new  StringBuilder(String.valueOf(t1)).append(t2).toString():

        System.out.println(t3==(t1+t2));  //
        System.out.println(t3.equals(t1+t2)); //true

         String   string=new String("你好");//创建了几个对象
         String   str6="h"+"e"+"l"+"l"+"o";// 只创建了一个对象  全部优化了  拼接成了一个






    }



}
