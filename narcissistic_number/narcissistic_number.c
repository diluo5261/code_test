//���0��100000֮������С�ˮ�ɻ������������

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
			printf("ˮ�ɻ�����%d\n",i);
	}
	return 0;
}