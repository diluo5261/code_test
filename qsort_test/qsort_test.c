#include <stdio.h>
#include <string.h>
#include <stdlib.h>

//冒泡排序
//
//对一个整形数组进行冒泡排序的
//

void print_arr(int arr[], int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}

//void bubble_sort(int arr[], int sz)
//{
//	int i = 0;
//	//趟数
//	for (i = 0; i < sz - 1; i++)
//	{
//		//一趟冒泡排序的内容
//		int j = 0;
//		for (j = 0; j < sz-1-i; j++)
//		{
//			if (arr[j] > arr[j + 1])
//			{
//				int tmp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = tmp;
//			}
//		}
//	}
//}

//int main()
//{
//	int arr[] = { 1, 5, 2, 4, 3, 9, 8, 6, 7, 0};
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	bubble_sort(arr, sz);//排成升序
//	print_arr(arr, sz);
//
//	return 0;
//}
//
//库函数-qsort - quick sort
// 排序任意类型的数据
//



//int cmp_int(const void* e1, const void* e2)
//{
//	if (*(int*)e1 > *(int*)e2)
//		return 1;
//	else if (*(int*)e1 < *(int*)e2)
//		return -1;
//	else
//		return 0;
//}
#include <stdlib.h>
//
//int cmp_int(const void* e1, const void* e2)
//{
//	return (*(int*)e1 - *(int*)e2);
//}
//
//void test1()
//{
//	//qsort 排序整形数组
//	int arr[] = { 1, 5, 2, 4, 3, 9, 8, 6, 7, 0 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	qsort(arr, sz, sizeof(arr[0]), cmp_int);
//	print_arr(arr, sz);
//}
//
//struct Stu
//{
//	char name[20];
//	int age;
//};
//
//int cmp_stu_by_age(const void* e1, const void* e2)
//{
//	return ((struct Stu*)e1)->age - ((struct Stu*)e2)->age;
//}
//
//int cmp_stu_by_name(const void*e1, const void*e2)
//{
//	return strcmp( ((struct Stu*)e1)->name, ((struct Stu*)e2)->name);
//}
//
//void test2()
//{
//	//使用qsort函数排序结构体
//	struct Stu arr[] = { { "zhangsan", 20 }, { "lisi", 31 }, {"wangwu", 15} };
//	//按照名字来排序？还是按照年龄？
//	//按年龄
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	//qsort(arr, sz, sizeof(arr[0]), cmp_stu_by_age);
//	//按名字排序
//	qsort(arr, sz, sizeof(arr[0]), cmp_stu_by_name);
//}
//
//
////void qsort(void *base, - 待排序数据的起始位置
////	      size_t num, 
////		  size_t width, 
////		  int(*cmp)(const void *e1, const void *e2)
////		  );
//
void _swap(char* buf1, char* buf2, int width)
{
	int i = 0;
	for (i = 0; i < width; i++)
	{
		char tmp = *buf1;
		*buf1 = *buf2;
		*buf2 = tmp;
		buf1++;
		buf2++;
	}
}
//
void bubble_sort(void* base, size_t sz, size_t width, int(*cmp)(const void* e1, const void* e2))
{
	size_t i = 0;
	//趟数
	for (i = 0; i < sz - 1; i++)
	{
		size_t j = 0;
		for (j = 0; j < sz - 1 - i; j++)
		{
			//相邻2个元素的比较
			//base[j] base[j+1] 
			if (cmp((char*)base + j * width, (char*)base + (j + 1) * width) > 0)
			{
				//如果不满足顺序就交换
				_swap((char*)base + j * width, (char*)base + (j + 1) * width, width);
			}
		}
	}
}
//
//void test3()
//{
//	//qsort 排序整形数组
//	int arr[] = { 1, 5, 2, 4, 3, 9, 8, 6, 7, 0 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	bubble_sort(arr, sz, sizeof(arr[0]), cmp_int);
//	print_arr(arr, sz);
//}
//
//void test4()
//{
//	//使用qsort函数排序结构体
//	struct Stu arr[] = { { "zhangsan", 20 }, { "lisi", 31 }, { "wangwu", 15 } };
//	//按照名字来排序？还是按照年龄？
//	//按年龄
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	bubble_sort(arr, sz, sizeof(arr[0]), cmp_stu_by_age);
//	//按名字排序
//	//bubble_sort(arr, sz, sizeof(arr[0]), cmp_stu_by_name);
//}

//int main()
//{
//	//test1();
//	//test2();
//	test4();
//	return 0;
//}

//int main()
//{
//	int a = 10;
//	void* p = &a;
//
//	//void* 的指针变量，可以接收任意类型的地址
//	//因为void*的指针，没有具体类型，所以不能解引用操作，不能++/--
//
//	//int* pa = &a;
//
//	//*pa = 20;
//
//	//void* pv = &a;
//	//*pv = 0;
//	//pv++;//
//
//	return 0;
//}