//求Sn=a+aa+aaa+aaaa+aaaaa的前5项之和，其中a是一个数字，
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int get_sum(int num)
{
	int sn = 0;
	int num2 = num;
	int i = 0;
	for (i = 0; i < 5; i++)
	{
		sn += num;
		num = num * 10 + num2;
	}
	return sn;	
}
int main()
{
	int num = 0;
	int sum = 0;
	printf("please input num:\n");
	scanf("%d",&num);
	sum = get_sum(num);
	printf("sum = %d\n",sum);
	return 0;
}