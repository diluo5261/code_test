#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//��дһ������ʵ��n��k�η���ʹ�õݹ�ʵ��

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
	printf("������n^k -->���м��Զ��Ÿ�����:\n");
	scanf("%d %d", &n, &k);
	printf("%d\n", n_power(n, k));

	return 0;
}