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
	//���ַ�����
	//�ҵ��ˣ������±�
	//�Ҳ���������-1
	//arr�����飬���ε�ʱ�򴫵�����������ĸ�ĵ�ַ
	int sz = sizeof(arr) / sizeof(arr[0]);//����Ԫ�ظ���
	int ret = binary_search(arr, k, sz);
	if (ret == -1)
	{
		printf("�Ҳ���\n");
	}
	else
	{
		printf("�ҵ���,�±���:%d\n", ret);
	}
	return 0;
}