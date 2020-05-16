package Day05_API_异常课堂练习.作业1.Exercise6;

public class CheckNull {
    /**
     * String   str=""和 String  str2=null; 判断他们是否为空
     */
    public static void main(String[] args) {
        String str = "";
        String str2 = null;
        System.out.println(str == null && str.length() == 0);
        System.out.println(str2 == null);
    }
}
