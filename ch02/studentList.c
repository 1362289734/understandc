#include "studentList.h"

StudentList *studentListNew(int initSize) {
	int listSize = 0;
	if (initSize <= 0) {
		listSize = SIZE_STEP;
	}
	else {
		listSize = initSize;
	}

	StudentList *rlt = (StudentList *)malloc(sizeof(StudentList));
	if (rlt == NULL) {
		printf("内存分配失败！");
		return NULL;
	}

	rlt->length = 0;
	rlt->data = (Student *)malloc(listSize * sizeof(Student));
	rlt->size = listSize;
	return rlt;
}

int studentListDestroy(StudentList *list) {
	//TODO

	Student *p = list->data;
	free(list);
	free(p);
	return 1;
}

void serializeB(StudentList *list, FILE *file);

StudentList *deserializeB(FILE *file);

void serialize(StudentList *list, FILE *file) {
	if (list == NULL || file == NULL) {
		printf("输入不合法！");
		return;
	}

	fprintf(file, "%d ", list->length);
	for (int i = 0; i < list->length; ++i) {
		fprintf(file, "姓名:%s，性别:%s，年龄:%d，学号:%d\n", list->data[i].name, list->data[i].sex == 1 ? "FEMANLE" : "MALE",
			list->data[i].age, list->data[i].number);
	}
}

StudentList *deserialize(FILE *file) {
	if (file == NULL) {
		printf("文件不合法!");
		return NULL;
	}
	int length = -1;
	fscanf(file, "%d", &length);
	if (length == -1) {
		printf("读取内容不合法！");
		return NULL;
	}
	StudentList *list = studentListNew(20);
	//int content;
	int readRlt = 0;

	for (int i = 0; i < length; i++) {
		//readRlt = fscanf(file, "%d", &content);
		if (readRlt == 0) {
			printf("解析文件内容失败");
			return NULL;
		}
		//studentListAdd(list, content);
	}

	return list;
}

/**
 *
 * @param list
 * @param elem
 * @return 1操作成功，0操作失败
 */
int studentListAdd(StudentList *list, int _age, SEX _sex, char *_name, int _num) {
	if (list == NULL) {
		return 0;
	}

	if (list->length == list->size) {
		list->data = realloc(list->data, (list->size + SIZE_STEP) * sizeof(Student));
		list->size += SIZE_STEP;
	}
	list->data[list->length].age = _age;
	list->data[list->length].sex = _sex;
	strcpy(list->data[list->length].name, _name);
	list->data[list->length].number = _num;
	list->length++;
	return 1;
}

int studentListDelete(StudentList *list, int index) {
	for (int i = index - 1; i < list->length; ++i) {
		list->data[i] = list->data[i + 1];
	}
	printf("删除成功！\n\n");
	list->length--;
	return 1;
}

/**
 * 根据名字进行删除，删除第一个找到的元素
 * @param list
 * @param elem
 * @return 1操作成功，0操作失败
 */
int studentListDeleteByElem(StudentList *list, char *elem) {
	int index = -1;
	printf("删除%s的信息!\n", elem);
	for (int i = 0; i < list->length; ++i) {
		for (int j = 0; j < strlen(list->data[i].name); ++j) {
			if (list->data[i].name[j] == elem[j]) {
				index = i;
				break;
			}
		}
	}
	if (index != -1) {
		return studentListDelete(list, index);
	}
	else {
		return 0;
	}
}

void studentListDisplay(StudentList *list) {
	for (int i = 0; i < list->length; ++i) {
		printf("姓名:%8s, 性别:%7s, 年龄:%2d, 学号:%02d", list->data[i].name, list->data[i].sex == 1 ? "FEMANLE" : "MALE",
			list->data[i].age, list->data[i].number);
		printf("\n");
	}
}

/**
 *
 * @param list
 * @param index
 * @param elem
 * @return  1操作成功，0操作失败
 */
int studentListUpdate(StudentList *list, int index, int age, SEX sex, char *name, int num) {
	int numberindex = 0;
	int placeindex = 0;
	if (list == NULL || index < 0 || index > list->length + 2) {
		printf("index 不合法\n");
		return 0;
	}
	for (int i = 0; i < list->length; ++i) {
		if (list->data[i].number == index) {
			numberindex = list->data[i].number;
			list->data[i].number = num;
			placeindex = i;
		}
	}
	for (int i = 0; i < list->length; ++i) {
		for (int j = i + 1; j < list->length; ++j) {
			if (list->data[i].number == list->data[j].number) {
				printf("更新失败！学号重复！\n");
				list->data[placeindex].number = numberindex;
				return 0;
			}
		}
	}
	list->data[placeindex].number = numberindex;
	for (int i = 0; i < list->length; ++i) {
		if (list->data[i].number == index) {

			strcpy(list->data[i].name, name);
			list->data[i].age = age;
			list->data[i].sex = sex;
			list->data[i].number = num;
		}
	}
	printf("更新成功！\n");
	return 1;
}


/**
 * 返回指定位置的元素
 * @param list
 * @param index
 * @return
 */
int studentListGet(StudentList *list, int index) {
	if (list == NULL || index < 0 || index > list->length + 2) {
		printf("index 不合法\n");
		return 0;
	}
	for (int i = 0; i < list->length; ++i) {
		if (list->data[i].number == index) {
			printf("学号为%d的学生信息是：", index);
			printf("姓名:%8s, 性别:%7s, 年龄:%2d, 学号:%02d", list->data[i].name, list->data[i].sex == 1 ? "FEMANLE" : "MALE",
				list->data[i].age, list->data[i].number);
			printf("\n");
			return 1;
		}
	}
	return 0;
}

//判断学号是否存在并输出
void GetJudge(int rlt) {
	if (rlt == 0) {
		printf("该学号不存在！\n");
	}
}