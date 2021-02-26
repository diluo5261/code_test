#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void menu()
{
	printf("***********************\n");
	printf("****1、add 2、sub******\n");
	printf("****3、mul 4、div******\n");
	printf("****   0、exit*********\n");
}

int add(int x, int y)
{
	return x + y;
}

int sub(int x, int y)
{
	return x - y;
}

int mul(int x, int y)
{
	return x * y;
}

int div(int x, int y)
{
	return x / y;
}

void calc(int (*p)(int,int))
{
	int x, y;
	printf("please input two num:\n");
	scanf("%d %d",&x,&y);
	int ret = p(x,y);
	printf("%d\n",ret);


}

int main()
{

	//计算器的加减乘除
	//*********************常规写法
	/*int input;
	int x, y;
	int ret;
	do
	{
		menu();
		printf("请输入你的选择：\n");
		scanf("%d",&input);
		switch (input)
		{
		case 1:
			printf("please input two num:\n");
			scanf("%d %d",&x,&y);
			ret = add(x,y);
			printf("%d\n",ret);
			break;
		case 2:
			printf("please input two num:\n");
			scanf("%d %d", &x, &y);
			ret = sub(x, y);
			printf("%d\n", ret);
			break;
		case 3:
			printf("please input two num:\n");
			scanf("%d %d", &x, &y);
			ret = mul(x, y);
			printf("%d\n", ret);
			break;
		case 4:
			printf("please input two num:\n");
			scanf("%d %d", &x, &y);
			ret = div(x, y);
			printf("%d\n", ret);
			break;
		case 0:
			printf("退出计算器!\n");
			break;
		default:
			printf("选择错误!\n");
			break;
		}
		
	} while (input);*/

//*********************************
//使用函数指针数组实现--转移表
	/*
	int input = 0;
	int x = 0;
	int y = 0;
	int ret = 0;
	int (*pfarr[])(int, int) = { 0,add,sub,mul,div };
	do
	{
		menu();
		printf("please input your choice:\n");
		scanf("%d",&input);
		if (0 == input)
		{
			printf("exit calc\n");
			break;
		}
		else if (input >= 1 && input <= 4)
		{
			printf("please input two num:\n");
			scanf("%d %d",&x,&y);
			ret =pfarr[input](x, y);
			printf("%d\n",ret);
		}
		else
		{
			printf("input error\n");
		}

	} while (input);
	*/
//***************************************************
//使用回调函数的方式实现

	

	int input = 0;
	do
	{
		menu();
		printf("please input your choice:\n");
		scanf("%d",&input);
		switch (input)
		{
		case 1:
			calc(add);
			break;
		case 2:
			calc(sub);
			break;
		case 3:
			calc(mul);
			break;
		case 4:
			calc(div);
			break;
		case 0:
			printf("exit calc!\n");
			break;
		default:
			printf("input error please again:!\n");
			break;
		}

	} while (input);


	return 0;
}