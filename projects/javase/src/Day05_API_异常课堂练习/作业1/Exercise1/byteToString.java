package Day05_API_异常课堂练习.作业1.Exercise1;

public class byteToString {
    /**
     * 将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
     * 将上诉字节数组  从指定的位置开始到结束转换成字符串输出
     */
    public static void main(String[] args) {
        byte [] by={65,67,68,97,98,101};
        String str = new String(by);
        System.out.println(str);

        String str1 = new String(by,4,by.length-4);
        System.out.println(str1);

    }
}
