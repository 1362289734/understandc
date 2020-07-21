#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void change(int a, int b[])
{
	int n_1, n_2, n_3, n_4;
	int v = 0;
	n_1 = a / 1000;
	n_2 = (a / 100) - (n_1 * 10);
	n_3 = (a / 10) - ((n_1 * 100) + (n_2 * 10));
	n_4 = a - ((n_1 * 1000) + (n_2 * 100) + (n_3 * 10));


	b[0] = n_1;
	b[1] = n_2;
	b[2] = n_3;
	b[3] = n_4;

}
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

	while (beg >= 1) {
		int _beg = 1;
		while (_beg >= 1) {
			printf("请输入4个不重复的数字。\n");
			int cnum;
			scanf("%d", &cnum);
			change(cnum, sn);
			if (cnum > 999 && cnum < 10000) {
				for (int i = 0; i < 4; i++)
				{
					for (int j = i + 1; j < 4; j++)
					{
						if (sn[i] == sn[j]) {
							_beg = 1;
							break;
						}
						else _beg = 0;
					}
					if (_beg == 1)break;
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