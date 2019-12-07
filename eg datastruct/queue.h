//
// Created by 李熠 on 2019/10/12.
//
#include "List.h"

struct Queue {
    List *list
} Queue;

//struct Queue {
//    Stack *data;
//    Stack *assist;
//} Queue;


Queue *queueNew(enum ListNodeType type, ListGenericFn *listGenericFn);

void queueDestroy(Queue *queue);

/**
 * 写入队列
 */
void queueOffer(Queue *, void *);

/**
 * 从队列中读取
 * @return
 */
void *queuePoll(Queue *);

/**
 * 查看队列顶端的元素，但是并不读取
 * @return
 */
void queuePeek(Queue *);

/**
 *
 * @return 为空返回1，否则返回0
 */
BOOL queueIsEmpty(Queue *);
