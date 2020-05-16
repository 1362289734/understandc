package Day05_API_异常课堂练习.作业2;

import java.util.*;

public class DifferenceOfString {
    /**
     * 自己对比 String  StringBuffer  StringBuilder的区别  以代码和文字叙述的方式
     *                      在演示StringBuffer的时候 最好是基本数据类型和引用数据类型一起使用
     */
    public static void main(String[] args) {
        /**
         * 区别一：在Java中字符串使用String类进行表示，
         *          但是String类表示字符串有一个最大的问题：“字符串常量一旦声明则不可改变，而字符串对象可以改变，
         *          但是改变的是其内存地址的指向。”所以String类不适合于频繁修改的字符串操作上，所以在这种情况下，
         *          往往可以使用StringBuffer类，即StringBuffer类方便用户进行内容修改，
         * 区别二：在String类中使用“+”作为数据的连接操作，而在StringBuffer类中使用append()方法
         *         （方法定义：public StringBuffer append(数据类型 变量)）进行数据连接。
         * 区别三：两个类的定义结构不同
         *
         */
        String str  = "我是String";
        //将String转换为StringBuffer类对象
        StringBuffer buf = new StringBuffer(str);

        buf.append(",现在是StringBuffer");//StringBuffer的添加操作append()
        System.out.println(str+"-----"+buf);

        StringBuffer buf_2 = new StringBuffer();
        buf_2.append(str+",现在是StringBuffer2");
        System.out.println(buf_2);

        //StringBuffer类的反转
        //reverse();
        System.out.println(buf_2.reverse());

        //StringBuffer类 在指定位置追加内容
        //insert(int offset,数据类型 变量
        buf.insert(5,"阿斯蒂芬");
        System.out.println(buf);


        //StringBuffer类 删除指定位置的内容
        //delete(int start,int end)
        buf.delete(5,9);
        System.out.println(buf);


        //将StringBuffer转换为String
        //1、toString(),将StringBuffer转换为String
        StringBuffer buf1 = new StringBuffer();
        buf1.append("啊啊十大");
        String str1 = buf1.toString();
        System.out.println(str1);

        //2、使用String的构造方法
        buf1.append("阿斯顿撒");
        String str2 = new String(buf1);
        System.out.println(str2);

        /**
         * StringBuilder类和StringBuffer类是完全相同的，
         * 而且打开Java Doc文档后可以发现两个类的方法功能都是相同的。
         * 在StringBuffer类中定义的方法全部使用“synchronized”进行同步定义，属于安全的线程操作；
         * 而StringBuilder类没有同步定义，StringBuilder类的方法都是异步方法，属于非安全线程操作。
         */
    }
}
