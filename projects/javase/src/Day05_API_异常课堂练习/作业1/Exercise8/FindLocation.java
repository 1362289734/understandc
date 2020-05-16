package Day05_API_异常课堂练习.作业1.Exercise8;

public class FindLocation {
    /**
     * 找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
     */
    public static void main(String[] args) {
        String str = "我是你的谁,我是你的剑";
        char ch = '你';
        char [] ch2 = str.toCharArray();
        int count =0;
        for (int i =0; i<str.length();i++){
            if (ch2[i]!=ch){
                count++;
            }else{
                count++;
                System.out.println(ch+"第一次出现的位置是:"+count);
                break;
            }
        }
    }
}
