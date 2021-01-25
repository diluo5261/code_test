#include <stdio.h>
void swap_intnum(int* num1, int* num2)
{
	*num1 ^= *num2;
	*num2 ^= *num1;
	*num1 ^= *num2;
}

int main()
{
	int num1 = 9;
	int num2 = 20;
	printf("交换前：num1 = %d\tnum2=%d\n",num1,num2);
	swap_intnum(&num1,&num2);
	printf("交换后：num1 = %d\tnum2=%d\n", num1, num2);

	return 0;
}