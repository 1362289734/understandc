#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int  main(int argc, char const *argv[])
{
	int sn[100];
	int rn[10] = { 0,1,2,3,4,5,6,7,8,9 };
	int rannum;
	int index = 10;
	int ran[10];

	for (int r = 10; r > 6; r--)
	{
		srand((unsigned)time(NULL));
		rannum = rand() % r + 1;
		rn[index] = rn[rannum];
		rn[rannum] = rn[r - 2];
		rn[r - 2] = rn[index];
	}
	for (int i = 0; i < 4; i++)
	{
		ran[i] = rn[9 - i];
	}

	int beg = 1;
	int _beg = 1;
	while (beg = 1) {
		while (_beg = 1) {
			printf("请输入4个不重复的数字。\n");
			for (int i = 0; i < 4; ++i)
			{
				scanf("%d", &sn[i]);
			}
			for (int i = 0; i < 4; i++)
			{
				for (int j = i + 1; j < 4; j++)
				{
					if (sn[i] == sn[j])_beg = 1;
					else _beg = 0;
				}
			}
		}
		int rightnum = 0, placenum = 0;;
		for (int i = 0; i < 4; ++i)
		{
			for (int j = 0; j < 4; ++j)
			{
				/* code */
				if (ran[i] == sn[j])
				{
					rightnum++;
					if (i == j)
					{
						placenum++;
					}
				}
			}
		}
		if (placenum == 4 && rightnum == 4)
		{
			printf("回答正确\n");
			beg = 0;
			break;
		}
		else {
			printf("包含了%d个正确的数字\n", rightnum);
			printf("%d个数字的位置正确\n", placenum);
			printf("\n\n");
			beg = 1;
		}
	}

	return 0;
}