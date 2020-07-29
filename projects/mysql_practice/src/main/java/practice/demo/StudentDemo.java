package main.java.practice.demo;

import com.alibaba.fastjson.JSONObject;
import main.java.practice.dto.Student;
import main.java.practice.service.StudentService;

import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        //PART 1
//        System.out.println("-----获取指定学生信息-----");
//        // 入参 需要查询的学生序号
//        int sno =101;
//        // 获取学生信息
//        Student s1 =studentService.getStudentById(sno);
//        // 输出信息
//        String data = JSONObject.toJSONString(s1);
//        System.out.println(data);
//
//        System.out.println();

        //PART 2
//        System.out.println("----获取学生列表----");
//        List<Student> students = studentService.getStudentList();
//        String data = JSONObject.toJSONString(students);
//        System.out.println(data);

        //PART 3
//        //{"classNo":90301,"sname":"李华","sno":101,"ssex":"男"}
//
//        System.out.println("----学生信息修改前数据结果-----");
//        Student s1 = studentService.getStudentById(101);
//        System.out.println(JSONObject.toJSONString(s1));
//
//        Student s2 = new Student();
//        s2.setSno(101);
//        s2.setSname("李华");
//        s2.setSsex("男");
//        s2.setClassNo(90301);
//        // 更新学生信息
//        studentService.updateStudent(s2);
//        System.out.println();
//        System.out.println("----学生信息修改后数据结果-----");
//        Student s3 = studentService.getStudentById(101);
//        System.out.println(JSONObject.toJSONString(s3));

        //PART 4
//        System.out.println("-----新增学生信息前学生列表-----");
//        List<Student> students = studentService.getStudentList();
//        System.out.println(JSONObject.toJSONString(students));
//
//        // 新增学生数据
//        Student s4 = new Student();
//        s4.setSname("李四");
//        s4.setSsex("男");
//        s4.setClassNo(88888);
//        studentService.insertStudent(s4);
//
//        System.out.println("-----新增学生信息后学生列表-----");
//        List<Student> studentsAfter = studentService.getStudentList();
//        System.out.println(JSONObject.toJSONString(studentsAfter));

        //PART 5
        System.out.println("-----删除学生信息前学生列表-----");
        List<Student> students = studentService.getStudentList();
        System.out.println(JSONObject.toJSONString(students));

        // 删除学生数据
        int sno = 108;
        studentService.deleteStudent(sno);

        System.out.println("-----删除学生信息后学生列表-----");
        List<Student> studentsAfter = studentService.getStudentList();
        System.out.println(JSONObject.toJSONString(studentsAfter));







    }
}
