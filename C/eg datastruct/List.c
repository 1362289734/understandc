
#include "List.h"

void freeListNode(const List *list, ListNode *curNode);

void removeNextNode(const List *list, ListNode *node);

void loadFn(enum ListNodeType type, List *list, ListGenericFn *listGenericFn);

void loadSingleFn(List *list, void *funcP);

ListNode *createListNode() {
    ListNode *rlt = malloc(sizeof(ListNode));
    rlt->next = NULL;
    rlt->value = NULL;
    return rlt;
}

/**
 * list->head 节点用于保存链表有效数据的长度，保存的第一个数据位于head->next
 * @param type
 * @param listGenericFn
 * @return
 */
List *listNew(enum ListNodeType type, ListGenericFn *listGenericFn) {
    List *rlt = (List *) calloc(1, sizeof(List));
    rlt->head = (ListNode *) calloc(1, sizeof(ListNode));
    rlt->head->value = malloc(sizeof(int));
    rlt->tail = rlt->head;
    *((int *) rlt->head->value) = 0;
    loadFn(type, rlt, listGenericFn);
    return rlt;
}

/**
 * 根据类型提供默认的方法，如果传入的方法集合不是NULL，则使用其中的非NULL方法覆盖默认方法
 * @param type
 * @param list
 * @param listGenericFn
 */
void loadFn(enum ListNodeType type, List *list, ListGenericFn *listGenericFn) {
    if (listGenericFn != NULL) {
        list->listGenericFn = *listGenericFn;
    }

    switch (type) {
        case STRING:
            if (list->listGenericFn.printElem == NULL) {
                list->listGenericFn.printElem = printStr;
            }
            if (list->listGenericFn.malElem == NULL) {
                list->listGenericFn.malElem = createStr;
            }
            if (list->listGenericFn.elemEquals == NULL) {
                list->listGenericFn.elemEquals = strEquals;
            }
            if (list->listGenericFn.countElemSize == NULL) {
                list->listGenericFn.countElemSize = countStrSize;
            }
            break;
        default:
            if (list->listGenericFn.elemEquals == NULL) {
                list->listGenericFn.elemEquals = defaultEquals;
            }
            break;
    }
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
    if (list->listGenericFn.freeElem != NULL) {
        (*list->listGenericFn.freeElem)(curNode->value);
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
    if (list->listGenericFn.malElem != NULL) {
        newElem = (*list->listGenericFn.malElem)(elem);
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
        if (list->listGenericFn.printElem != NULL) {
            (*list->listGenericFn.printElem)(index++, curNode->value);
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

/**
 * 删除节点，但是不释放该节点数据，将该节点数据返回
 * @param list
 * @param index
 * @return
 */
void *listDeleteWithNoFree(List *list, int index) {
    if (index > listLength(list) - 1 || index < 0) {
        printf("index 不合法");
        return 0;
    }

    ListNode *node = list->head;
    for (int i = 0; i < index; i++) {
        node = node->next;
    }

    ListNode *temp = node->next->next;
    void *rlt = node->next->value;
    free(node->next);
    node->next = temp;
    (*((int *) list->head->value))--;
    return rlt;
}

int listDeleteElem(List *list, void *elem) {
    ListNode *node = list->head;

    while (node->next != NULL) {
        if (list->listGenericFn.elemEquals != NULL) {
            if ((*list->listGenericFn.elemEquals)(node->next->value, elem)) {
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

void *listGet(List *list, int index) {
    if (index > listLength(list) - 1 || index < 0) {
        printf("index 不合法");
        return 0;
    }
    ListNode *node = list->head->next;
    for (int i = 0; i < index; ++i) {
        node = node->next;
    }

    return node->value;

}

int listGetIndex(List *list, void *elem) {
    ListNode *curNode = list->head->next;
    for (int i = 0; i < listLength(list); ++i) {
        if ((*list->listGenericFn.elemEquals)(curNode->value, elem)) {
            return i;
        }
        curNode = curNode->next;
    }
    return -1;
}

void listSerialize(List *list, FILE *file) {
    fwrite(list->head->value, sizeof(int), 1, file);
    ListNode *node = list->head->next;
    while (node != NULL) {
        int elemSize = (*list->listGenericFn.countElemSize)(node->value);
        fwrite(&elemSize, sizeof(int), 1, file);
        fwrite(node->value, elemSize, 1, file);
        node = node->next;
    }
}

List *listDeserialize(FILE *file, enum ListNodeType type, ListGenericFn *listGenericFn) {
    List *list = listNew(type, listGenericFn);
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
