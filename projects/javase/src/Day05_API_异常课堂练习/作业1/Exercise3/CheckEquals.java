package Day05_API_异常课堂练习.作业1.Exercise3;

public class CheckEquals {
    /**
     * "abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
     */

    public static void main(String[] args) {
        String str1 = "abcdw";
        String str2 = "ABCDw";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));//忽略大小写的比较

    }
}
