#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>

int Random(int _num) {
	srand((unsigned)time(NULL));
	int _num1;
	switch (_num) {
	case 1: _num1 = rand() % 10;
		break;
	case 2: _num1 = rand() % 100;
		break;
	case 3: _num1 = rand() % 1000;
		break;
	case 4: _num1 = rand() % 10000;
		break;
	}
	return _num1;
}

int SelectLevel(int _level) {
	int _dif;
	switch (_level)
	{
	case 1:_dif = 9;
		break;
	case 2:_dif = 99;
		break;
	case 3:_dif = 999;
		break;
	case 4:_dif = 9999;
		break;
	}
	return _dif;
}

void wait(int seconds)
{
	clock_t endwait;
	endwait = clock() + seconds * CLK_TCK;
	while (clock() < endwait) {}
}

int main(void) {
	int _lev = 0;
	int _time = 0;
	int _lev1;
	int _snum = 0;
	int _ans;
	int a[1000];
	int i = 0, j = 1, z = 0;
loop:
	printf_s("��ѡ���Ѷȵȼ�(1-4):");
	scanf_s("%d", &_lev);
	printf_s("��������Ҫ�µĴ���(����0������һ��):");
	scanf_s("%d", &_time);
	if (_time == 0) {
		system("cls");
		goto loop;
	}

	_lev1 = SelectLevel(_lev);
	_ans = Random(_lev);

	for (; _time >= 0; _time--) {

		system("cls");
		printf_s("���ڿ�ʼ������ʣ�����:%d\n", _time);
		if (_time == 0) {
			system("cls");
			printf_s("�����ľ���");
			wait(2);
			break;
		}
		printf_s("����������(0-%d):", _lev1);
		scanf_s("%d", &_snum);
		if (_snum < 0 && _snum >= _lev1 + 1) {
			printf_s("�����뷶Χ�ڵ�����!");
		}
		if (_snum <= _lev1 && _snum >= 0) {
			if (_snum > _ans) {
				printf_s("�������:%d \n", _snum);
				printf_s("û�в��У�����");
				wait(1);
				a[i] = _snum;
				i++;
				a[i] = _ans - _snum;
				i++;
			}
			else if (_snum < _ans) {
				printf_s("�������:%d \n", _snum);
				printf_s("û�в��У�С��");
				wait(1);
				a[i] = _snum;
				i++;
				a[i] = _ans - _snum;
				i++;
			}
			else {
				printf_s("��ϲ�㣬�����ˡ�");
				printf_s("\n");
				a[i] = _snum;
				i++;
				a[i] = _ans - _snum;
				i++;
				wait(3);
				break;
			}
		}
	}
	system("cls");
	printf_s("�����¼���£�\n");
	printf_s("����: ����: ���: \n");
	for (z; z < i; ) {
		printf_s("%5d", j);
		j++;
		for (int x = 0; x < 2; x++) {
			printf_s("%6d", a[z]);
			z++;
		}
		printf_s("\n");
	}
	return 0;
}