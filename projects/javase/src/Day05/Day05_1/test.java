package Day05.Day05_1;

public class test {
    public static void main(String[] args) {
        String str = "你好大保健";
//        str = str + "我的剑";

        System.out.println("str="+str);

        String str1 = "你好大保健";
        System.out.println(str.hashCode()+"----"+str1.hashCode());
        System.out.println(str==str1);
/**
 * 只要是常量池里面已经有了的，当重复使用的时候不会再开辟一个
 */
        String st= new String ("大保健");
        String st2= new String ("大保健");//这两种方式对常量池的引用是一样的

        System.out.println(st.equals(st2));
        System.out.println(st==st2);



    }
}
