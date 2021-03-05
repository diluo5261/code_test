#include "static_test.h"

static int g_val2 = 222;	//一个全局变量被static 修饰，只能在其本文件中使用
int g_val3 = 333;

int Add_1(int num1, int num2)
{
	return num1 + num2;
}
static int Add_s(int num1, int num2)
{
	return num1 + num2;
}