#include "static_test.h"

/*
int main()
{
	//ÿ��������ռ�ռ�Ĵ�С
	printf("%d\n",sizeof(char));		//1
	printf("%d\n", sizeof(short));		//2
	printf("%d\n", sizeof(int));		//4
	printf("%d\n", sizeof(long));		//4
	printf("%d\n", sizeof(long long));	//8
	printf("%d\n", sizeof(float));		//4
	printf("%d\n", sizeof(double));		//8
	printf("%d\n", sizeof(long double));//8


	//ת���ַ�
	//�����ӡ ��  �� �� ��������������޷���ӡ������Ҫ�õ�ת���ַ���ֱ�Ӵ�ӡ

	//printf("%c\n",'''); error ���벻ͨ��
	printf("'\n");
	printf("%c\n",'\'');

	//printf(""\n"); error
	printf("\"\n");
	printf("%c\n",'\"');
	printf("%s\n","\"");
	printf("%c\n",'\"');
	//printf("%s\n",'\"');	//error ����ᱨ���Ҳ���������־λ'\0'.

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
//	//static ���ξֲ�����
//
//	int i = 0;
//	for (i = 0; i < 10; i++)
//		test1();	//��ӡ10��1��ÿ�ε��ú���i��ֵ���³�ʼ��
//
//	for (i = 0; i < 10; i++)
//		test2();	//��ӡ1-10,i��ֵ���֣�ֱ���������
//
//	for (i = 0; i < 10; i++)
//		printf("%d\n",g_val1++);
//
//		//����ȫ�ֱ���
//	extern g_val2;
//	extern g_val3;
//	for (i = 0; i < 10; i++)
//	{ 
//		//printf("%d\n", g_val2++);error ��������һ���ļ��ж�����static int g_val2��ֻ������Դ�ļ���ʹ��
//		printf("%d\n",g_val3++ );
//	}
//
//	//���κ���
//	printf("%d\n",Add(5,3));
//
//	//extern static int Add_s(int num1, int num2);
//	printf("%d\n", Add_1(5, 5));
//	//printf("%d\n", Add_s(6, 6));  //ERROR  ,ʹ��static���εĺ�����ʹ���������ֻ���ڱ�Դ�ļ���ʹ�ã�����������Դ�ļ���ʹ��
//
//	//define ���÷�
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
	//ѭ��
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
		printf("%d\n",i);//01234����ѭ��
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

	//�� k=0ʱ��ѭ��0�Σ���k=1ʱ����ѭ��
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