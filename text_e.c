#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int  main(int argc, char const *argv[])
{
	int sn[100];
	int ran[100];
	int a=0;

	for (int i = 0; i < 4; ++i)
	{
		loop:
			srand((unsigned)time(NULL));
			ran[i]=rand()%10;
			for (int j = 0; j < i; ++j)
			{
				if(ran[i]==ran[j]){
					goto loop;
				}
			}
	}
	int beg=1;
	while(beg=1){
		printf("请输入4个不重复的数字。\n");
		for (int i = 0; i < 4 ; ++i)
		{
		scanf("%d",&sn[i]);
		}
		int rightnum=0,placenum=0;;
		for (int i = 0; i < 4; ++i)
		{
			for (int j = 0; j < 4; ++j)
			{
				/* code */
				if(ran[i]==sn[j])
				{
					rightnum++;
					if(i==j)
					{
						placenum++;
					}
				}
			}
		}
		if (placenum == 4 && rightnum == 4)
		{
			printf("回答正确\n");
			beg=0;
			break;
		}else{
			printf("包含了%d个正确的数字\n",rightnum);
			printf("%d个数字的位置正确\n", placenum);
			printf("\n\n");
			beg=1;
		}
	}

	return 0;
}