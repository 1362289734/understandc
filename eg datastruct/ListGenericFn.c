//
// Created by 李熠 on 2019/12/7.
//

#include "ListGenericFn.h"

int countStrSize(void *one) {
    return (int) (strlen((char *) one) + 1);
}

enum BOOL strEquals(void *one, void *two) {
    if (one != NULL && two != NULL) {
        return strcmp(one, two) == 0;
    } else if (one == NULL && two == NULL) {
        return TRUE;
    } else {
        return FALSE;
    }
}


void printStr(int index, void *string) {
    printf("[%d]=%s ", index, string);
    if (index + 1 % 10 == 0) {
        printf("\n");
    }
}

void *createStr(void *string) {
    void *rlt = malloc(sizeof(char) * (strlen((char *) string) + 1));
    memcpy(rlt, string, (strlen((char *) string) + 1));
    return rlt;
}