#include <stdio.h>

//实现函数init() 初始化数组为全0
//实现print()  打印数组的每个元素
//实现reverse()  函数完成数组元素的逆置。

void init(int * arr,int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr[i] = 0;
	}
}

void print(int *arr, int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
		printf("%d ",arr[i]);
	putchar(10);
}

void reverse(int *arr, int sz)
{
	int left = 0;
	int right = sz - 1;
	while (left <= right)
	{
		arr[left] ^= arr[right];
		arr[right] ^= arr[left];
		arr[left] ^= arr[right];
		left++;
		right--;
	}
}



int main()
{
	int arr1[10] = {0,1,2,3,4,5,6,7,8,9};
	int arr2[10] = { 9,8,7,6,5,4,3,2,1,0};

	int sz1 = sizeof(arr1) / sizeof(arr1[0]);
	int sz2 = sizeof(arr2) / sizeof(arr2[0]);
	
	//初始化数组为全0
	init(arr1,sz1);
	//打印数组的每个元素
	print(arr1,sz1);
	//函数完成数组元素的逆置
	reverse(arr2, sz2);
	print(arr2, sz2);
	return 0;
}