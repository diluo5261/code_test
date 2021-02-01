#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define N 20

int main()
{
	int arr[N][N] = {1};
	int n=0;
	while (n<1 || n>N)
	{
		printf("«Î ‰»Î–– ˝£∫\n");
		scanf("%d", &n);
	}

	int i, j;
	for (i = 1; i < n; i++)
	{
		arr[i][1] = arr[i][i] = 1;
		for(j=1;j<i;j++)
			arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
	}

	for (i = 0; i < n; i++)
	{
		for (j = 1; j <= i; j++)
			printf("%d ",arr[i][j]);
		putchar(10);
	}
	putchar(10);
	return 0;
}