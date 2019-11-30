
#include "List.h"

void freeListNode(const List *list, ListNode *curNode);

void removeNextNode(const List *list, ListNode *node);

ListNode *createListNode() {
    ListNode *rlt = malloc(sizeof(ListNode));
    rlt->next = NULL;
    rlt->value = NULL;
    return rlt;
}

List *listNew() {
    List *rlt = (List *) malloc(sizeof(List));
    rlt->head = (ListNode *) malloc(sizeof(ListNode));
    rlt->head->value = malloc(sizeof(int));
    rlt->tail = rlt->head;
    *((int *) rlt->head->value) = 0;
    rlt->head->next = NULL;
    rlt->freeElem = NULL;
    rlt->printElem = NULL;
    rlt->malElem = NULL;
    rlt->elemEquals = NULL;
    rlt->countElemSize = NULL;
    return rlt;
}

void listDestroy(List *list) {
    ListNode *curNode = list->head->next;
    ListNode *temp = NULL;
    while (curNode != NULL) {
        temp = curNode->next;
        freeListNode(list, curNode);
        curNode = temp;
    }


    free(list->head->value);
    free(list->head);
    free(list);
}

void freeListNode(const List *list, ListNode *curNode) {
    if (list->freeElem != NULL) {
        (*list->freeElem)(curNode->value);
    } else {
        free(curNode->value);
    }
    free(curNode);
}

void *listAppend(List *list, void *elem) {
    if (elem == NULL) {
        printf("elem is NULL");
        return NULL;
    }
    ListNode *newNode = createListNode();
    void *newElem = NULL;
    if (list->malElem != NULL) {
        newElem = (*list->malElem)(elem);
    } else {
        newElem = elem;
    }
    newNode->value = newElem;
    list->tail->next = newNode;
    list->tail = newNode;
    (*((int *) list->head->value))++;
    return newNode->value;
}

int listLength(List *list) {
    return (*((int *) list->head->value));
}

void listDisplay(const List *list) {
    ListNode *curNode = list->head->next;
    int index = 0;

    while (curNode != NULL) {
        if (list->printElem != NULL) {
            (*list->printElem)(index++, curNode->value);
        }
        curNode = curNode->next;
    }
    printf("\n");
}

int listDelete(List *list, int index) {
    if (index > listLength(list) - 1 || index < 0) {
        printf("index 不合法");
        return 0;
    }

    ListNode *node = list->head;
    for (int i = 0; i < index; i++) {
        node = node->next;
    }

    ListNode *temp = node->next->next;
    freeListNode(list, node->next);
    node->next = temp;
    (*((int *) list->head->value))--;
    return 1;
}

int listDeleteElem(List *list, void *elem) {
    ListNode *node = list->head;

    while (node->next != NULL) {
        if (list->elemEquals != NULL) {
            if ((*list->elemEquals)(node->next->value, elem)) {
                removeNextNode(list, node);
                return 1;
            }
        } else {
            if (node->next->value == elem) {
                removeNextNode(list, node);
                return 1;
            }
        }
        node = node->next;
    }
    return 0;
}

void removeNextNode(const List *list, ListNode *node) {
    ListNode *temp = node->next->next;
    freeListNode(list, node->next);
    node->next = temp;
    (*((int *) list->head->value))--;
}

void listSerialize(List *list, FILE *file) {
    fwrite(list->head->value, sizeof(int), 1, file);
    ListNode *node = list->head->next;
    while (node != NULL) {
        int elemSize = (*list->countElemSize)(node->value);
        fwrite(&elemSize, sizeof(int), 1, file);
        fwrite(node->value, elemSize, 1, file);
        node = node->next;
    }
}

List *listDeserialize(FILE *file,
                      MalElemFn createString, PrintFn printString, ElemEqualsFn strEquals, CountElemSizeFn countStrSize
) {
    List *list = listNew();
    list->malElem = createString;
    list->printElem = printString;
    list->elemEquals = strEquals;
    list->countElemSize = countStrSize;
    int size;
    int totalSize;
    fread(&totalSize, sizeof(int), 1, file);
    for (int i = 0; i < totalSize; i++) {
        fread(&size, sizeof(int), 1, file);
        void *temp = malloc(size);
        fread(temp, size, 1, file);
        listAppend(list, temp);
        free(temp);
    }
    return list;
}
