#include "List.h"
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

//enum BOOL {
//    FALSE, TRUE
//};

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

int max(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
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


void *createString(void *string) {
    void *rlt = malloc(sizeof(char) * (strlen((char *) string) + 1));
    memcpy(rlt, string, (strlen((char *) string) + 1));
    return rlt;
}

void printString(int index, void *string) {
    printf("[%d]=%s ", index, string);
    if (index + 1 % 10 == 0) {
        printf("\n");
    }
}

enum BOOL strEquals(void *one, void *two) {
    if (one != NULL && two != NULL) {
        return strcmp(one, two) == 0;
    } else if (one == NULL && two == NULL) {
        return TRUE;
    } else {
        return FALSE;
    }
}

enum BOOL studentEquals(void *one, void *two) {
    Student *s1 = (Student *) one;
    Student *s2 = (Student *) two;

    return strcmp(s1->name, s2->name) == 0 && s1->age == s2->age;
}

int countStrSize(void *one) {
    return (int) (strlen((char *) one) + 1);
}

int countStuSize(void *one) {
    return sizeof(Student);
}

int main(void) {

//    List *strList = listNew();
//
//    strList->malElem = createString;
//    strList->printElem = printString;
//    strList->elemEquals = strEquals;
//    strList->countElemSize = countStrSize;
//
//    listAppend(strList, "1");
//    printf("%d\n", listLength(strList));
//    listAppend(strList, "2");
//    printf("%d\n", listLength(strList));
//    listAppend(strList, "3");
//    printf("%d\n", listLength(strList));
//    listAppend(strList, "4");
//    listAppend(strList, "收到了分开");
//    listAppend(strList, "哈哈1");
//    listDisplay(strList);
//    listDeleteElem(strList, "哈哈");
//    printf("%d\n", listLength(strList));
//    listDisplay(strList);
//    FILE *file = fopen("strlist.bat", "w");
//    listSerialize(strList, file);
//    fclose(file);
//    listDestroy(strList);

    FILE *file = fopen("strlist.bat", "r");
    printf("listDeserialize");
    List *strList = listDeserialize(file, createString, printString, strEquals, countStrSize);

    listDisplay(strList);
    fclose(file);



//    List *stuList = listNew();
//    stuList->malElem = createStu;
//    stuList->printElem = printStu;
//    stuList->elemEquals = studentEquals;
//
//    listAppend(stuList, createStudent("张森", 123));
//    listAppend(stuList, createStudent("张森", 123));
//    listAppend(stuList, createStudent("张森", 2));
//    listDisplay(stuList);
//    Student target = {"张森", 123};
//    listDeleteElem(stuList, &target);
//    listDisplay(stuList);
//    listDestroy(stuList);


//    list->malElem = createString;



//    ListNode *list = listCreate();
//    list->
//
//    listAdd(list, "abcd");

//    int (*abc)(int a, int b);
//
//    abc = max;
//
//    (*abc)(1, 2);
//    max(1, 2);
//
//
//    Student *stu = createStudent("张三", 15);
//    printf("%s,%d", stu->name, stu->age);
//
//    int (*p)(int, int);
//    p = max;
//
//    int a = (*p)(1, 2);
//    Student *(*stuP)(char *, int);
//
//    stuP = createStudent;

//    stu = (*stuP)("张三", 13);
//    printf("%s,%d", stu->name, stu->age);

//    void (*pstring)(char *);
//    Student student = {"张三", 14, isSameStudent};
//    Student studentTwo = {"张三", 15, isSameStudentOther};

//    printf("%d\n", (*student.studentEquals)(student, studentTwo));
//    printf("%d\n", (*studentTwo.studentEquals)(student, studentTwo));


//    pstring = printString;

//    p = max;
//    int a = (*p)(3, 5);
////    printf("%d", a);
//
//    (*pstring)("abcde");

    return 0;
}