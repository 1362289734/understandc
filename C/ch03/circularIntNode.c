#include "circularIntNode.h"

CircularIntNode *circularIntNodeCreate() {
    CircularIntNode *node = (CircularIntNode *) malloc(sizeof(CircularIntNode));
    node->next = NULL;
    node->value = JUDGE_NUM;
    return node;
}

void circularIntNodeDestroy(CircularIntNode *);

void circularIntNodeDisplay(const CircularIntNode *list) {
    CircularIntNode *node = list->next;
    int i = 0;
    while (node->next != list->next) {
        node = node->next;
        printf("[%02d]=%2d ", i, node->value);
        i++;
        if (i % 10 == 0)printf("\n"); //每读10个元素换行
    }
    printf("\n");
}

/**
 * 结尾追加元素
 * @param node
 * @param elem
 */
void circularIntNodeAdd(CircularIntNode *node, int elem) {
    CircularIntNode *list = circularIntNodeCreate();
    if (node->next == NULL) {
        // 添加第一个元素
        node->next = list;
        list->value = elem;
        list->next = list;
    } else {
        while (list->next != node->next) {
            list = list->next;
        }
        CircularIntNode *p = circularIntNodeCreate();
        list->next = p;
        p->value = elem;
        p->next = node->next;
    }
}

/**
 * 删除指定位置的数据
 * @param list
 * @param index
 * @return 1成功删除，0index不合法或者是超出范围
 */
int circularIntNodeDelete(CircularIntNode *list, int index) {
    CircularIntNode *node = list, *temp;
    int i = 0;
    printf("删除第%d位的数据\n", index);
    while (node->next->value != JUDGE_NUM && i < index - 1) {
        node = node->next;
        i++;
    }
    if (node->next->value == JUDGE_NUM || i > index - 1) {
        printf("删除失败\n");
        return 0;
    } else {
        temp = node->next;
        node->next = temp->next;
        free(temp);
        printf("删除成功\n");
        return 1;
    }


}

/**
 * 删除指定节点
 * @param node
 * @return
 */
int circularIntNodeDeleteNode(CircularIntNode *head, CircularIntNode *node);

/**
 * 删除第一个遇到的元素，注意后续的元素依次前移，并且修改length
 * @param list
 * @param elem
 * @return 1成功删除，0元素没有查找到
 */
int circularIntNodeDeleteElem(CircularIntNode *list, int elem);

/**
 * 将数据倒序
 * @param list
 */
void circularIntNodeRevert(CircularIntNode *list);

/**
 * 向指定位置插入数据，后面的数据后移，如果插入的位置超过最大位置，则提示插入失败，返回0
 * @param list
 * @param index
 * @param elem
 * @return 插入成功返回1，失败返回0
 */
int circularIntNodeInsert(CircularIntNode *list, int index, int elem);

/**
 * 更新指定位置的数据
 * @param list
 * @param index
 * @param elem
 * @return 更新成功返回1，传入的index不合法返回0
 */
int circularIntNodeUpdate(CircularIntNode *list, int index, int elem);

/**
 * 查询指定位置的数字
 * @param list
 * @param index
 * @return index不合法返回0
 */
int circularIntNodeGet(CircularIntNode *list, int index);