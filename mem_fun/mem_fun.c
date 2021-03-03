#include <stdio.h>
#include <string.h>
#include <assert.h>

//memcpy������ģ��ʵ��
void* my_memcpy(void * dest,void * src, size_t (count))
{
	assert(dest && src);
	void* ret = dest;
	while (count--)
	{
		*(char*)dest = *(char*)src;
		++(char*)dest;
		++(char*)src;
	}
	return ret;
}
void test1()
{
	int i_arr1[] = { 1,2,3,4,5,6,7,8,9,10 };
	int i_arr2[20] = {0};
	int i_arr3[20] = { 0 };
	
	memcpy(i_arr2,i_arr1,sizeof(i_arr1));
	my_memcpy(i_arr3,i_arr1,sizeof(i_arr1));
}

void* my_memmov(void* dest, void* src, size_t count)
{
	assert(dest && src);
	void* ret = dest;
	if (dest <src)
	{
		//��ǰ���ʼ��
		while (count--)
		{
			*(char*)dest = *(char*)src;
			++(char*)dest;
			++(char*)src;
		}
	}
	else
	{
		//�Ӻ���ǰ��
		while (count--)
		{
			*((char*)dest+count)= *((char*)src+count);
		}
	}
	return ret;
}

void test2()
{
	int i_arr1[] = { 1,2,3,4,5,6,7,8,9,10 };
	int i_arr2[] = { 1,2,3,4,5,6,7,8,9,10 };
	int i_arr3[] = { 1,2,3,4,5,6,7,8,9,10 };
	int i_arr4[] = { 1,2,3,4,5,6,7,8,9,10 };
	//ִ�н������ͬ
	memcpy(i_arr1+2,i_arr1,4*sizeof(i_arr1[0]));//{ 1,2,1,2,3,4,7,8,9,10 };
	my_memcpy(i_arr2 + 2, i_arr2, 4 * sizeof(i_arr2[0]));//{ 1,2,1,2,1,2,7,8,9,10 };


	//ģ��ʵ��memmov����,
	my_memmov(i_arr3 + 2, i_arr3, 4 * sizeof(i_arr3[0]));
}



int main()
{
	//test1();//memcpy����ʵ��
	test2();//memmov����ʵ��

	return 0;
}