#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//****************************************************************
void paint(int* arr, int sz)  //打印数组
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		printf("%d ", *(arr + i));
	}
	putchar(10);
}

int cmp_int(const void* e1, const void* e2)
{
	return *(int*)e1 - *(int*)e2;
}

void fun1()//排序整形
{
	int arr1[10] = {1,5,6,2,3,8,9,4,3,7};
	int sz = sizeof(arr1) / sizeof(arr1[0]);
	paint(arr1,sz);
	//快速排序
	qsort(arr1, sz, sizeof(arr1[0]), cmp_int);
	paint(arr1, sz);
}
//************************************************************************


struct Stu
{
	char name[20];
	int age;
};

int cmp_stu_age(const void* e1, const void* e2)  //排序结构体类型—按年龄排序
{
	return((struct Stu*)e1)->age - ((struct Stu*)e2)->age;
}

int cmp_stu_name(const void* e1, const void* e2)
{
	return strcmp(((struct Stu*)e1)->name, ((struct Stu*)e2)->name);
}

//排序结构体
void fun2()
{
	struct Stu stu_arr[3] = { {"zhangsan",15},{"lisi",35},{"wangwu",20} };
	int sz = sizeof(stu_arr) / sizeof(stu_arr[0]);
	qsort(stu_arr,sz,sizeof(stu_arr[0]),cmp_stu_age);//年龄排序
	qsort(stu_arr, sz, sizeof(stu_arr[0]), cmp_stu_name);//名字排序
}
//***********************************************************************************
void _swap(char* buf1, char* buf2, int width)
{
	int i = 0;
	for (i = 0; i < width; i++)
	{
		char tmp = *buf2;
		*buf2 = *buf1;
		*buf1 = tmp;
		buf1++;
		buf2++;
	}
}

void bobble_sort(void* base, size_t num, size_t width, int (*cmp)(const void* e1, const void* e2))
{
	size_t i = 0;
	for (i = 0; i < num - 1; i++)
	{
		size_t j = 0;
		for (j = 0; j < num - 1 - i; j++)
			if (cmp((char*)base + j * width, (char*)base + (j + 1) * width) > 0)
				_swap((char*)base + j * width, (char*)base + (j + 1) * width, width);
	}
}

void fun3()
{
	int arr1[10] = { 1,5,6,2,3,8,9,4,3,7 };
	int sz = sizeof(arr1) / sizeof(arr1[0]);
	paint(arr1, sz);

	bobble_sort(arr1, sz, sizeof(arr1[0]), cmp_int);
	paint(arr1, sz);

}

int main()
{
	fun1();//使用库函数实现整形数组的快速排序

	fun2();//使用库函数实现结构体类型的快速排序

	fun3();//自定义冒泡排序，模拟快速排序功能
	return 0;
}