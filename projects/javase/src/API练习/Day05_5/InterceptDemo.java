package API练习.Day05_5;

public class InterceptDemo {
    public static String Intercept(String str, int index) {
        if (str == null) {
            System.out.println("字符串不存在");
            return null;
        }
        /**
         * 如果截取时截取了半个汉字，那么所得的字节对应的ASCII码值为负数
         */
        byte[] bt = str.getBytes();
        int number = 0;
        if (index > str.length()) {
            System.out.println("截取范围超过字符串长度");
            return null;
        }
        for (int i = 0; i < index; i++) {
            if (bt[i] < 0) {
                number++;
            }
        }
        /**
         * UTF-8编码的汉字占3个字节
         */
        if (bt[index] < 0) {
            return new String(bt, 0, index + number / 3 - (number + 1) % 3);
        } else {
            return new String(bt, 0, index + number / 3);
        }

    }

    public static void main(String[] args) {
        String str1 = "我ABC";
        String str2 = "我ABC汉DEF";
        System.out.println(Intercept(str1, 4));
        System.out.println(Intercept(str2, 6));
    }
}
