#include "static_test.h"

static int g_val2 = 222;	//һ��ȫ�ֱ�����static ���Σ�ֻ�����䱾�ļ���ʹ��
int g_val3 = 333;

int Add_1(int num1, int num2)
{
	return num1 + num2;
}
static int Add_s(int num1, int num2)
{
	return num1 + num2;
}