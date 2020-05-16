package Day05_API_异常课堂练习.作业1.Exercise7;

public class Find {
    /**
     * 找到此字符串"我是你的小宝贝"的 "我" 进行输出
     */
    public static void main(String[] args) {
        String str = "我是你的小宝贝";
        char [] ch = str.toCharArray();
        char ch2 = '我';
        for (int i = 0; i<str.length();i++){
            if (ch[i]==ch2){
                System.out.println(ch[i]);
            }else{
                System.out.print(ch[i]);
            }
        }
    }
}
