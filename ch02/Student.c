#include "Student.h"

int i = 0;
//
//Student studentCreate(SEX sex, int Age, char *Name, double Number) {
//    Student student;
//    student.age = Age;
//    student.number = Number;
//    for (int i = 0; i < strlen(Name) + 1; ++i) {
//        student.name[i] = Name[i];
//    }
//    student.sex = sex;
//    return student;
//}
//
//Student * fun1(){
//    Student *rlt = malloc(sizeof(Student));
//    rlt->sex = MALE;
//    rlt->number = 15;
//    return  rlt;
//}
//
//Student *fun2(){
//    Student stu = {};
//    return &stu;
//}
//
//Student fun3(){
//    Student stu = {};
//    return stu;
//}
//
//void studentAdd(Student grade[], Student student) {
//    for (; i < CLASS_SIZE;) {
//        grade[i] = student;
//        i++;
//        break;
//    }
//}
//
//void studentDisplay(Student grade[]) {
//    int j = 0;
//    for (; j < CLASS_SIZE; ++j) {
//        printf("姓名:%s  学号:%d  年龄:%d  性别:%s  \n", grade[j].name,
//               grade[j].number, grade[j].age, grade[j].sex == 1 ? "FEMALE" : "MALE");
//        if (j == i - 1)break;
//    }
//}


/**
 * 根据传入的参数创建一个学生结构对象
 * @param age
 * @param gender
 * @param name
 * @param num
 * @return
 */
Student *createStudent(int age, SEX sex, char *name, int num) {
    Student *rlt = malloc(sizeof(Student));
    rlt->sex = sex;
    rlt->number = num;
//    for (int i = 0; i < strlen(name) + 1; ++i) {
//        rlt->name[i] = name[i];
//    }
    strcpy(rlt->name, name);
    rlt->age = age;
    return rlt;
}

void addStudent(Student *grade[], Student *student) {
    grade[i] = student;
    i++;
}

void displayStudent(Student *grade[]) {
    int j = 0;
    for (; j < CLASS_SIZE; ++j) {
        printf("姓名:%s  学号:%d  年龄:%d  性别:%s  \n", grade[j]->name,
               grade[j]->number, grade[j]->age, grade[j]->sex == 1 ? "FEMALE" : "MALE");
        if (j == i - 1)break;
    }
}

/**
 * 根据学号查询学生
 * @param num
 * @return
 */
Student *search(Student *grade[], int num) {
    for (int j = 0; j < CLASS_SIZE; ++j) {
        if (grade[j] != NULL && grade[j]->number == num) {
            printf("学号为%d的学生为：%s\n", num, grade[j]->name);
            break;
        }
    }
}

/**
 * 根据学生学号更新学生信息
 * @param student
 */
void updateStudentByNum(Student *grade[], int num ,int age, SEX sex, char *name) {
    for (int j = 0; j < CLASS_SIZE; ++j) {
        if (grade[j] != NULL && grade[j]->number == num) {
            strcpy(grade[j]->name,name);
            grade[j]->sex = sex;
            grade[j]->age = age;
            break;
        }
    }
}

/**
 * 根据学生学号删除学生，后续元素依次前移
 * @param student
 */
void deleteStudentByNum(Student *grade[], int num) {
    printf("删除学号为%d的学生\n");
    for (int j = 0; j < CLASS_SIZE; ++j) {
        if (grade[j] == NULL || num > i) {
            printf("删除失败！\n");
            break;
        }
        if (grade[j] != NULL && grade[j]->number == num) {
            for (int k = j; k < CLASS_SIZE; ++k) {
                grade[k] = grade[k + 1];
                if (k == i - 1) {
                    printf("删除成功！\n");
                    i--;
                    break;
                }
            }
            break;
        }
    }
}

