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
	char gamer;// ��ҳ�ȭ
	int playnum;//������	
	int computer; // ���Գ�ȭ
	int a[1000], b[1000];
	int i = 0;
	int result; // �������
	int _num1 = 0;
	int Gamer;
	int _beg = 1;

	printf("��ѡ���ȭ����(2-5):");
	scanf("%d", &playnum);
	system("cls");
	int beg = 1;
	while (beg == 1) {
		printf("���ȭ��\n");
		printf("A:����\nB:ʯͷ\nC:��\nD:������\n");
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
			printf("���ѡ��Ϊ %c ѡ�����,�˳�...\n", gamer);
			getchar();
			wait(2);
			system("cls"); // ����
			return 0;
			break;
		}

		printf("\n");
		printf("�����");
		switch (gamer)
		{
		case 1:printf("����\n"); break;
		case 2:printf("ʯͷ\n"); break;
		case 3:printf("��\n"); break;
		}
		for (int _num = 1; _num < playnum; _num++) {
			printf("����%d����:", _num);
			srand((unsigned)time(NULL)); // ���������
			computer = rand() % 3 + 1; // �����������ȡ�࣬�õ����Գ�ȭ
			wait(1);
			switch (computer)
			{
			case 1:printf("����\n"); break;
			case 2:printf("ʯͷ\n"); break;
			case 3:printf("��\n"); break;
			}
			wait(1);
			a[i] = computer;
			i++;
		}
		printf("\n");
		beg = 2;
		Gamer = (int)gamer;
		if (playnum >= 3) { //********************************ͬʱ��ʯͷ����������������

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
								printf("û����Ӯ����������");
								wait(1);
								system("cls");
								beg = 1;
								continue;
							}
						}
						if (c[0] + c[1] + c[2] == 1) {
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
						if (c[0] + c[1] + c[2] == 6 || c[0] + c[1] + c[2] == 4) {
							printf("û����Ӯ����������");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
						if (c[0] + c[1] + c[2] == 2) {
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
								printf("û����Ӯ����������");
								wait(1);
								system("cls");
								beg = 1;
								continue;
							}
						}
						if (c[0] + c[1] == 0 || c[1] + c[2] == 0 || c[0] + c[2] == 0) {
							if (c[0] + c[1] + c[2] == 3) {
								printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
	************************************************�����̭��************************************************
	**********************************************************************************************************/
flag_1:
	printf("������̭\n"); //�����̭����Լ������в�ȭ
	i = 0;
	int fail = 0;
	for (int _num = 1; _num < playnum; _num++) {

		if (_num == b[fail]) {
			printf("����%d����̭\n", b[fail]);
			fail++;
			a[i] = 0;
			i++;

		}
		else {
			printf("����%d����:", _num);
			srand((unsigned)time(NULL)); // ���������
			computer = rand() % 3 + 1; // �����������ȡ�࣬�õ����Գ�ȭ
			wait(1);
			switch (computer)
			{
			case 1:printf("����\n"); break;
			case 2:printf("ʯͷ\n"); break;
			case 3:printf("��\n"); break;
			}
			wait(1);
			a[i] = computer;
		}
	}
	fail = 0;
	printf("\n\n");
	int _pn2 = 0;
	for (int _pn = playnum - 2; _pn >= 0;) {//*************************************************ͬʱ��ʯͷ����������������
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
						printf("û����Ӯ����������");
						wait(1);
						system("cls");
						goto flag_1;
					}
				}
				if (c[0] + c[1] == 1 || c[0] + c[1] == 2) {
					printf("û����Ӯ����������");
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
					printf("û����Ӯ����������");
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
					printf("û����Ӯ����������");
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
					printf("û����Ӯ����������");
					wait(1);
					system("cls");
					goto flag_1;
				}
				if (c[0] == c[1] && c[0] + c[1] == 4) {
					printf("û����Ӯ����������");
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
					printf("û����Ӯ����������");
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
					printf("û����Ӯ����������");
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
					printf("û����Ӯ����������");
					wait(1);
					system("cls");
					goto flag_1;
				}
				if (c[0] + c[1] == 6) {
					printf("û����Ӯ����������");
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
					printf("û����Ӯ����������");
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
					printf("û����Ӯ����������");
					wait(1);
					system("cls");
					goto flag_1;
				}
			}
		}
	}



	//�����̭����Բ�ȭ�õ���ÿ�ֽ��
	printf("������̭\n");
	int com = 0;
	//int z = 1;
	for (com; com < playnum;) {
		int z = 1;
		if (a[com] == 1) {
			for (int _com = com + 1; _com < playnum; _com++) {
				if (a[_com] == 2) {
					printf("����%d����\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 1) {
							printf("����%d����\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 2)printf("����%dӮ��\n", z + 1);
						if (a[z] == 3) {
							printf("����%d����\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("����%d����̭\n", z + 1);
					}
					wait(5);
					system("cls");
					goto flag_1;
				}
				if (a[_com] == 3) {
					printf("����%dӮ��\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 1)printf("����%dӮ��\n", z + 1);
						if (a[z] == 2)printf("����%dӮ��\n", z + 1);
						if (a[z] == 3) {
							printf("����%d����\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("����%d����̭\n", z + 1);
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
					printf("����%d����\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 3)printf("����%dӮ��\n", z + 1);
						if (a[z] == 2) {
							printf("����%d����\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 1) {
							printf("����%d����\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("����%d����̭\n", z + 1);
					}
					wait(5);
					system("cls");
					goto flag_1;
				}
				if (a[_com] == 1) {
					printf("����%dӮ��\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 3)printf("����%dӮ��\n", z + 1);
						if (a[z] == 2)printf("����%dƽ��\n", z + 1);
						if (a[z] == 1) {
							printf("����%d����\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("����%d����̭\n", z + 1);
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
					printf("����%d����\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 3) {
							printf("����%d����\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 2)printf("����%dӮ��\n", z + 1);
						if (a[z] == 1) {
							printf("����%d����\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("����%d����̭\n", z + 1);
					}
					wait(5);
					system("cls");
					goto flag_1;
				}
				if (a[_com] == 2) {
					printf("����%dӮ��\n", com + 1);
					for (z; z < playnum; z++) {
						if (a[z] == 3)printf("����%dӮ��\n", z + 1);
						if (a[z] == 2)printf("����%dӮ��\n", z + 1);
						if (a[z] == 1) {
							printf("����%d����\n", z + 1);
							b[_num1] = z + 1;
							a[z] = 0;
							_num1++;
						}
						if (a[z] == 0)printf("����%d����̭\n", z + 1);
					}
					wait(5);
					system("cls");
					goto flag_1;
				}
			}
		}
		if (a[com] == 0) {
			printf("����%d����̭\n", com + 1);
			com++;
			z++;
		}
	}
	if (b[0] == 0 && b[1] == 0 && b[2] == 0 && b[3] == 0)
	{
		printf("��Ӯ��\n");
		system("pause");
	}
	if (b[0] != 0 && b[1] == 0 && b[2] == 0 && b[3] == 0)
	{
		printf("����1Ӯ��\n");
		system("pause");
	}
	if (b[0] == 0 && b[1] != 0 && b[2] == 0 && b[3] == 0)
	{
		printf("����2Ӯ��\n");
		system("pause");
	}
	if (b[0] == 0 && b[1] == 0 && b[2] != 0 && b[3] == 0)
	{
		printf("����3Ӯ��\n");
		system("pause");
	}
	if (b[0] == 0 && b[1] == 0 && b[2] == 0 && b[3] != 0)
	{
		printf("����4Ӯ��\n");
		system("pause");
	}
	goto flag_1;
	/*******************************************************************************************************************
	************************************************���Ӯ�˺����******************************************************
	********************************************************************************************************************/
flag_2:

	while (_beg == 1) {
		printf("���ȭ��\n");
		printf("A:����\nB:ʯͷ\nC:��\nD:������\n");
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
			printf("���ѡ��Ϊ %c ѡ�����,�˳�...\n", gamer);
			getchar();
			system("cls"); // ����
			return 0;
			break;
		}
		printf("�����");
		switch (gamer)
		{
		case 1:printf("����\n"); break;
		case 2:printf("ʯͷ\n"); break;
		case 3:printf("��\n"); break;
		}
		wait(1);
		i = 0;
		int fail = 0;
		for (int _num = 1; _num < playnum; _num++) {

			if (_num == b[fail]) {
				printf("����%d����̭\n", b[fail]);
				fail++;
				a[i] = 0;
				i++;
			}
			else {
				printf("����%d����:", _num);
				srand((unsigned)time(NULL)); // ���������
				computer = rand() % 3 + 1; // �����������ȡ�࣬�õ����Գ�ȭ
				wait(1);
				switch (computer)
				{
				case 1:printf("����\n"); break;
				case 2:printf("ʯͷ\n"); break;
				case 3:printf("��\n"); break;
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
		/*for (int j = 0; j < playnum; j++) {    //ͬʱ��ʯͷ����������������
			for (int k = 1; k < playnum; k++) {
				if (a[j] + a[k] + Gamer == 6 && a[j] == 2 && a[k] == 2 && Gamer == 2) {
					printf("û����Ӯ,��������");
					wait(1);
					system("cls");
					_beg=1;;
				}
			}
			for (int k = 1; k < playnum; k++) {
				if (Gamer == a[j] && a[j] == a[k] && a[k] == a[k + 1] && a[k + 1] == a[k + 2]) {
					printf("û����Ӯ,��������");
					wait(1);
					system("cls");
					_beg=1;
				}
			}
			for (int k = 1; k < playnum; k++) {
				if (a[j] + a[k] + Gamer_ == 15 || Gamer_ - a[j] + a[k] == 22 || Gamer_ - a[j] + a[k] == 18 || a[j] + a[k] + Gamer_ == 33) {
					printf("û����Ӯ,��������");
					wait(1);
					system("cls");
					_beg=1;
				}
			}
		}*/
		if (playnum >= 3) { //********************************ͬʱ��ʯͷ����������������

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
								printf("û����Ӯ����������");
								wait(1);
								system("cls");
								beg = 1;
								continue;
							}
						}
						if (c[0] + c[1] + c[2] == 1) {
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
						if (c[0] + c[1] + c[2] == 6 || c[0] + c[1] + c[2] == 4) {
							printf("û����Ӯ����������");
							wait(1);
							system("cls");
							beg = 1;
							continue;
						}
						if (c[0] + c[1] + c[2] == 2) {
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
								printf("û����Ӯ����������");
								wait(1);
								system("cls");
								beg = 1;
								continue;
							}
						}
						if (c[0] + c[1] == 0 || c[1] + c[2] == 0 || c[0] + c[2] == 0) {
							if (c[0] + c[1] + c[2] == 3) {
								printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
							printf("û����Ӯ����������");
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
	************************************************ÿ�ֽ�������************************************************
	**************************************************************************************************************/
gamble:  //���ÿһ�ֽ��
	if (Gamer == 1) {
		for (int x = 0; x < playnum; x++) {
			if (a[x] == 2) {
				printf("������\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1) {
						printf("����%d����\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 2)printf("����%dӮ��\n", z + 1);
					if (a[z] == 3) {
						printf("����%d����\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 0)printf("����%d����̭\n", z + 1);
				}
				wait(5);
				system("cls");
				goto flag_1;
			}
			if (a[x] == 3) {
				printf("��Ӯ��\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1)printf("����%dӮ��\n", z + 1);
					if (a[z] == 2)printf("����%dӮ��\n", z + 1);
					if (a[z] == 3) {
						printf("����%d����\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 0)printf("����%d����̭\n", z + 1);
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
				printf("������\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1) {
						printf("����%d����\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 2) {
						printf("����%d����\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 3)printf("����%dӮ��\n", z + 1);
					if (a[z] == 0)printf("����%d����̭\n", z + 1);
				}
				wait(5);
				system("cls");
				goto flag_1;
			}
			if (a[x] == 1) {
				printf("��Ӯ��\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1) {
						printf("����%d����\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 2)printf("����%dӮ��\n", z + 1);
					if (a[z] == 3)printf("����%dӮ��\n", z + 1);
					if (a[z] == 0)printf("����%d����̭\n", z + 1);
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
				printf("������\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1)printf("����%dӮ��\n", z + 1);
					if (a[z] == 2) {
						printf("����%d����\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 3) {
						printf("����%d����\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 0)printf("����%d����̭\n", z + 1);
				}
				wait(5);
				system("cls");
				goto flag_1;
			}
			if (a[x] == 2) {
				printf("��Ӯ��\n");
				for (int z = 0; z < playnum; z++) {
					if (a[z] == 1)printf("����%dӮ��\n", z + 1);
					if (a[z] == 2) {
						printf("����%d����\n", z + 1);
						b[_num1] = z + 1;
						a[z] = 0;
						_num1++;
					}
					if (a[z] == 3)printf("����%dӮ��\n", z + 1);
					if (a[z] == 0)printf("����%d����̭\n", z + 1);
				}
				wait(5);
				system("cls");
				goto flag_2;
			}
		}
	}
	if (a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0)
	{
		printf("��Ӯ��\n");
		system("pause");
	}
	if (a[0] != 0 && a[1] == 0 && a[2] == 0 && a[3] == 0)
	{
		printf("����1Ӯ��\n");
		system("pause");
	}
	if (a[0] == 0 && a[1] != 0 && a[2] == 0 && a[3] == 0)
	{
		printf("����2Ӯ��\n");
		system("pause");
	}
	if (a[0] == 0 && a[1] == 0 && a[2] != 0 && a[3] == 0)
	{
		printf("����3Ӯ��\n");
		system("pause");
	}
	if (a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] != 0)
	{
		printf("����4Ӯ��\n");
		system("pause");
	}
}

int main()
{
	Game();
	return 0;
}