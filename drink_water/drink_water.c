#include <stdio.h>
//题目内容：
//喝汽水，1瓶汽水1元，2个空瓶可以换一瓶汽水，给20元，可以多少汽水

int main()
{
	//方法1：
	int money = 0;
	scanf("%d", &money);//20
	int total = 0;
	int empty = 0;
	total += money;
	empty = money;

	//置换
	while (empty>=2)
	{
		total += empty / 2;
		empty = empty / 2 + empty%2;
	}
	printf("total = %d\n", total);
	return 0;
}


//方法2：
//int main()
//{
//	int money = 0;
//	int total = 0;
//	scanf("%d", &money);//20
//	if (money > 0)
//		total = money * 2 - 1;
//
//	printf("total = %d\n", total);
//	return 0;
//}