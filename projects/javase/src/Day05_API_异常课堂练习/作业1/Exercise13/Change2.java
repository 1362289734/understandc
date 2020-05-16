package Day05_API_异常课堂练习.作业1.Exercise13;

public class Change2 {
    /**
     * "我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
     */
    public static String Change2(String str, char where,char what){
        char[] ch = str.toCharArray();
        for (int i = 0;i<str.length();i++){
            if (ch[i]==where){
                ch[i]=what;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "我是你的谁,我是你的剑";
        str = Change2(str,'你','哈');
        System.out.println(str);
    }
}
