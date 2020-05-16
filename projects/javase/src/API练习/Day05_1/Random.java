package API练习.Day05_1;

import java.util.Scanner;

public class Random {
    public static int random(int From, int To) {
        if (From < 0 && To <= 0) {
            return (int) (Math.random() * ((From - To) - 1) + To);
        } else if (To > 0) {
            int number = (int) (Math.random() * ((To - From) + 1) );
            return number+From;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始范围：");
        int Start = sc.nextInt();
        System.out.println("请输入最终范围：");
        int End = sc.nextInt();
        for (int i= 0;i<15;i++) {
            System.out.println("获得的随机数为：" + random(Start, End));
        }
    }
}
