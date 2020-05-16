package Day05_API_异常课堂练习.作业1.Exercise4;

public class Judge1 {
    /**
     * "我是你的谁,我是你的剑" 判断是否包含 "剑"
     *
     */
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
    }
}
