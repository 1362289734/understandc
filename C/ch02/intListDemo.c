#include "intList.h"

enum BOOL {
    FALSE, TRUE
};

typedef struct Student {
    char name[20];
    int age;
} Student;


Student *createStudent(char *name, int age) {
    Student *rlt = malloc(sizeof(Student));
    memcpy(rlt->name, name, strlen(name) + 1);
    rlt->age = age;
    return rlt;
}

int main(void) {

    Student* (*load)(char*,int);
    load = createStudent;
    Student *zhangsan = (*load)("张三",18);
    printf("name:%s,age:%d\n",zhangsan->name,zhangsan->age);



    return  0;

//    FILE *file = fopen("./datab.dat", "rb");
//    if (file == NULL) {
//        printf("文件打开失败");
//    }
//
////    int input1 = 1234;
////    int input2 = 2234;
////    fwrite(&input1, sizeof(int), 1, file);
////    fwrite(&input2, sizeof(int), 1, file);
//
////    fprintf(file, "%d %d", 1234, 2234);
//    int input1, input2;
////    fscanf(file, "%d %d", &input1, &input2);
//    fread(&input1, sizeof(int), 1, file);
//    fread(&input2, sizeof(int), 1, file);
//    printf("%d,%d\n", input1, input2);
//    fclose(file);


//    FILE *file = fopen("./data.dat", "w");
//    IntList *list = intListNew();
//    for (int i = 0; i < 15; ++i) {
//        intListAdd(list, i + 1);
//    }
//
//    intListDisplay(list);
//
//    serialize(list,file);
//
//    fclose(file);

//    FILE *file = fopen("./datab.dat", "wb");
////    IntList *list = deserialize(file);
//    IntList *list = intListNew(SIZE_STEP);
//    for (int i = 0; i < 15; ++i) {
//        intListAdd(list, i + 1);
//    }
//
//    intListDisplay(list);
//
//    serializeB(list,file);
//
//    fclose(file);


//    FILE *file = fopen("./datab.dat", "rb");
//    IntList *list = deserializeB(file);
////    IntList *list = intListNew(SIZE_STEP);
////    for (int i = 0; i < 15; ++i) {
////        intListAdd(list, i + 1);
////    }
//
//    intListDisplay(list);
//
////    serializeB(list,file);
//
//    fclose(file);
//
////    intListUpdate(list, 2, 10);
////    intListDisplay(list);
////    intListDelete(list, 1);
////    intListDisplay(list);
////    printf("get:%d", intListGet(list, 2));
////
//    intListDestroy(list);
}