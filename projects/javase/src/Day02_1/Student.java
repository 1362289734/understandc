package Day02_1;

public class Student{
    private int [] stuNum = {1,2,3,4,5,6};
    private String [] stuName = {"张三","李四","王五","赵六","孙七","周八"};
    private String stuGrade = "大三";
    private double stuScore = 100;

    public int checkStudent(int studentNumber, String studentName){
        if (studentNumber >= 7 || studentNumber <= 0){
            System.out.println("学号不存在!");
        }
        for (int j = 0; j < 6; j++){
            if (stuName[j].equals(studentName)){
                break;
            }else if (j == 5){
                System.out.println("学生姓名不存在!");
            }
        }
        for (int i = 0; i < 6; i++){
            if (stuNum[i] == studentNumber){
                if (stuName[i].equals(studentName)){
                    System.out.println(studentName+","+stuGrade+",学号:"+studentNumber+",登陆成功!");
                    return 1;
                }else{
                    System.out.println("学号或者姓名错误!");
                    return 0;
                }
            }
        }
        System.out.println("请重新输入学号姓名!");
        return 0;
    }

    public void setStuScore(double stuScore) {
        this.stuScore = stuScore;
    }

    public double getStuScore() {
        return stuScore;
    }

}