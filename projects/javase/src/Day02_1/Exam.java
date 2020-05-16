package Day02_1;
import java.util.Scanner;
import java.util.*;


public class Exam {
    private int [] number = new int [30];
    private String [] title = new String [30];
//    private String answerA;
//    private String answerB;
//    private String answerC;
//    private String answerD;
    private int [] Answer = new int [30];

    public void loadNumber() {
        for (int i = 0; i<30; i++){
            number[i] = i+1;
        }
    }

    public void loadTitle(){
        int j = 31;
        for (int i = 1; i < 31; i++){
            for (;j < 61;){
                title[i-1] = "求出"+i+"+"+j+"的值:";
                j++;
                break;
            }
        }
    }

    public void loadAnswer(){
        int j = 31;
        for (int i = 1; i < 31; i++){
            for (;j < 61;){
                Answer[i-1] = i+j;
                j++;
                break;
            }
        }
    }

    public void examBegin(Student stu,int stuNumber, String studentName){
        Scanner sc_1 = new Scanner(System.in);
        int arr[] = new int[10];
        int score = 0;
        for (int i = 0; i < arr.length; i++) {
            int index = (int)(Math.random() * 20 + 1);
            arr[i] = index;
            for (int j = 0; j < i; j++)
            {
                if (arr[j] == arr[i])
                {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("第"+(i+1)+"题：（1题10分）"+title[arr[i]]);
            System.out.print("请输入答案：");
            int answer = sc_1.nextInt();
            if (answer != Answer[arr[i]]){
                System.out.println("回答错误！");
                System.out.println("正确答案为："+Answer[arr[i]]);
            }else{
                System.out.println("回答正确");
                score = score+10;
            }
            stu.setStuScore(score);
            if (i == 9){
                System.out.println("测试结束！");
                System.out.println(studentName+",学号"+stuNumber+"，测试得分为："+stu.getStuScore()+"  总分为100.00");
            }
        }
    }

}

class examination{
    public static void main(String[] args) {
        Student stu = new Student();
        Exam exam = new Exam();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i == 0) {
            System.out.print("请输入学号:");
            int stuNumber = sc.nextInt();
            System.out.print("请输入姓名:");
            String studentName = sc.next();
            i = stu.checkStudent(stuNumber,studentName);
            if (i==0){
                continue;
            }
            exam.loadNumber();
            exam.loadAnswer();
            exam.loadTitle();
            exam.examBegin(stu,stuNumber,studentName);
        }

    }
}