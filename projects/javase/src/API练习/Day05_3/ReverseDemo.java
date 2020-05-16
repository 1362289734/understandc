package API练习.Day05_3;

public class ReverseDemo {
    public static String Reverse(String string, int From, int To) {
        if (string != null&&(string.length()-1)>=To) {
            int indexFrom = From, indexTo = To;
            char[] ch = string.toCharArray();
            for (; indexFrom < indexTo; indexFrom++, indexTo--) {
                char temp = ch[indexFrom];
                ch[indexFrom] = ch[indexTo];
                ch[indexTo] = temp;
            }
            return new String(ch);
        }
        else{
            System.out.println("超出范围或字符串不存在.");
            return null;
        }
    }

    public static void main(String[] args) {
        String str = "abcdefghijk";
        System.out.println(str);
        str = Reverse(str,3,8);
        System.out.println(str);
    }
}
