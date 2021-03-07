#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

struct man
{
	char name[30];
	char sex[10];
	short age;
	int tele;
}p1,*p2;

struct man p3;

struct man p4 = {"zhangsan","male",30,123456789};
struct man* p5; 

int main()
{
	p5 = &p4;
	printf("%s\n",p5->name);
	return 0;
}



////求n的阶乘
//int main()
//{
//	/*int n = 0;
//	scanf("%d",&n);
//	int ret = 1;
//	int sum = 0;
//	int i = 0;
//	for (i = 1; i <= n; i++)
//		ret *= i;
//	printf("%d\n",ret);*/
//
//	int i = 0;
//	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
//	for (i = 0; i <= 12; i++)
//	{
//		arr[i] = 0;
//		printf("hehe\n");
//	}
//
//	return 0;
//}
//
//
//
//
//
//
//
//
//
//
//
//


////将一句话进行倒置输出，标点符号不进行倒置
//void reverse(char *left ,char *right)//逆序功能
//{
//	while (left <right)
//	{
//		char tmp = *left;
//		*left = *right;
//		*right = tmp;
//		left++;
//		right--;
//	}
//}
//
//
//
//int main()
//{
//	char str[10] = {0};
//	gets(str);
//	int len = strlen(str);
//
//	reverse(str,str+len-1);
//
//	char* end = str;
//	while (*end)
//	{
//		char* start = end;
//		while (*end != ' ' && *end != '\0')
//		{
//			end++;
//		}
//		reverse(start, end - 1);
//		if(*end != '\0')
//			end++;
//	}
//	printf("%s\n",str);
//
//	return 0;
//}


//求两个数的最小公倍数
//int main()
//{

//	size_t a;
//	size_t b;
//	scanf("%d %d",&a,&b);
//	int i = 1;
//
//	while (a*i%b != 0)
//	{
//		i++;
//	}
//	printf("%d\n",a*i);
//


	/*size_t a;
	size_t b;
	scanf("%d %d",&a,&b);

	size_t result = a > b ? a : b;

	while (result % a != 0 || result %b != 0)
	{
		result++;
	}
	printf("%d\n",result);
	return 0;*/
//}

//int main()
//{
//	size_t a;
//	size_t b;
//	scanf("%d %d",&a,&b);
//
//	size_t max = a > b ? a:b;
//	while (max % a != 0 || max % b != 0)
//		max++;
//	printf("%d\n",max);
//	return 0;
//}