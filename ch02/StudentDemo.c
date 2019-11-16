#include "studentList.h"

#define CLASS_SIZE 100


int main() {

	//    Student class[CLASS_SIZE];
	//
	//
	//    Student zhaosi = studentCreate(MALE,18,"赵四",1);
	//    Student zhangsan = studentCreate(MALE,19,"张三",2);
	//    studentAdd(class,zhaosi);
	//    studentAdd(class,zhangsan);
	//
	////    printf("%s\n",zhaosi.name);
	////    printf("%d\n",strlen(zhaosi.name));
	////    printf("%d\n",zhaosi.sex);
	//    studentDisplay(class);


	//    Student grade[CLASS_SIZE];
	//    Student *studentPArr[CLASS_SIZE];
	//
	//    Student zhangsan = {MALE,18,"张三",1};
	//    Student lisi = {MALE,20,"李四",2};
	//    Student wangwu = {FEMALE,22,"王五",3};
	//    Student zhaoliu = {FEMALE,19,"赵六",4};
	//
	//    grade[0] = zhangsan;
	//    grade[1] = lisi;
	//    grade[2] = wangwu;
	//    grade[3] = zhaoliu;
	//
	//    //打印学号为2 的人的名字
	//    for (int i = 0; i < CLASS_SIZE; ++i) {
	//        if(grade[i].number==2)
	//        {
	//            printf("学号为2的人的名字是：%s\n",grade[i].name);
	//        }
	//    }
	//
	//    for (int j = 0; j < CLASS_SIZE; ++j) {
	//        studentPArr[j] = grade+j;
	//        if(strlen(studentPArr[j]->name)==0)break;
	//        printf("name:%s,age:%d,number:%d,sex:%s\n",studentPArr[j]->name,
	//                studentPArr[j]->age,studentPArr[j]->number,studentPArr[j]->sex==1?"FEMALE":"MALE");
	//    }


	/*
	 * ************************
	 */
	 /*
		 Student class[CLASS_SIZE];

		 Student *stu = createStudent(18, MALE, "张三", 1);
		 Student *stu1 = createStudent(19, FEMALE, "李四", 2);
		 Student *stu2 = createStudent(19, MALE, "王五", 3);
		 Student *stu3 = createStudent(19, FEMALE, "赵六", 4);
		 addStudent(class, stu);
		 addStudent(class, stu1);
		 addStudent(class, stu2);
		 addStudent(class, stu3);
		 displayStudent(class);
		 search(class, 2);
		 deleteStudentByNum(class, 4);
		 displayStudent(class);
		 printf("\n");
		 updateStudentByNum(class,1,22,FEMALE,"黄渤霖");
		 displayStudent(class);


		 */


		 /*
		  * ************************
		  */
	StudentList *list = studentListNew(20);

	studentListAdd(list, 18, MALE, "黄柏林", 1);
	studentListAdd(list, 19, MALE, "张三", 2);
	studentListAdd(list, 20, MALE, "李四", 3);
	studentListAdd(list, 21, FEMALE, "王五", 4);
	studentListAdd(list, 22, FEMALE, "赵六", 5);
	studentListDisplay(list);

	printf("\n");

	studentListDelete(list, 3); //删除第几个元素
	studentListDisplay(list);
	printf("\n");

	studentListDeleteByElem(list, "张三"); //删除对应名字的元素
	studentListDisplay(list);
	printf("\n");

	studentListUpdate(list, 5, 10, MALE, "张三", 4);
	studentListDisplay(list);
	studentListUpdate(list, 5, 10, MALE, "张三", 2);
	studentListDisplay(list);
	printf("\n");

	GetJudge(studentListGet(list, 2));
	GetJudge(studentListGet(list, 3));
	printf("\n");

	studentListDestroy(list);

//	studentListDisplay(list);

	printf("111111\n");

	return 0;
}