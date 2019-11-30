//
// Created by 李熠 on 2019/10/10.
//
#include "circularIntNode.h"

CircularIntNode *circularIntNodeCreate() {
    CircularIntNode *rlt = (CircularIntNode *) malloc(sizeof(CircularIntNode));

    rlt->value = 0;
    rlt->next = NULL;
    return rlt;
}

void circularIntNodeAdd(CircularIntNode *head, int elem) {
    CircularIntNode *newNode = circularIntNodeCreate();
    CircularIntNode *lastNode = head->next;
    if (lastNode == NULL) {
        newNode->next = newNode;
        head->next = newNode;
    } else {
        while (lastNode->next != head->next) {
            lastNode = lastNode->next;
        }
        newNode->next = head->next;
        lastNode->next = newNode;
    }
    newNode->value = elem;
    head->value++;
}

void circularIntNodeDisplay(const CircularIntNode *head) {
    printf("circular node size=%d\n", head->value);
    if (head->next == NULL) {
        return;
    }
    CircularIntNode *curNode = head->next;
    int count = 0;
    while (curNode->next != head->next) {
        printf("[%d]=%d ", count++, curNode->value);
        curNode = curNode->next;
    }
    printf("[%d]=%d", count, curNode->value);
    printf("\n");
}

void circularIntNodeDestroy(CircularIntNode *head) {
    if (head->next == NULL) {
        free(head);
        return;
    }

    CircularIntNode *curNode = head;

    CircularIntNode *temp;
    while (curNode != head->next) {
        temp = curNode->next;
        free(curNode);
        curNode = temp;
    }
}

int circularIntNodeInsert(CircularIntNode *head, int index, int elem) {
    if (index < 0 || index >= head->value) {
        printf("index is illegal!");
        return 0;
    }
    CircularIntNode *newNode = circularIntNodeCreate();
    CircularIntNode *lastNode = head->next;
    CircularIntNode *firstNode = head->next;
    if (index == 0) {
        while (lastNode->next != head->next) {
            lastNode = lastNode->next;
        }
        newNode->next = firstNode;
        newNode->value = elem;
        lastNode->next = newNode;
        head->next = newNode;
        head->value++;
        return 1;
    }

    CircularIntNode *beforeIndexNode = head;
    for (int i = 0; i < index; ++i) {
        beforeIndexNode = beforeIndexNode->next;
    }

    newNode->next = beforeIndexNode->next;
    newNode->value = elem;
    beforeIndexNode->next = newNode;
    head->value++;
    return 1;

}

int circularIntNodeDelete(CircularIntNode *head, int index) {
    if (index < 0 || index >= head->value) {
        printf("index is illegal!");
        return 0;
    }

    CircularIntNode *lastNode = head->next;
    CircularIntNode *firstNode = head->next;
    CircularIntNode *deleteNode = head->next;
    if (index == 0) {
        while (lastNode->next != head->next) {
            lastNode = lastNode->next;
        }
        lastNode->next = deleteNode->next;
        head->next = deleteNode->next;
        head->value--;
        free(deleteNode);
        return 1;
    }

    CircularIntNode *beforeIndexNode = head;
    for (int i = 0; i < index; ++i) {
        beforeIndexNode = beforeIndexNode->next;
    }
    deleteNode = beforeIndexNode->next;
    beforeIndexNode->next = deleteNode->next;
    free(deleteNode);
    head->value--;
    return 1;

}

int circularIntNodeDeleteNode(CircularIntNode *head, CircularIntNode *deleteNode) {
    if (head->next == NULL) {
        return 0;
    }

    if (head->next == deleteNode && head->value == 1) {
        free(deleteNode);
        head->value--;
        head->next = NULL;
        return 1;
    } else if (head->next == deleteNode) {
        // 只有第一个元素的时候需要移动head的指向
        CircularIntNode *lastNode = head->next;
        // 找到末尾的元素
        while (lastNode->next != head->next) {
            lastNode = lastNode->next;
        }
        head->next = deleteNode->next;
        lastNode->next = head->next;
        free(deleteNode);
        head->value--;
        return 1;
    }

    int count = head->value;
    CircularIntNode *curNode = head->next;
    for (int i = 0; i < count; ++i) {
        if (curNode == NULL) {
            return 0;
        }

        if (curNode->next == deleteNode) {
            curNode->next = deleteNode->next;
            free(deleteNode);
            head->value--;
            return 1;
        }

        curNode = curNode->next;
    }
    return 0;
}

int circularIntNodeDeleteElem(CircularIntNode *head, int elem) {
    CircularIntNode *curNode = head->next;
    if (curNode == NULL) {
        return 0;
    }

    do {
        if (curNode->value == elem) {
            circularIntNodeDeleteNode(head, curNode);
            return 1;
        }
        curNode = curNode->next;
    } while (curNode != NULL && curNode != head->next);

    return 0;


}

void circularIntNodeRevert(CircularIntNode *list) {
    if (list->value <= 1) {
        return;
    }

    int count = list->value;
    CircularIntNode *firstNode = list->next;
    CircularIntNode *temp;
    CircularIntNode *curNode = list->next;
    CircularIntNode *beforeNode = list;
    // 最后一次执行完成后，beforeNode是最后一个节点
    // curNode 已经是第一个节点了
    for (int i = 0; i < count; i++) {
        temp = curNode->next;
        curNode->next = beforeNode;
        beforeNode = curNode;
        curNode = temp;
    }
    // 将头指向最后一个节点
    list->next = beforeNode;
    // 将第一个节点也指向最后一个节点，完成反向
    firstNode->next = beforeNode;
}