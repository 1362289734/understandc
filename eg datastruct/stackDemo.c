//
// Created by 李熠 on 2019/10/10.
//

#include "stack.h"

int main(void) {
    SeqList *seqListAddr = seqListCreate();
    seqStackPush(seqListAddr,5);
    seqStackPush(seqListAddr,15);
    seqStackPush(seqListAddr,25);
    seqListDisplay(seqListAddr);
    printf("%d\n",seqStackPop(seqListAddr));
    seqListDisplay(seqListAddr);

    SinglyIntNode *singlyListAddr = singlyIntNodeCreate();
    linkedStackPush(singlyListAddr,15);

    return 0;
}