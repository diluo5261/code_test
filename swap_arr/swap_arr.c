#include <stdio.h>

void print(int * arr, int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
		printf("%d ",arr[i]);
	putchar(10);
	return;
}

void swap_arr(int* arr1, int *arr2,int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr1[i] ^= arr2[i];
		arr2[i] ^= arr1[i];
		arr1[i] ^= arr2[i];
	}
	return;
}

int main()
{
	int arr1[10] = {0,1,2,3,4,5,6,7,8,9};
	int arr2[10] = {9,8,7,6,5,4,3,2,1,0 };
	int sz = sizeof(arr1) / sizeof(arr1[0]);

	printf("交换前：\n");
	printf("arr1 = ");
	print(arr1,sz);
	printf("arr2 = ");
	print(arr2, sz);

	swap_arr(arr1,arr2,sz);
	printf("交换后：\n");
	printf("arr1 = ");
	print(arr1, sz);
	printf("arr2 = ");
	print(arr2, sz);
	return 0;
}

