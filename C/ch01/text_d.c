#include<stdio.h>
#include<time.h>

int sleep(unsigned long ms) {
	clock_t beg = clock(), end;
	for (int i = 0; i >= 0; i++) {
		end = clock();
		if (1000ul * (end - beg) / CLOCKS_PER_SEC > ms)break;
	}
	return ms;
}

int main(void) {
	int a[8] = { 't','e','s','t',1,2,3,4 };
	int index = 9;
	for (int i = 0; i <= 1000; i++)
	{
		a[index] = a[0];
		for (int j = 0; j < 8; j++)
		{
			if (a[j] > 5) {
				printf("%c", a[j]);
			}
			else {
				printf("%d", a[j]);
			}
			a[j] = a[j + 1];

		}
		a[7] = a[index];
		sleep(500);
		system("cls");
	}

	return 0;
}