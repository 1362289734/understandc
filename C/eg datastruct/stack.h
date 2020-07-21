//
// Created by 李熠 on 2019/10/10.
//
#include "List.h"

typedef struct Stack {
    List *list;
} Stack;

/**
 * 创建栈
 * @return
 */
Stack *stackNew(enum ListNodeType, ListGenericFn *);


Stack *stackDestroy(Stack *);

/**
 * 返回位于栈顶的元素，并在堆栈中删除它
 * @param list
 * @return  栈顶的元素
 */
void *stackPop(Stack *);

/**
 * 将element压入堆栈，同时也返回element
 * @param elem
 * @return
 */
void *stackPush(Stack *list, void *elem);

/**
 * @param
 * @return 如果堆栈是空的，则返回TRUE，当堆栈包含元素时，返回FALSE
 */
enum BOOL stackIsEmpty(Stack *);

/**
 *
 * @param list
 * @return 返回位于栈顶的元素，但是并不在堆栈中删除它
 */
void *stackPeek(Stack *);

/**
 * 在堆栈中搜索element，如果发现了，则返回它相对于栈顶的偏移量。否则，返回-1。
 * @param elem
 * @return
 */
int stackSearch(Stack *, void *);
