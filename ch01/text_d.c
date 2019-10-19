#include<stdio.h>

int sleep(unsigned long ms) {
	unsigned long i = 0;
	for (i; i < ms * 600000; i++);
	return 0;
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
		sleep(300);
		system("cls");
	}

	return 0;
}