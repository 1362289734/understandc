package Day05_API_异常课堂练习.作业1.Exercise12;

public class Change1 {
    /**
     * "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
     */
    public static String Change1(String str, String where, String what) {
        char[] ch = str.toCharArray();
        char[] chWhere = where.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0, k = i; j < where.length(); j++, k++) {
                if (ch[k] != chWhere[j]) {
                    break;
                } else if (j == where.length() - 1 && ch[k] == chWhere[j]) {
                    String str1 = new String(ch, 0, i);
                    String str2 = new String(ch, k+1, str.length() - k-1);
                    String str3 = new String(str1 + what + str2);
                    return str3;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "我是你的谁,我是你的剑";
        System.out.println(str);
        str = Change1(str, "谁", "被子");
        System.out.println(str);
    }
}
