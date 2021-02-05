#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//赋值
void scanf_num(int* arr1, int sz)
{
	int i = 0;
	while (i < sz)
		scanf("%d", &arr1[i++]);
}
//交换
void swap_paritynum(int* arr2, int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		int j = 0;
		for (j = 0; j < sz - 1; j++)
		{
			if (0 == arr2[j] % 2 && arr2[j + 1] % 2 != 0)
			{
				int tmp = arr2[j + 1];
				arr2[j + 1] = arr2[j];
				arr2[j] = tmp;
			}
		}
	}
}
//打印
void paint_num(int* arr3, int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr3[i]);
	}
}
int main()
{
	//int arr[10] = { 0 };
	int arr[10] = { 1,1,1,2,2,2,3,3,8,10 };
	int sz = sizeof(arr) / sizeof(arr[0]);
	//赋值
	scanf_num(arr, sz);
	//交换
	swap_paritynum(arr, sz);
	//打印
	paint_num(arr, sz);

	return 0;
}