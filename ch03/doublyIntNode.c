#include "doublyIntNode.h"

DoublyIntNode *doublyIntNodeCreate() {
    DoublyIntNode *node = (DoublyIntNode *) malloc(sizeof(DoublyIntNode));
    node->value = 0;   //value当前的值
    node->next = NULL; //next下一个节点
    node->prev = NULL; // prev上一个节点
    return node;
}

void doublyIntNodeDestroy(DoublyIntNode *list) {
    DoublyIntNode *p;
    while (list !=NULL)
    {
        p = list->next;
        free(list);
        list = p;
    }
}

void doublyIntNodeDisplay(const DoublyIntNode *node) {
    DoublyIntNode *doublylist = node->next;
    int count = 0;
    while (doublylist != NULL) {
        printf("[%02d]=%2d ", count++, doublylist->value);
        if (count % 10 == 0) { //输出10个内容换一行
            printf("\n");
        }
        doublylist = doublylist->next;
    }
    printf("\n\n");
}

/**
 * 结尾追加元素
 * @param node
 * @param elem
 */
void doublyIntNodeAdd(DoublyIntNode *node, int elem) {
    DoublyIntNode *doublylist = node;
    //寻找空节点
    while (doublylist->next != NULL) {
        doublylist = doublylist->next;
    }
    DoublyIntNode *newnode = doublyIntNodeCreate();
    doublylist->next = newnode;
    newnode->prev = doublylist;
    newnode->next = NULL;
    newnode->value = elem;
}

/**
 * 删除指定位置的数据
 * @param list
 * @param index
 * @return 1成功删除，0index不合法或者是超出范围
 */
int doublyIntNodeDelete(DoublyIntNode *list, int index) {
    int i = 0;
    DoublyIntNode *node = list;
    while (list->next && i < index) {
        list = list->next;          //找到要删除位置的前驱
        i++;
    }
    printf("删除下标为%d的元素\n", index);
    doublyIntNodeDeleteElem(node, i + 1);
}

/**
 * 删除第一个遇到的元素，注意后续的元素依次前移，并且修改length
 * @param list
 * @param elem
 * @return 1成功删除，0元素没有查找到
 */
int doublyIntNodeDeleteElem(DoublyIntNode *list, int elem) {
    DoublyIntNode *test;
    int i = 0;
    while (list->next && i < elem - 1) {
        list = list->next;          //找到要删除位置的前驱
        i++;
    }
    printf("删除第%d位元素\n", elem);
    if (!(list->next) || i > elem - 1) {
        printf("删除失败\n");
        return 0;
    } else {
        list = list->next;
        list->prev->next = list->next;
        list->next->prev = list->prev;
        free(list);
        printf("删除成功\n");
        return 1;
    }
}

/**
 * 将数据倒序
 * @param list
 */
void doublyIntNodeRevert(DoublyIntNode *list) {
    DoublyIntNode *tail, *head, *first, *temp;
    if (list == NULL)printf("倒序失败\n");
//    index = list->next;
//    while (index->next != NULL) {
//        node = index->next;
//        index->next = node->next;
//        node->next = list->next;
//        list->next = node;
//    }
    head = list;
    first = head->next;
    int i = 0;
    while (list->next != NULL) { //查询最后一位元素的前驱
        temp = list->next;
        list->next = list->prev;
        list->prev = temp;
        list = list->prev;
        i++;
    }
    list->next = list->prev;
    list->prev = head;
    tail = list;
    tail->prev = head;
    head->next = tail;
    first->next = NULL;
    printf("倒序成功\n");
}

/**
 * 向指定位置插入数据，后面的数据后移，如果插入的位置超过最大位置，则提示插入失败，返回0
 * @param list
 * @param index
 * @param elem
 * @return 插入成功返回1，失败返回0
 */
int doublyIntNodeInsert(DoublyIntNode *list, int index, int elem) {
    DoublyIntNode *node = doublyIntNodeCreate();
    node->value = elem;
    int i = 0;
    printf("在第%d位插入数据:%d\n", index, elem);
    while (list->next && i < index - 1) {
        list = list->next;
        i++;
    }
    if (!(list->next) || i > index - 1) {
        printf("插入元素失败\n");
        return 0;
    }
    list = list->next;
    node->prev = list->prev;
    node->next = list;
    list->prev->next = node;
    list->prev = node;
    printf("插入元素成功\n");
    return 1;
}

/**
 * 更新指定位置的数据
 * @param list
 * @param index
 * @param elem
 * @return 更新成功返回1，传入的index不合法返回0
 */
int doublyIntNodeUpdate(DoublyIntNode *list, int index, int elem) {

    int i = 0;
    while (list->next && i < index - 1) {//获得指定位置的前驱
        list = list->next;
        i++;
    }
    printf("将第%d位的元素改为%d\n", index, elem);
    if (!(list->next) || i > index - 1) {
        printf("更新元素失败\n");
        return 0;
    }
    list = list->next;
    list->value = elem;
    return 1;
}

/**
 * 查询指定位置的数字
 * @param list
 * @param index
 * @return index不合法返回0
 */
int doublyIntNodeGet(DoublyIntNode *list, int index) {
    int i = 0;
    while (list->next && i < index - 1) {//获取指定位置的前驱
        list = list->next;
        i++;
    }
    printf("获取第%d位的元素：", index);
    if (list == NULL || i > index - 1) {
        printf("获取失败\n");
        return 0;
    }
    list = list->next;
    printf("%d\n", list->value);
    return 1;
}