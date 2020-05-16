package Day05_API_异常课堂练习.作业1.Exercise9;

public class FindLocation2 {
    /**
     * 找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"
     */
    public static void main(String[] args) {
        String str = "我是你的谁,我是你的剑";
        char ch = '你';
        char [] ch2 = str.toCharArray();
        int count =0;
        for (int i =str.length()-1; i>0;i--){
            if (ch2[i]!=ch){
                count++;
            }else{
                System.out.println(ch+"最后一次出现的位置是:"+(str.length()-count));
                break;
            }
        }
        count = 0;
        for (int i = 4; i<str.length();i++){
            if (ch2[i]!=ch){
                count++;
            }else {
                count++;
                System.out.println("从第四个位置开始找,第一次出现的'你'在:"+count);
            }
        }
    }
}
