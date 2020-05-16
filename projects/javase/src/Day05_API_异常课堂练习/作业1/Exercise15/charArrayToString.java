package Day05_API_异常课堂练习.作业1.Exercise15;

public class charArrayToString {
    /**
     * 将字符数组转换成 字符串输出
     */
    public static void main(String[] args) {
        char [] ch = {'a','w','e','r','z','z','r'};
        System.out.println(ch);
        String str = new String(ch,0,ch.length);
        System.out.println(str);
    }
}
