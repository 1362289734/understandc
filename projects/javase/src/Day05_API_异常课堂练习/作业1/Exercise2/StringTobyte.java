package Day05_API_异常课堂练习.作业1.Exercise2;

public class StringTobyte {
    /**
     * 同样的自定义一个字符数组用字符串的方式输出
     */
    public static void main(String[] args) {
        String str = "ABCDefg";
        byte [] by = str.getBytes();
        for (int i = 0;i<str.length();i++){
            System.out.print(by[i]+" ");
        }
    }
}
