#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void wait(int seconds)
{
	clock_t endwait;
	endwait = clock() + seconds * CLK_TCK;
	while (clock() < endwait) {}
}

void Game() {
	char gamer;// 玩家出拳
	int playnum;//总人数	
	int computer; // 电脑出拳
	int a[1000], b[1000];
	int i = 0;
	int result; // 比赛结果
	int _num1 = 0;
	int Gamer;
	int _beg = 1;

	printf("请选择猜拳人数(2-5):");
	scanf("%d", &playnum);
	system("cls");
	int beg = 1;
	while (beg == 1) {
		printf("请出拳：\n");
		printf("A:剪刀\nB:石头\nC:布\nD:不玩了\n");
		scanf("%s", &gamer);
		switch (gamer) {
		case 65 | 97: // A | a
			gamer = 1; break;
		case 66 | 98: // B | b
			gamer = 2; break;
		case 67 | 99: // C | c
			gamer = 3; break;
		case 68 | 100: // D | d
			return 0;

		default:
			printf("你的选择为 %c 选择错误,退出...\n", gamer);
			getchar();
			wait(2);
			system("cls"); // 清屏
			return 0;
			break;
		}

		printf("\n");
		printf("你出了");
		switch (gamer)
		{
		case 1:printf("剪刀\n"); break;
		case 2:printf("石头\n"); break;
		case 3:printf("布\n"); break;
		}
		for (int _num = 1; _num < playnum; _num++) {
			printf("电脑%d出了:", _num);
			srand((unsigned)time(NULL)); // 随机数种子
			computer = rand() % 3 + 1; // 产生随机数并取余，得到电脑出拳
			wait(1);
			switch (computer)
			{
			case 1:printf("剪刀\n"); break;
			case 2:printf("石头\n"); break;
			case 3:printf("布\n"); break;
			}
			wait(1);
			a[i] = computer;
			i++;
		}
		printf("\n");
		beg = 2;
		Gamer = (int)gamer;
		if (playnum >= 3) { //********************************同时有石头剪刀布则重新输入

			for (int _pn = playnum - 2; _pn >= 0;) {
				if (a[_pn] == 0) {
					_pn--;
				}
				if (Gamer == 1 && a[_pn] == 1) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (c[0] != c[1] || c[0] != c[2] || c[1] != c[2]) {
							if (c[0] + c[1] + c[2] > 5) {
								printf("没有输赢，重新输入");
								wait(1);
								system("cls");
								beg = 1;
								continue;
							}
						}
						if (c[0] + c[1] + c[2] == 1) {
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}

					}goto gamble;
				}
				else if (Gamer == 1 && a[_pn] == 2) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
				else if (Gamer == 1 && a[_pn] == 3) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
			}
			for (int _pn = playnum - 2; _pn >= 0;) {
				if (a[_pn] == 0) _pn--;
				if (Gamer == 2 && a[_pn] == 2) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (c[0] == c[1] && c[0] == c[2] && c[1] == c[2] && c[0] == 2)
						{
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
						if (c[0] + c[1] + c[2] == 6 || c[0] + c[1] + c[2] == 4) {
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
						if (c[0] + c[1] + c[2] == 2) {
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
				else if (Gamer == 2 && a[_pn] == 1) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
						if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
						}
					}goto gamble;
				}
				else if (Gamer == 2 && a[_pn] == 3) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
			}
			for (int _pn = playnum - 2; _pn >= 0;) {
				if (a[_pn] == 0) _pn--;
				if (Gamer == 3 && a[_pn] == 3) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (c[0] != c[1] && c[0] != c[2] && c[1] != c[2]) {
							if (c[0] + c[1] + c[2] > 3) {
								printf("没有输赢，重新输入");
								wait(1);
								system("cls");
								beg = 1;
								continue;
							}
						}
						if (c[0] + c[1] == 0 || c[1] + c[2] == 0 || c[0] + c[2] == 0) {
							if (c[0] + c[1] + c[2] == 3) {
								printf("没有输赢，重新输入");
								wait(1);
								system("cls");
								beg = 1;
								continue;
							}
						}
					}goto gamble;
				}
				else if (Gamer == 3 && a[_pn] == 2) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
				else if (Gamer == 3 && a[_pn] == 1) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
			}

		}
	}
	goto gamble;

	/*********************************************************************************************************
	************************************************玩家淘汰后************************************************
	**********************************************************************************************************/
flag_1:
	printf("你已淘汰\n"); //玩家淘汰后电脑继续进行猜拳
	i = 0;
	int fail = 0;
	for (int _num = 1; _num < playnum; _num++) {

		if (_num == b[fail]) {
			printf("电脑%d已淘汰\n", b[fail]);
			fail++;
			a[i] = 0;
			i++;

		}
		else {
			printf("电脑%d出了:", _num);
			srand((unsigned)time(NULL)); // 随机数种子
			computer = rand() % 3 + 1; // 产生随机数并取余，得到电脑出拳
			wait(1);
			switch (computer)
			{
			case 1:printf("剪刀\n"); break;
			case 2:printf("石头\n"); break;
			case 3:printf("布\n"); break;
			}
			wait(1);
			a[i] = computer;
		}
	}
	fail = 0;
	printf("\n\n");
	int _pn2 = 0;
	for (int _pn = playnum - 2; _pn >= 0;) {//*************************************************同时有石头剪刀布则重新输入
		if (a[_pn] == 0) _pn--;
		if (a[_pn2] == 0) _pn2++;
		if (_pn2 = 4)return 0;
		if (a[_pn2] == 1 && a[_pn] == 1) {
			int c[100];
			int _c = 0;
			_pn--;
			for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
			{
				if (a[_pn1] == 2) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (a[_pn1] == 3) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (a[_pn1] == 1) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (c[0] != c[1]) {
					if (c[0] + c[1] == 5) {
						printf("没有输赢，重新输入");
						wait(1);
						system("cls");
						goto flag_1;
					}
				}
				if (c[0] + c[1] == 1 || c[0] + c[1] == 2) {
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}

			}
		}
		else if (a[_pn2] == 1 && a[_pn] == 2) {
			int c[100];
			int _c = 0;
			_pn--;
			for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
			{
				if (a[_pn1] == 3) {
					c[_c] = a[_pn1];
					_c++;
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}
			}
		}
		else if (a[_pn2] == 1 && a[_pn] == 3) {
			int c[100];
			int _c = 0;
			_pn--;
			for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
			{
				if (a[_pn1] == 2) {
					c[_c] = a[_pn1];
					_c++;
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}
			}
		}
	}
	for (int _pn = playnum - 2; _pn >= 0;) {
		if (a[_pn] == 0) _pn--;
		if (a[_pn2] == 0) _pn2++;
		if (_pn2 = 4)return 0;
		if (a[_pn2] == 2 && a[_pn] == 2) {
			int c[100];
			int _c = 0;
			_pn--;
			for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
			{
				if (a[_pn1] == 2) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (a[_pn1] == 3) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (a[_pn1] == 1) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (c[0] != c[1] && c[0] + c[1] == 4) {
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}
				if (c[0] == c[1] && c[0] + c[1] == 4) {
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}
			}
		}
		else if (a[_pn2] == 2 && a[_pn] == 1) {
			int c[100];
			int _c = 0;
			_pn--;
			for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
			{
				if (a[_pn1] == 2) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (a[_pn1] == 3) {
					c[_c] = a[_pn1];
					_c++;
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}
				if (a[_pn1] == 1) {
					c[_c] = a[_pn1];
					_c++;
				}
			}
		}
		else if (Gamer == 2 && a[_pn] == 3) {
			int c[100];
			int _c = 0;
			_pn--;
			for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
			{
				if (a[_pn1] == 2) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (a[_pn1] == 3) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (a[_pn1] == 1) {
					c[_c] = a[_pn1];
					_c++;
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}
			}
		}
	}
	for (int _pn = playnum - 2; _pn >= 0;) {
		if (a[_pn] == 0) _pn--;
		if (a[_pn2] == 0) _pn2++;
		if (_pn2 = 4)return 0;
		if (a[_pn2] == 3 && a[_pn] == 3) {
			int c[100];
			int _c = 0;
			_pn--;
			for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
			{
				if (a[_pn1] == 2) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (a[_pn1] == 3) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (a[_pn1] == 1) {
					c[_c] = a[_pn1];
					_c++;
				}
				if (c[0] + c[1] == 3) {
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}
				if (c[0] + c[1] == 6) {
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}
			}
		}
		else if (a[_pn2] == 3 && a[_pn] == 2) {
			int c[100];
			int _c = 0;
			_pn--;
			for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
			{
				if (a[_pn1] == 1) {
					c[_c] = a[_pn1];
					_c++;
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}
			}
		}
		else if (a[_pn2] == 3 && a[_pn] == 1) {
			int c[100];
			int _c = 0;
			_pn--;
			for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
			{
				if (a[_pn1] == 2) {
					c[_c] = a[_pn1];
					_c++;
					printf("没有输赢，重新输入");
					wait(1);
					system("cls");
					goto flag_1;
				}
			}
		}
	}



	//玩家淘汰后电脑猜拳得到的每轮结果
	printf("你已淘汰\n");
	int com = 0;
	//int z = 1;
	for (com; com < playnum;) {
		int z = 1;
		if (a[com] == 1) {
			for (int _com = com + 1; _com < playnum; _com++) {
				if (a[_com] == 2) {
					printf("电脑%d输了\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 1) {
							printf("电脑%d输了\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 2)printf("电脑%d赢了\n", z + 1);
						if (a[z] == 3) {
							printf("电脑%d输了\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
					}
					wait(5);
					system("cls");
					goto flag_1;
				}
				if (a[_com] == 3) {
					printf("电脑%d赢了\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 1)printf("电脑%d赢了\n", z + 1);
						if (a[z] == 2)printf("电脑%d赢了\n", z + 1);
						if (a[z] == 3) {
							printf("电脑%d输了\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
					}
					wait(5);
					system("cls");
					goto flag_1;
				}
			}
		}
		if (a[com] == 2) {
			for (int _com = com + 1; _com < playnum; _com++) {
				if (a[_com] == 3) {
					printf("电脑%d输了\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 3)printf("电脑%d赢了\n", z + 1);
						if (a[z] == 2) {
							printf("电脑%d输了\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 1) {
							printf("电脑%d输了\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
					}
					wait(5);
					system("cls");
					goto flag_1;
				}
				if (a[_com] == 1) {
					printf("电脑%d赢了\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 3)printf("电脑%d赢了\n", z + 1);
						if (a[z] == 2)printf("电脑%d平手\n", z + 1);
						if (a[z] == 1) {
							printf("电脑%d输了\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
					}
					wait(5);
					system("cls");
					goto flag_1;
				}
			}
		}
		if (a[com] == 3) {
			for (int _com = com + 1; _com < playnum; _com++) {
				if (a[_com] == 1) {
					printf("电脑%d输了\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 3) {
							printf("电脑%d输了\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 2)printf("电脑%d赢了\n", z + 1);
						if (a[z] == 1) {
							printf("电脑%d输了\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
					}
					wait(5);
					system("cls");
					goto flag_1;
				}
				if (a[_com] == 2) {
					printf("电脑%d赢了\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 3)printf("电脑%d赢了\n", z + 1);
						if (a[z] == 2)printf("电脑%d赢了\n", z + 1);
						if (a[z] == 1) {
							printf("电脑%d输了\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
					}
					wait(5);
					system("cls");
					goto flag_1;
				}
			}
		}
		if (a[com] == 0) {
			printf("电脑%d已淘汰\n", com + 1);
			com++;
			z++;
		}
	}
	if (b[0] == 0 && b[1] == 0 && b[2] == 0 && b[3] == 0)
	{
		printf("你赢了\n");
		system("pause");
	}
	if (b[0] != 0 && b[1] == 0 && b[2] == 0 && b[3] == 0)
	{
		printf("电脑1赢了\n");
		system("pause");
	}
	if (b[0] == 0 && b[1] != 0 && b[2] == 0 && b[3] == 0)
	{
		printf("电脑2赢了\n");
		system("pause");
	}
	if (b[0] == 0 && b[1] == 0 && b[2] != 0 && b[3] == 0)
	{
		printf("电脑3赢了\n");
		system("pause");
	}
	if (b[0] == 0 && b[1] == 0 && b[2] == 0 && b[3] != 0)
	{
		printf("电脑4赢了\n");
		system("pause");
	}
	goto flag_1;
	/*******************************************************************************************************************
	************************************************玩家赢了后继续******************************************************
	********************************************************************************************************************/
flag_2:

	while (_beg == 1) {
		printf("请出拳：\n");
		printf("A:剪刀\nB:石头\nC:布\nD:不玩了\n");
		scanf("%s", &gamer);
		switch (gamer) {
		case 65 | 97: // A | a
			gamer = 1; break;
		case 66 | 98: // B | b
			gamer = 2; break;
		case 67 | 99: // C | c
			gamer = 3; break;
		case 68 | 100: // D | d
			return 0;

		default:
			printf("你的选择为 %c 选择错误,退出...\n", gamer);
			getchar();
			system("cls"); // 清屏
			return 0;
			break;
		}
		printf("你出了");
		switch (gamer)
		{
		case 1:printf("剪刀\n"); break;
		case 2:printf("石头\n"); break;
		case 3:printf("布\n"); break;
		}
		wait(1);
		i = 0;
		int fail = 0;
		for (int _num = 1; _num < playnum; _num++) {

			if (_num == b[fail]) {
				printf("电脑%d已淘汰\n", b[fail]);
				fail++;
				a[i] = 0;
				i++;
			}
			else {
				printf("电脑%d出了:", _num);
				srand((unsigned)time(NULL)); // 随机数种子
				computer = rand() % 3 + 1; // 产生随机数并取余，得到电脑出拳
				wait(1);
				switch (computer)
				{
				case 1:printf("剪刀\n"); break;
				case 2:printf("石头\n"); break;
				case 3:printf("布\n"); break;
				}
				wait(1);
				a[i] = computer;
				i++;
			}
		}
		fail = 0;
		printf("\n\n");
		_beg = 2;
		int Gamer_ = Gamer * 10;
		/*for (int j = 0; j < playnum; j++) {    //同时有石头剪刀布则重新输入
			for (int k = 1; k < playnum; k++) {
				if (a[j] + a[k] + Gamer == 6 && a[j] == 2 && a[k] == 2 && Gamer == 2) {
					printf("没有输赢,重新输入");
					wait(1);
					system("cls");
					_beg=1;;
				}
			}
			for (int k = 1; k < playnum; k++) {
				if (Gamer == a[j] && a[j] == a[k] && a[k] == a[k + 1] && a[k + 1] == a[k + 2]) {
					printf("没有输赢,重新输入");
					wait(1);
					system("cls");
					_beg=1;
				}
			}
			for (int k = 1; k < playnum; k++) {
				if (a[j] + a[k] + Gamer_ == 15 || Gamer_ - a[j] + a[k] == 22 || Gamer_ - a[j] + a[k] == 18 || a[j] + a[k] + Gamer_ == 33) {
					printf("没有输赢,重新输入");
					wait(1);
					system("cls");
					_beg=1;
				}
			}
		}*/
		if (playnum >= 3) { //********************************同时有石头剪刀布则重新输入

			for (int _pn = playnum - 2; _pn >= 0;) {
				if (a[_pn] == 0) {
					_pn--;
				}
				if (Gamer == 1 && a[_pn] == 1) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (c[0] != c[1] || c[0] != c[2] || c[1] != c[2]) {
							if (c[0] + c[1] + c[2] > 5) {
								printf("没有输赢，重新输入");
								wait(1);
								system("cls");
								beg = 1;
								continue;
							}
						}
						if (c[0] + c[1] + c[2] == 1) {
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}

					}goto gamble;
				}
				else if (Gamer == 1 && a[_pn] == 2) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
				else if (Gamer == 1 && a[_pn] == 3) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
			}
			for (int _pn = playnum - 2; _pn >= 0;) {
				if (a[_pn] == 0) _pn--;
				if (Gamer == 2 && a[_pn] == 2) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (c[0] == c[1] && c[0] == c[2] && c[1] == c[2] && c[0] == 2)
						{
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
						if (c[0] + c[1] + c[2] == 6 || c[0] + c[1] + c[2] == 4) {
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
						if (c[0] + c[1] + c[2] == 2) {
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
				else if (Gamer == 2 && a[_pn] == 1) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
						if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
						}
					}goto gamble;
				}
				else if (Gamer == 2 && a[_pn] == 3) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
			}
			for (int _pn = playnum - 2; _pn >= 0;) {
				if (a[_pn] == 0) _pn--;
				if (Gamer == 3 && a[_pn] == 3) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 3) {
							c[_c] = a[_pn1];
							_c++;
						}
						else if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
						}
						if (c[0] != c[1] && c[0] != c[2] && c[1] != c[2]) {
							if (c[0] + c[1] + c[2] > 3) {
								printf("没有输赢，重新输入");
								wait(1);
								system("cls");
								beg = 1;
								continue;
							}
						}
						if (c[0] + c[1] == 0 || c[1] + c[2] == 0 || c[0] + c[2] == 0) {
							if (c[0] + c[1] + c[2] == 3) {
								printf("没有输赢，重新输入");
								wait(1);
								system("cls");
								beg = 1;
								continue;
							}
						}
					}goto gamble;
				}
				else if (Gamer == 3 && a[_pn] == 2) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 1) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
				else if (Gamer == 3 && a[_pn] == 1) {
					int c[100];
					int _c = 0;
					_pn--;
					for (int _pn1 = _pn; _pn1 >= 0; _pn1--)
					{
						if (a[_pn1] == 2) {
							c[_c] = a[_pn1];
							_c++;
							printf("没有输赢，重新输入");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
					}goto gamble;
				}
			}

		}
	}
	goto gamble;
	/*************************************************************************************************************
	************************************************每轮结果的输出************************************************
	**************************************************************************************************************/
gamble:  //输出每一轮结果
	if (Gamer == 1) {
		for (int x = 0; x < playnum; x++) {
			if (a[x] == 2) {
				printf("你输了\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1) {
						printf("电脑%d输了\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 2)printf("电脑%d赢了\n", z + 1);
					if (a[z] == 3) {
						printf("电脑%d输了\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
				}
				wait(5);
				system("cls");
				goto flag_1;
			}
			if (a[x] == 3) {
				printf("你赢了\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1)printf("电脑%d赢了\n", z + 1);
					if (a[z] == 2)printf("电脑%d赢了\n", z + 1);
					if (a[z] == 3) {
						printf("电脑%d输了\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
				}
				wait(5);
				system("cls");
				goto flag_2;
			}
		}
		wait(4);
		system("cls");
	}
	if (Gamer == 2) {
		for (int x = 0; x < playnum; x++) {
			if (a[x] == 3) {
				printf("你输了\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1) {
						printf("电脑%d输了\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 2) {
						printf("电脑%d输了\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 3)printf("电脑%d赢了\n", z + 1);
					if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
				}
				wait(5);
				system("cls");
				goto flag_1;
			}
			if (a[x] == 1) {
				printf("你赢了\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1) {
						printf("电脑%d输了\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 2)printf("电脑%d赢了\n", z + 1);
					if (a[z] == 3)printf("电脑%d赢了\n", z + 1);
					if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
				}
				wait(5);
				system("cls");
				goto flag_2;
			}
		}
		wait(4);
		system("cls");
	}
	if (Gamer == 3) {
		for (int x = 0; x < playnum; x++) {
			if (a[x] == 1) {
				printf("你输了\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1)printf("电脑%d赢了\n", z + 1);
					if (a[z] == 2) {
						printf("电脑%d输了\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 3) {
						printf("电脑%d输了\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
				}
				wait(5);
				system("cls");
				goto flag_1;
			}
			if (a[x] == 2) {
				printf("你赢了\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1)printf("电脑%d赢了\n", z + 1);
					if (a[z] == 2) {
						printf("电脑%d输了\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 3)printf("电脑%d赢了\n", z + 1);
					if (a[z] == 0)printf("电脑%d已淘汰\n", z + 1);
				}
				wait(5);
				system("cls");
				goto flag_2;
			}
		}
	}
	if (a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0)
	{
		printf("你赢了\n");
		system("pause");
	}
	if (a[0] != 0 && a[1] == 0 && a[2] == 0 && a[3] == 0)
	{
		printf("电脑1赢了\n");
		system("pause");
	}
	if (a[0] == 0 && a[1] != 0 && a[2] == 0 && a[3] == 0)
	{
		printf("电脑2赢了\n");
		system("pause");
	}
	if (a[0] == 0 && a[1] == 0 && a[2] != 0 && a[3] == 0)
	{
		printf("电脑3赢了\n");
		system("pause");
	}
	if (a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] != 0)
	{
		printf("电脑4赢了\n");
		system("pause");
	}
}

int main()
{
	Game();
	return 0;
}