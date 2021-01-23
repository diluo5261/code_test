#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int binary_search(int arr[], int i, int sz)
{
	int left = 0;
	int right = sz - 1;
	while (left <= right)
	{
		int mid = left + (right - left) / 2;
		if (arr[mid] > i)
		{
			right = mid - 1;
		}
		else if (arr[mid] < i)
		{
			left = mid + 1;
		}
		else
		{
			return mid;
		}
	}
	return -1;
}
int main()
{
	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
	int k = 3;
	//二分法查找
	//找到了，返回下标
	//找不到，返回-1
	//arr是数组，传参的时候传的是数组首字母的地址
	int sz = sizeof(arr) / sizeof(arr[0]);//计算元素个数
	int ret = binary_search(arr, k, sz);
	if (ret == -1)
	{
		printf("找不到\n");
	}
	else
	{
		printf("找到了,下标是:%d\n", ret);
	}
	return 0;
}