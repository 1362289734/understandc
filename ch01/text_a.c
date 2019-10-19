#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>

int main(void) {
	char _num;
	_num = getch();
	while (_num != 48) {
		int a;
		srand((unsigned)time(NULL));
		a = rand() % 100;
		if (_num == 48) {
			return 0;
		}
		if (a >= 0 && a < 5) {
			printf("´ó¼ª");
		}
		else if (a >= 5 && a < 15) {
			printf("ÖÐ¼ª");
		}
		else if (a >= 15 && a < 30) {
			printf("Ð¡¼ª");
		}
		else if (a >= 30 && a < 60) {
			printf("¼ª");
		}
		else if (a >= 60 && a < 80) {
			printf("Ä©¼ª");
		}
		else if (a >= 80 && a < 95) {
			printf("Ð×");
		}
		else {
			printf("´óÐ×");
		}
		_num = getch();
		system("cls");
	}
}