#include <stdio.h>
#include <stddef.h>
#include <stdlib.h>
						//获取奇数位			//获取奇数位
#define SWAPNUM(num)  (((num)&0x55555555)<<1)|(((num)&0xaaaaaaaa)>>1)

//23   十进制
//00000000 00000000 00000000 00010111   二进制

//获取奇数位,奇数位&1,偶数位&0
//01010101 01010101 01010101 01010101 
//55 55 55 55

//获取偶数位,奇数位&0,偶数位&1
//10101010 10101010 10101010 10101010 
//aa aa aa aa

////奇左移一位,偶右移一位
//int main()
//{
//	int num = 23;
//	printf("%d",SWAPNUM(num));
//	return 0;
//}
//
//
//
//#define MAX 100
//#define reg register
//#define 










//atoi 把一个字符串转化为整形
int main()
{
	printf("%d\n",atoi("1234"));
	printf("%d\n",atoi("k-1235"));
	return 0;
}









//#define OFFSETOF(struct_name,member_name)  (int)&(((struct_name *)0)->member_name)
//
//typedef struct Stdent
//{
//	char name[10];
//	int age;
//	double score;
//	char sex;
//}Stdent;
//
//
//int main()
//{
//	/*printf("%d\n", offsetof(Stdent, name));
//	printf("%d\n", offsetof(Stdent, age));
//	printf("%d\n", offsetof(Stdent, score));
//	printf("%d\n", offsetof(Stdent, sex));*/
//
//	printf("%d\n", OFFSETOF(Stdent, name));
//	printf("%d\n", OFFSETOF(Stdent, age));
//	printf("%d\n", OFFSETOF(Stdent, score));
//	printf("%d\n", OFFSETOF(Stdent, sex));
//	return 0;
//}

int my_atoi(const char* str)
{
	int flag = 1;
	long long ret = 0;
	assert(str);//判空
	//判断空字符串
	if ('\0' == *str)
		return 0;
	//判断是否为空格
	while (isspace(*str))
		str++;
	//遇到'-'号时
	if ('-' == *str)
	{
		flag = -1;
		str++;
	}

	if ('+' == *str)
		str++;

	while (*str)
	{
		if (*str >= '0' && *str <= '9')//判断是否为数字字符
		{
			ret = ret * 10 + flag * (*str - '0');
			if (ret > INT_MAX || ret < INT_MIN)//判断是否溢出
				return ret;
		}
		else
		{
			break;;
		}
		str++;
	}
	return ret;


}

void test1()
{
	char* str1 = "-12345asd";
	char* str2 = "123a2";

	int ret1 = my_atoi(str1);
	printf("%d\n", ret1);
	//int ret1 = atoi(str1);
	//int ret2 = atoi(str2);
	//printf("%d\n",ret1);
	//printf("%d\n", ret2);
}

char* my_strncat(char* dest, const char* src, size_t n)
{
	assert(dest && src);//判空
	char* ret = dest;

	while (*dest)
		dest++;

	while (n)
	{
		*dest = *src;
		dest++;
		src++;
		n--;
	}
	*dest = '\0';
	return ret;
}


void test2()
{
	char str1[20] = "abcd";
	char* str2 = "qwer";
	my_strncat(str1, str2, sizeof(str2));
	//strncat(str1, str2, sizeof(str2));
	printf("%s\n", str1);

}

char* my_strncpy(char* dest, const char* src, size_t n)
{
	assert(dest && src);
	char* ret = dest;
	while (n)
	{
		*dest++ = *src++;
		n--;
	}
	return ret;
}

void test3()
{
	char str1[20] = "abcdef";
	char* str2 = "123456";
	my_strncpy(str1, str2, 3);
	//strncpy(str1,str2,7);
	printf("%s\n", str1);
}

void FindToDif(int str[], int len)
{

	int rst = 0;
	int p1 = 0;
	int num1 = 0;
	int num2 = 0;
	int i = 0;
	//对所有值进行异或
	for (i = 0; i < len; i++)
	{
		rst ^= str[i];
	}
	//找到里面为一的一位
	for (i = 0; i < 32; i++)
	{
		if ((rst >> i) & 1 == 1)
		{
			p1 = i;
			break;
		}
	}
	for (i = 0; i < len; i++)
	{
		if ((str[i] >> p1) & 1)
			num1 ^= str[i];
		else
			num2 ^= str[i];

	}
	printf("num1 = %d,num2 = %d\n", num1, num2);
}


void test4()
{
	int str1[] = { 1,2,3,5,6,7,1,2,3,6 };
	FindToDif(str1, 10);

}
int main()
{
	//test1();
	//test2();
	test3();
	test4();

	return 0;
}