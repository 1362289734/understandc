package Day05_API_异常课堂练习.作业1.Exercise11;

import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultElement;

public class DeleteSpace {
    /**
     * " 我是你的谁,我是你的剑 " 去除字符串左右空格
     */
    public static String Delete(String str){
        char [] ch = str.toCharArray();
        int count=0;
        for (int i = 0; i<str.length();i++){
            if (ch[i]==' '){
                count++;
            }
        }
        char [] ch2 = new char[str.length()-count];
        for (int i = 0; i<str.length();i++){
            if (ch[i]!=' '){
                for (int j = 0; j<str.length()-count;j++){
                    if (ch2[j] == '\0'){
                        ch2[j]=ch[i];
                        break;
                    }
                }
            }
        }
        return new String(ch2,0,ch2.length);
    }

    public static void main(String[] args) {
        String str = " 我是你的谁,我是你的剑 ";
        System.out.println(str);
        System.out.println(str = Delete(str));
    }
}
