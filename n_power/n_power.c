#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//编写一个函数实现n的k次方，使用递归实现

int n_power(int n, int k)
{
	if (k > 1)
		return n * n_power(n, k - 1);
	else
		return n;
}

int main()
{
	int n = 0;
	int k = 0;
	printf("请输入n^k -->（中间以逗号隔开）:\n");
	scanf("%d %d", &n, &k);
	printf("%d\n", n_power(n, k));

	return 0;
}