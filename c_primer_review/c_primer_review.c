#include "static_test.h"

/*
int main()
{
	//每个类型所占空间的大小
	printf("%d\n",sizeof(char));		//1
	printf("%d\n", sizeof(short));		//2
	printf("%d\n", sizeof(int));		//4
	printf("%d\n", sizeof(long));		//4
	printf("%d\n", sizeof(long long));	//8
	printf("%d\n", sizeof(float));		//4
	printf("%d\n", sizeof(double));		//8
	printf("%d\n", sizeof(long double));//8


	//转义字符
	//我想打印 ‘  或 “ ，在正常情况下无法打印，就需要用到转义字符或直接打印

	//printf("%c\n",'''); error 编译不通过
	printf("'\n");
	printf("%c\n",'\'');

	//printf(""\n"); error
	printf("\"\n");
	printf("%c\n",'\"');
	printf("%s\n","\"");
	printf("%c\n",'\"');
	//printf("%s\n",'\"');	//error 程序会报错，找不到结束标志位'\0'.

	printf("%d\n",strlen("abcdef"));	//6
	printf("%d\n",strlen("c:\test\328\test.c"));	//14

	return 0;
}
*/

//void test1()
//{
//	int i = 0;
//	i++;
//	printf("%d\n",i);
//}
//
//void test2()
//{
//	static int i = 0;
//	i++;
//	printf("%d\n",i);
//}
//
//int Add(int num1,int num2)
//{
//	return num1 + num2;
//}
//
//static int g_val1 = 111;
//int main()
//{
//	//static 修饰局部变量
//
//	int i = 0;
//	for (i = 0; i < 10; i++)
//		test1();	//打印10个1，每次调用函数i的值重新初始化
//
//	for (i = 0; i < 10; i++)
//		test2();	//打印1-10,i的值保持，直至程序结束
//
//	for (i = 0; i < 10; i++)
//		printf("%d\n",g_val1++);
//
//		//修饰全局变量
//	extern g_val2;
//	extern g_val3;
//	for (i = 0; i < 10; i++)
//	{ 
//		//printf("%d\n", g_val2++);error 报错，在另一个文件中定义了static int g_val2，只能在其源文件中使用
//		printf("%d\n",g_val3++ );
//	}
//
//	//修饰函数
//	printf("%d\n",Add(5,3));
//
//	//extern static int Add_s(int num1, int num2);
//	printf("%d\n", Add_1(5, 5));
//	//printf("%d\n", Add_s(6, 6));  //ERROR  ,使用static修饰的函数，使得这个函数只能在本源文件内使用，不能在其他源文件内使用
//
//	//define 的用法
//	printf("****************************\n");
//	int sum = ADD(8,8);
//
//	printf("%d\n",MAX);
//	printf("%d\n",sum);
//	printf("%d\n", 5*ADD(150,123));
//	return 0;
//}

int main()
{
	//循环
	//int i = 0;
	//while (i<10)
	//{
	//	if (5 == i)
	//		break;
	//	printf("%d\n",i);//01234
	//	i++;
	//}

	/*int i = 0;
	while (i<10)
	{
		if (5 == i)
			continue;
		printf("%d\n",i);//01234无限循环
		i++;

	}*/

	//int i = 0;
	/*while (i <=10)
	{
		if (5 == ++i)
			continue;
		printf("%d\n", i);
	}*/

	//for (i = 1; i <= 10; i++)
	//{
	//	if (5 == i)
	//		continue;
	//		//break;
	//	printf("%d\n",i);
	//}

	//当 k=0时，循环0次，当k=1时无线循环
	/*int i = 0;
	int k = 0;
	int n = 1;
	for ( i = 0,k=0; k=1; i++,k++)
	{
		k++;
		printf("%d\n",n++);
		Sleep(1000);

	}*/

//	int i = 0;
//next:
//	if (0 != i)
//		printf("xxxx\n");
//	while (i<=10)
//	{
//		i++;
//		if (5 == i)
//			goto next;
//		printf("%d\n",i);
//		//i++;
//
//	}

	int i = 0, a = 0, b = 2, c = 3,d = 4;
	i = a++ && ++b && d++;

	return 0;
}