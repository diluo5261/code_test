#include <stdio.h>
//дһ��������ӡarr��������ݣ���ʹ�������±꣬ʹ��ָ�롣
void Paint_Array(int * arr, int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
		printf("%d ",*(arr+i));
	return;
}

int main()
{
	int arr[10] = {1,2,3,4,5,6,7,8,9,10};
	int sz = sizeof(arr) / sizeof(arr[0]);
	Paint_Array(arr,sz);
	return 0;
}