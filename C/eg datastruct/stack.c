//
// Created by 李熠 on 2019/10/10.
//
#include "stack.h"


Stack *stackNew(enum ListNodeType type, ListGenericFn *listGenericFn) {
    Stack *rlt = malloc(sizeof(Stack));

    rlt->list = listNew(type, listGenericFn);
    return rlt;
}

Stack *stackDestroy(Stack *stack) {
    listDestroy(stack->list);
    free(stack);
}

/**
 * 出栈的元素需要手动释放
 * @param stack
 * @return
 */
void *stackPop(Stack *stack) {
    return listDeleteWithNoFree(stack->list, listLength(stack->list) - 1);
}

void *stackPush(Stack *stack, void *elem) {
    return listAppend(stack->list, elem);
}

enum BOOL stackIsEmpty(Stack *stack) {
    return listLength(stack->list) == 0;
}

void *stackPeek(Stack *stack) {
    return listGet(stack->list, listLength(stack->list) - 1);
}

int stackSearch(Stack *stack, void *elem) {
    return listGetIndex(stack->list, elem);
}
