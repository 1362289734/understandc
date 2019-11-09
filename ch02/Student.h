#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define NAME_LEN 32
#define CLASS_SIZE 100

enum Sex {
    MALE, FEMALE
};

typedef enum Sex SEX;

struct Student {
    SEX sex;
    int age;
    char name[NAME_LEN];
    int number;
};

typedef struct Student Student;

//Student studentCreate(SEX sex, int Age, char *Name, double Number);
//
//void studentAdd(Student grade[],Student student);
//
//void studentDisplay(Student grade[]);

/**
 * 根据传入的参数创建一个学生结构对象
 * @param age
 * @param gender
 * @param name
 * @param num
 * @return
 */
Student *createStudent(int age, SEX sex, char *name, int num);

void addStudent(Student *grade[], Student *student);

void displayStudent(Student *grade[]);

/**
 * 根据学号查询学生
 * @param num
 * @return
 */
Student *search(Student *[], int num);

/**
 * 根据学生学号更新学生信息
 * @param student
 */
void updateStudentByNum(Student *[], int num,int age, SEX sex, char *name);

/**
 * 根据学生学号删除学生，后续元素依次前移
 * @param student
 */
void deleteStudentByNum(Student *[], int num);

