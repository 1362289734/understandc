package 异常.Day05_2;

import java.util.Scanner;

public class CheckTriangle {
    public static void isTriangle(int a,int b ,int c){
        if(a<0||b<0||c<0){
            throw new TriangleException("边长不能为负数...");
        }
        if (a+b>c&&a+c>b&&b+c>a){
            System.out.println("a，b，c 能构成三角形...");
        }else{
            throw new TriangleException("a，b，c 不能构成三角形...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入三条边长：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        isTriangle(a,b,c);
    }
}
