#include "circularIntNode.h"

int main(void) {
    CircularIntNode *list = circularIntNodeCreate();

    for (int i = 1; i <= 20; ++i) {
        circularIntNodeAdd(list,i);
    }
    printf("asd\n");
    circularIntNodeDisplay(list);

//    circularIntNodeDelete(list,7);
//    circularIntNodeDisplay(list);




    return 0;
}