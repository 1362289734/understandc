#include "Student.h"
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#define SIZE_STEP 20

typedef struct StudentList {
	// 当前存放内容的长度
	int length;
	// 存放数据的内存的首地址
	Student *data;
	// 总共分配的内存空间
	int size;
} StudentList;

StudentList *studentListNew(int initSize);

int studentListDestroy(StudentList *);

void serializeB(StudentList *list, FILE *file);

StudentList *deserializeB(FILE *file);

void serialize(StudentList *list, FILE *file);

StudentList *deserialize(FILE *file);

/**
 *
 * @param list
 * @param elem
 * @return 1操作成功，0操作失败
 */
int studentListAdd(StudentList *list, int age, SEX sex, char *name, int num);

int studentListDelete(StudentList *list, int index);

/**
 * 根据名字进行删除，删除第一个找到的元素
 * @param list
 * @param elem
 * @return 1操作成功，0操作失败
 */
int studentListDeleteByElem(StudentList *list, char *elem);

void studentListDisplay(StudentList *list);

/**
 *
 * @param list
 * @param index
 * @param elem
 * @return  1操作成功，0操作失败
 */
int studentListUpdate(StudentList *list, int index, int age, SEX sex, char *name, int num);

/**
 * 返回指定位置的元素
 * @param list
 * @param index
 * @return
 */
int studentListGet(StudentList *list, int index);

void GetJudge(int rlt);