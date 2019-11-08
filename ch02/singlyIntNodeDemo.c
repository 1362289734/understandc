#include "singlyIntNode.h"

int main(void) {
	FILE *fp;
	fp = fopen("test.dat", "r");
	SinglyIntNode *head = singlyIntNodeCreate();
	//singlyIntNodeAdd(head, 1);
	//singlyIntNodeAdd(head, 3);
	//singlyIntNodeAdd(head, 4);
	//singlyIntNodeAdd(head, 5);

	singlyIntNodeDisplay(head);
	//singlyIntNodeSerialize(head,fp);
	singlyIntNodeDeserialize(fp);


	fclose(fp);

	/*SinglyIntNode *head = singlyIntNodeCreate();
	singlyIntNodeAdd(head, 1);
	singlyIntNodeAdd(head, 3);
	singlyIntNodeAdd(head, 4);
	singlyIntNodeAdd(head, 5);
	singlyIntNodeDisplay(head);
	//singlyIntNodeGetLength(head);
	//singlyIntNodeDelete(head, 3);
	//singlyIntNodeDisplay(head);
	//singlyIntNodeGetLength(head);
	/*singlyIntNodeDeleteElem(head, 3);
	singlyIntNodeDisplay(head);*/
	/*singlyIntNodeRevert(head);
	singlyIntNodeDisplay(head);
	singlyIntNodeInsert(head, 2, 2);
	singlyIntNodeDisplay(head);
	singlyIntNodeUpdate(head, 2, 3);
	singlyIntNodeDisplay(head);
	singlyIntNodeGet(head, 4);
	*/




	return 0;
}