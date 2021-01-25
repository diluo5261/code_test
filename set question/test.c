#include "test.h"

void setQuestion()
{
	srand(time(NULL));//设置随机数种子
	int num1 = 0;
	int num2 = 0;
	//char ch = 0;
	char sym[] = {'+','-','*','/'};

	//打开文件
	FILE *p_write = fopen("test.txt" , "w");
	if (NULL == p_write)
	{
		printf("open file fault");
		return;
	}

	for (int i = 0; i < NUM; i++)
	{
		//产生随机数
		num1 = rand() % 100 + 1;
		num2 = rand() % 100 + 1;
		sym[rand() % 4];
		char msg[32] = {0};
		//格式化输出
		sprintf(msg , "%d %c %d =\n" ,num1, sym[rand() % 4],num2);
		//printf("%s" , msg);
		//写入到文件

		fputs(msg , p_write);
	}
	//关闭文件
	fclose(p_write);
	printf("set question finish\n");
}