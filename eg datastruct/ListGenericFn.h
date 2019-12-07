//
// Created by 李熠 on 2019/12/7.
//

#ifndef DATASTRUCT_LISTGENERICFN_H
#define DATASTRUCT_LISTGENERICFN_H

#include <string.h>
#include <stdio.h>
#include <stdlib.h>

enum BOOL {
    FALSE, TRUE
};

typedef void (*PrintFn)(int index, void *string);

typedef void *(*MalElemFn)(void *);

typedef void (*FreeElemFn)(void *);

typedef enum BOOL (*ElemEqualsFn)(void *, void *);

typedef int (*CountElemSizeFn)(void *);


typedef struct ListGenericFn {
    PrintFn printElem;

    MalElemFn malElem;

    FreeElemFn freeElem;

    ElemEqualsFn elemEquals;

    CountElemSizeFn countElemSize;
} ListGenericFn;

enum BOOL strEquals(void *, void *);

int countStrSize(void *one);

void printStr(int, void *);

void *createStr(void *);


#endif //DATASTRUCT_LISTGENERICFN_H
