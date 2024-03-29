#include <stdio.h>
#include <stdlib.h>
#define JUDGE_NUM 9999
typedef struct CircularIntNode {
    // 指向下一个节点
    struct CircularIntNode *next;
    // 保存的值
    int value;
} CircularIntNode;

CircularIntNode *circularIntNodeCreate();

void circularIntNodeDestroy(CircularIntNode *);

void circularIntNodeDisplay(const CircularIntNode *);

/**
 * 结尾追加元素
 * @param node
 * @param elem
 */
void circularIntNodeAdd(CircularIntNode *node, int elem);

/**
 * 删除指定位置的数据
 * @param list
 * @param index
 * @return 1成功删除，0index不合法或者是超出范围
 */
int circularIntNodeDelete(CircularIntNode *list, int index);

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
