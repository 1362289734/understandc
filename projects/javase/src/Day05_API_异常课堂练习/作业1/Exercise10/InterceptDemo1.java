package Day05_API_异常课堂练习.作业1.Exercise10;

public class InterceptDemo1 {
    /**
     *"我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串
     */

    public static String intercept(String str,int location,int len){
        char [] ch = str.toCharArray();
        return new String(ch,location,len);
    }
    public static void main(String[] args) {
        String str = "我是你的谁,我是你的剑";

        System.out.println(str=intercept(str,3,7));

    }
}
