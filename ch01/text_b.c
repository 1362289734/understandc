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
	printf_s("请选择难度等级(1-4):");
	scanf_s("%d", &_lev);
	printf_s("请输入想要猜的次数(输入0返回上一级):");
	scanf_s("%d", &_time);
	if (_time == 0) {
		system("cls");
		goto loop;
	}

	_lev1 = SelectLevel(_lev);
	_ans = Random(_lev);

	for (; _time >= 0; _time--) {

		system("cls");
		printf_s("现在开始猜数，剩余次数:%d\n", _time);
		if (_time == 0) {
			system("cls");
			printf_s("次数耗尽！");
			wait(2);
			break;
		}
		printf_s("请输入数字(0-%d):", _lev1);
		scanf_s("%d", &_snum);
		if (_snum < 0 && _snum >= _lev1 + 1) {
			printf_s("请输入范围内的数字!");
		}
		if (_snum <= _lev1 && _snum >= 0) {
			if (_snum > _ans) {
				printf_s("输入的是:%d \n", _snum);
				printf_s("没有猜中，大了");
				wait(1);
				a[i] = _snum;
				i++;
				a[i] = _ans - _snum;
				i++;
			}
			else if (_snum < _ans) {
				printf_s("输入的是:%d \n", _snum);
				printf_s("没有猜中，小了");
				wait(1);
				a[i] = _snum;
				i++;
				a[i] = _ans - _snum;
				i++;
			}
			else {
				printf_s("恭喜你，猜中了。");
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
	printf_s("猜题记录如下：\n");
	printf_s("次数: 数字: 相差: \n");
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