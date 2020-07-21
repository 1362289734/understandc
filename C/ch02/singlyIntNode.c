#include "singlyIntNode.h"

SinglyIntNode *singlyIntNodeCreate() {
	SinglyIntNode *node = malloc(sizeof(SinglyIntNode));   //申请动态内存空间
	node->value = 0;              //设置单链表为空表
	node->next = NULL;
	return node;
}


void singlyIntNodeDisplay(const SinglyIntNode *head) {
	SinglyIntNode *curNode = head->next;
	int count = 0;
	while (curNode != NULL) {
		printf("[%d]=%d ", count++, curNode->value);
		if (count + 1 % 10 == 0) {
			printf("\n");
		}
		curNode = curNode->next;
	}
	printf("\n");
}

void singlyIntNodeAdd(SinglyIntNode *head, int elem) {

	SinglyIntNode *lastNode = head;
	while (lastNode->next != NULL) {
		lastNode = lastNode->next;
	}

	SinglyIntNode *node = singlyIntNodeCreate();
	lastNode->next = node;
	node->value = elem;
}


int singlyIntNodeDelete(SinglyIntNode *list, int index)
{
	SinglyIntNode *node = list;
	SinglyIntNode *test;
	int i = 0;
	while (list->next&&i < index - 1)
	{
		list = list->next;          //找到要删除位置的前驱
		i++;
	}
	if (!(list->next) || i > index - 1)
	{
		printf("删除失败\n");
		return 0;
	}
	else
	{
		test = list->next;
		list->next = test->next;
		free(test);
		printf("删除成功\n");
		return 1;
	}
}



int singlyIntNodeDeleteElem(SinglyIntNode *list, int elem)
{
	SinglyIntNode *node = list;
	SinglyIntNode *test;
	int i = 0;
	while (list->next&&i < elem - 1)
	{
		list = list->next;          //找到要删除位置的前驱
		i++;
	}
	if (!(list->next) || i > elem - 1)
	{
		printf("删除失败\n");
		return 0;
	}
	else
	{
		test = list->next;
		list->next = test->next;
		free(test);
		printf("删除成功\n");
		return 1;
	}
}



int  singlyIntNodeRevert(SinglyIntNode *list)
{
	SinglyIntNode *current, *p;
	if (list == NULL)
	{
		printf("倒序失败\n");
		return 0;
	}
	current = list->next;       //定义当前结点 current，初始值为首元结点
	while (current->next != NULL)
	{
		p = current->next;     //定义当前结点的后继结点为p
		current->next = p->next;   //当前结点的后继指向p的后继结点
		p->next = list->next;      // p 的后继直接指向首元节点（第一个元素的结点）
		list->next = p;            //头结点指向 p
	}
	printf("倒序成功\n");
	return list;
}


int singlyIntNodeInsert(SinglyIntNode *list, int index, int elem)
{
	int i = 0;
	SinglyIntNode *p = list;           //声明一个结点 p，指向头结点 
	SinglyIntNode *s = malloc(sizeof(SinglyIntNode));     //生成一个新的结点s,为s申请动态内存空间（作为新插入的结点）
	while (p->next && i < index - 1)     // 寻找第index个结点（位置） 
	{
		p = p->next;
		i++;
	}
	if (!(p->next) || i > index - 1)
	{
		printf("插入元素失败\n");
		return 0;   // 第index个元素不存在 
	}
	s->value = elem;
	s->next = p->next;      // 将p的后继结点赋值给s的后继  
	p->next = s;          // 将s赋值给p的后继 
	printf("插入元素成功\n");
	return 1;
}


int singlyIntNodeUpdate(SinglyIntNode *list, int index, int elem)
{
	int i = 0;
	SinglyIntNode *p = list;
	while (p->next && i < index - 1)     // 寻找第index个结点（位置） 
	{
		p = p->next;
		i++;
	}
	if (!(p->next) || i > index - 1)
	{
		printf("插入元素失败\n");
		return 0;   // 第index个元素不存在 
	}
	p = p->next;
	p->value = elem;
	printf("更新成功\n");
	return 1;
}


int singlyIntNodeGet(SinglyIntNode *list, int index)
{
	SinglyIntNode *p = list;
	int i = 0;
	while (p->next&&i < index)
	{
		p = p->next;
		i++;
	}
	if (i > index)
	{
		printf("index不合法\n");
		return 0;
	}
	printf("第%d个元素的值是：%d", index, p->value);
}


int singlyIntNodeGetLength(SinglyIntNode *list) {
	int i = 0;
	SinglyIntNode *p;
	if (list->next == NULL) {
		return 0;
	}
	else {
		p = list->next;
		while (p) {
			i++;
			p = p->next;
		}
		return i;
	}
}

void singlyIntNodeSerializeB(SinglyIntNode *list, FILE *file) {
}

SinglyIntNode *singlyIntNodeDeserializeB(FILE *file) {

}

void singlyIntNodeSerialize(SinglyIntNode *list, FILE *file) {
	if (list == NULL || file == NULL) {
		printf("输入不合法！");
		return;
	}
	SinglyIntNode *p = list;

	/*
	fprintf(file, "%d ", list->length);
	for (int i = 0; i < list->length; ++i) {
		fprintf(file, "%d ", list->data[i]);
	}
	*/
	fprintf(file, "%d ", singlyIntNodeGetLength(list));
	for (int i = 0; i < singlyIntNodeGetLength(list); ++i) {
		p = p->next;
		fprintf(file, "%d ", p);
	}

}

SinglyIntNode *singlyIntNodeDeserialize(FILE *file) {
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
	SinglyIntNode *list;
	int content;
	int readRlt = 0;

	for (int i = 0; i < length; i++) {
		readRlt = fscanf(file, "%d", &content);
		if (readRlt == 0) {
			printf("解析文件内容失败");
			return NULL;
		}
		singlyIntNodeAdd(list, content);
	}

	return list;
}