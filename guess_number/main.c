#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void menu(void)
{
	printf("|---------------------------------|\n");
	printf("|*********************************|\n");
	printf("|*************1��PLAY*************|\n");
	printf("|*************0��EXIT*************|\n");
	printf("|*********************************|\n");
	printf("|---------------------------------|\n");
}

void game(void)
{
	int randomNum = rand() % 100 + 1;
	int guessNum = 0;

	while (1)
	{
		printf("��������µ����֣�>\n");
		scanf("%d",&guessNum);
		if (guessNum > randomNum)
			printf("�´��ˣ�\n");
		else if (guessNum < randomNum)
			printf("��С�ˣ�\n");
		else
		{
			printf("��ϲ�㣡�¶��ˣ�\n");
			break;
		}
	}
}
int main()
{
	srand((size_t)time(0));
	int choice = 0;
	do
	{
		menu();
		printf("���������ѡ��>\n");
		scanf("%d", &choice);
		switch (choice)
		{
		case 0:
			printf("�˳���Ϸ��\n");
			break;
		case 1:
			game();
			break;
		default:
			printf("ѡ�����\n������ѡ��\n");
			break;
		}
	} while (choice);
	return 0;
}