#include "doublyIntNode.h"

int main(void) {
    DoublyIntNode *list = doublyIntNodeCreate();

    for (int i = 0; i < 20; ++i) {
        doublyIntNodeAdd(list,i+1);
    }
    doublyIntNodeDisplay(list);

    doublyIntNodeDeleteElem(list,2);
    doublyIntNodeDisplay(list);

    doublyIntNodeDelete(list,5);
    doublyIntNodeDisplay(list);

    doublyIntNodeInsert(list,5,6);
    doublyIntNodeDisplay(list);

    doublyIntNodeRevert(list);
    doublyIntNodeDisplay(list);


    doublyIntNodeUpdate(list,8,33);
    doublyIntNodeDisplay(list);

    doublyIntNodeGet(list,8);

    doublyIntNodeDestroy(list);

    return 0;
}