//
// Created by 李熠 on 2019/10/10.
//
#include "stack.h"

int main(void) {

    Stack *stack = stackNew(STRING, NULL);
    printf("%d\n", stackIsEmpty(stack));
    stackPush(stack, "1");
    stackPush(stack, "2");
    stackPush(stack, "3");
    stackPush(stack, "4");

    printf("%d\n", stackIsEmpty(stack));
    printf("%s\n", stackPeek(stack));
    printf("%s\n", stackPop(stack));
    printf("%s\n", stackPeek(stack));

    printf("%d", stackSearch(stack, "2"));

    stackDestroy(stack);

    return 0;

}
