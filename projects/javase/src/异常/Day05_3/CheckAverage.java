package 异常.Day05_3;

import java.util.Scanner;

public class CheckAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while (check == 1) {
            try {
                System.out.println("请输入需要求几位整数的平均数：");
                int n = sc.nextInt();
                if (n<0){
                    throw new NumberException();
                }
                int a;
                double sum = 0;
                for (int i = 0; i < n; i++) {
                    System.out.println("请输入第" + (i + 1) + "个数：");
                    try {
                        a = sc.nextInt();
                        if (a < 0) {
                            throw new AverageException();
                        }
                        sum += a;
                    } catch (AverageException e) {
                        System.err.println("输入的数必须是正整数或者0,请重新输入该数...");
                        i -= 1;
                    }
                }
                System.out.println("平均数是：" + sum / n);
                check=0;
            } catch (NumberException e) {
                System.err.println("输入的数必须是大于0的整数,请重新输入...");
            }
        }
    }
}

