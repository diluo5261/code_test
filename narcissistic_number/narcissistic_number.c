//求出0～100000之间的所有“水仙花数”并输出。

#include <stdio.h>
#include <math.h>
int main()
{
	int i = 0;

	for (i =0 ; i < 100000; i++)
	{
		int count = 0;
		int tmp = i;
		while (tmp)
		{
			tmp /= 10;
			count++;
		}
		tmp = i;

		int sum = 0;	
		while (tmp)
		{
			sum += pow((tmp % 10), count);
			tmp /= 10;
		}
		if (sum == i)
			printf("水仙花数：%d\n",i);
	}
	return 0;
}