package Day05_API_异常课堂练习.作业1.Exercise5;

public class Judge2 {
    /**
     * "我是你的谁,我是你的剑" 判断是否包含 "剑"
     *第四题字符串判断是否以"我开头",判断是否以"剑"结尾
     */
    public static void check(String str){
        char checkCh = '我',checkCh2 = '剑';
        char [] ch = str.toCharArray();
        if (ch[0]==checkCh && ch[str.length()-1]==checkCh2){
            System.out.println("字符串是以‘我’开头，以‘剑’结尾");
        }else{
            System.out.println("字符串不是以‘我’开头，以‘剑’结尾");
        }
    }

    public static void main(String[] args) {
        String str = "我是你的谁,我是你的剑";
        char ch2 = '剑';
        char [] ch = str.toCharArray();
        int count=0;
        for (int i = 0;i<str.length();i++){
            if(ch[i]==ch2){
                count++;
            }
            else if(ch[i]!=ch2&&i==str.length()-1){
                System.out.println("不包含"+ch2);
            }
        }
        if (count>0){
            System.out.println("包含"+ch2);
            System.out.println("出现了"+count+"次");
        }
        check(str);
    }
}
