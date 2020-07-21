#include "singlyIntNode.h"

int main(void) {
//	FILE *fp;
//	fp = fopen("test.dat", "r");
//	SinglyIntNode *head = singlyIntNodeCreate();
//	//singlyIntNodeAdd(head, 1);
//	//singlyIntNodeAdd(head, 3);
//	//singlyIntNodeAdd(head, 4);
//	//singlyIntNodeAdd(head, 5);
//
//	singlyIntNodeDisplay(head);
//	//singlyIntNodeSerialize(head,fp);
//	singlyIntNodeDeserialize(fp);
//
//	fclose(fp);

	SinglyIntNode *head = singlyIntNodeCreate();
	singlyIntNodeAdd(head, 1);
	singlyIntNodeAdd(head, 3);
	singlyIntNodeAdd(head, 4);
	singlyIntNodeAdd(head, 5);
	singlyIntNodeDisplay(head); //展示链表的数据
	//singlyIntNodeGetLength(head); //获取链表的长度
	//singlyIntNodeDelete(head, 3); //删除链表的指定位置的元素
	//singlyIntNodeDisplay(head);
	//singlyIntNodeGetLength(head);
	/*singlyIntNodeDeleteElem(head, 3);
	singlyIntNodeDisplay(head);*/
	singlyIntNodeRevert(head);   //链表的倒序
	singlyIntNodeDisplay(head);
	/*
	singlyIntNodeInsert(head, 2, 2);   //链表的插入
	singlyIntNodeDisplay(head);
	singlyIntNodeUpdate(head, 2, 3);   //链表的更新
	singlyIntNodeDisplay(head);*/
	singlyIntNodeGet(head, 4);   //获取链表指定位置的元素的数据


	return 0;
}