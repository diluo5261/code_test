#include "test.h"

void setQuestion()
{
	srand(time(NULL));//�������������
	int num1 = 0;
	int num2 = 0;
	//char ch = 0;
	char sym[] = {'+','-','*','/'};

	//���ļ�
	FILE *p_write = fopen("test.txt" , "w");
	if (NULL == p_write)
	{
		printf("open file fault");
		return;
	}

	for (int i = 0; i < NUM; i++)
	{
		//���������
		num1 = rand() % 100 + 1;
		num2 = rand() % 100 + 1;
		sym[rand() % 4];
		char msg[32] = {0};
		//��ʽ�����
		sprintf(msg , "%d %c %d =\n" ,num1, sym[rand() % 4],num2);
		//printf("%s" , msg);
		//д�뵽�ļ�

		fputs(msg , p_write);
	}
	//�ر��ļ�
	fclose(p_write);
	printf("set question finish\n");
}