package API练习.Day05_4;

public class ReverseDemo2 {

    public static void main(String[] args) {
        String str = "To be or not to be.";
        char[] ch = str.toCharArray();
        int a = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (ch[i + 2] == ' ' || ch[i + 2] == '.') {
                char temp = ch[i];
                ch[i] = ch[i + 1];
                ch[i + 1] = temp;
                i += 2;
            } else {
                for (int j = i; j < str.length(); j++) {
                    if (ch[j] != ' ' && ch[j] != '.') {
                        a++;
                    } else {
                        break;
                    }
                }
                int index = i;
                for (; i < index + a; i++, a--) {
                    char temp = ch[i];
                    ch[i] = ch[index + a - 1];
                    ch[index + a - 1] = temp;
                }
                i+=a-1;
            }
            if (i > str.length()) {
                break;
            }
        }
        str = new String(ch);
        System.out.println(str);
    }
}
