#include <stdio.h>

void bubble_sort(int *arr, int sz,int sel )
{
	int i = 0;
	for (i = 0; i < sz-1; i++)
	{
		int flag = 1;
		int j = 0;
		for (j = 0; j < sz - 1 - i; j++)
		{

			if (1 == sel)
			{
				if (arr[j] > arr[j + 1])
				{
					arr[j] ^= arr[j + 1];
					arr[j + 1] ^= arr[j];
					arr[j] ^= arr[j + 1];
					flag = 0;
				}
			}
			else if (0 == sel)
			{
				if (arr[j] < arr[j + 1])
				{
					arr[j] ^= arr[j + 1];
					arr[j + 1] ^= arr[j];
					arr[j] ^= arr[j + 1];
					flag = 0;
				}
			}
													
		}
		if (1 == flag)
			return;
	}
}

int main()
{
	int arr[10] = { 1,3,5,7,9,10,8,6,4,2 };
	int sz = sizeof(arr)/sizeof(arr[0]);
	//		1¡¢ÉýÐò		0¡¢½µÐò
	int sel = 0;		
	bubble_sort(arr,sz,sel);	
	for (int i = 0; i < sz; i++)
		printf("%d ",arr[i]);
	return 0;
}