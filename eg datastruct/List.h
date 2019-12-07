
#include <stdio.h>
#include <stdlib.h>
#include "ListGenericFn.h"

enum ListNodeType {
    STRING, INT, STRUCT
};

typedef struct ListNode {
    // 指向下一个节点
    struct ListNode *next;
    // 保存的值
    void *value;
} ListNode;

typedef struct List {
    ListNode *head;
    ListNode *tail;
    ListGenericFn listGenericFn;
} List;


/**
 * @param ListNodeType 指定需要存放的数据类型，STRUCT结构所有的默认方法为NULL
 * @param listGenericFn NULL 表示使用默认提供的元素操作方法，可以自定义方法覆盖默认的方法
 * @return
 */
List *listNew(enum ListNodeType, ListGenericFn *listGenericFn);

int listLength(List *);

void listDestroy(List *);

void listDisplay(const List *);

/**
 * 结尾追加元素
 * @param list
 * @param elem
 * @return 追加的元素地址
 */
void *listAppend(List *list, void *elem);

/**
 * 删除指定位置的数据
 * @param list
 * @param index
 * @return 1成功删除，0index不合法或者是超出范围
 */
int listDelete(List *list, int index);

/**
 * 删除第一个遇到的元素，注意后续的元素依次前移，并且修改length
 * @param list
 * @param elem
 * @return 1成功删除，0元素没有查找到
 */
int listDeleteElem(List *list, void *elem);

/**
 * 将数据倒序
 * @param list
 */
void listRevert(List *list);

/**
 * 向指定位置插入数据，后面的数据后移，如果插入的位置超过最大位置，则提示插入失败，返回0
 * @param list
 * @param index
 * @param elem
 * @return 插入成功返回1，失败返回0
 */
void *listInsert(List *list, int index, void *elem);

/**
 * 更新指定位置的数据
 * @param list
 * @param index
 * @param elem
 * @return 更新成功返回1，传入的index不合法返回0
 */
void *listUpdate(List *list, int index, void *elem);

/**
 * 查询指定位置的数字
 * @param list
 * @param index
 * @return index不合法返回0
 */
void *listGet(List *list, int index);

void listSerialize(List *list, FILE *file);

List *listDeserialize(FILE *, enum ListNodeType, ListGenericFn *listGenericFn);
