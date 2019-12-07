//
// Created by 李熠 on 2019/11/30.
//

#include "List.h"
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Student {
    char name[20];
    int age;
//    enum BOOL (*studentEquals)(struct Student, struct Student);
} Student;

Student *createStudent(char *name, int age) {
    Student *rlt = malloc(sizeof(Student));
    memcpy(rlt->name, name, strlen(name) + 1);
    rlt->age = age;
    return rlt;
}

enum BOOL isSameStudent(Student one, Student two) {
    return strcmp(one.name, two.name) == 0 && one.age == two.age;
}

enum BOOL isSameStudentOther(Student one, Student two) {
    return strcmp(one.name, two.name) == 0;
}

void *createStu(void *stu) {
    void *rlt = malloc(sizeof(Student));
    memcpy(rlt, stu, sizeof(Student));
    return rlt;
}

void printStu(int index, void *stu) {
    Student *student = (Student *) stu;
    printf("name=%s,age=%d\n", student->name, student->age);
}

enum BOOL studentEquals(void *one, void *two) {
    Student *s1 = (Student *) one;
    Student *s2 = (Student *) two;

    return strcmp(s1->name, s2->name) == 0 && s1->age == s2->age;
}


int countStuSize(void *one) {
    return sizeof(Student);
}

int main(void) {
    ListGenericFn listGenericFn = {NULL, NULL, NULL, studentEquals, NULL};
    List *strList = listNew(STRING, &listGenericFn);

    listAppend(strList, "1");
    printf("%d\n", listLength(strList));
    listAppend(strList, "2");
    printf("%d\n", listLength(strList));
    listAppend(strList, "3");
    printf("%d\n", listLength(strList));
    listAppend(strList, "4");
    listAppend(strList, "收到了分开");
    listAppend(strList, "哈哈1");
    listDisplay(strList);
    listDeleteElem(strList, "哈哈");
    printf("%d\n", listLength(strList));
    listDisplay(strList);
    FILE *file = fopen("strlist.bat", "w");
    listSerialize(strList, file);
    fclose(file);
    listDestroy(strList);

    file = fopen("strlist.bat", "r");
    printf("listDeserialize");
    strList = listDeserialize(file, STRING, NULL);

    listDisplay(strList);
    fclose(file);

    ListGenericFn listStudentFn = {printStu, createStu, NULL, studentEquals, countStuSize};
    List *stuList = listNew(STRUCT, &listStudentFn);

    listAppend(stuList, createStudent("张森", 123));
    listAppend(stuList, createStudent("张森", 123));
    listAppend(stuList, createStudent("张森", 2));
    listDisplay(stuList);
    Student target = {"张森", 123};
    listDeleteElem(stuList, &target);
    listDisplay(stuList);
    listDestroy(stuList);

    return 0;
}