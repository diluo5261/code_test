#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void menu(void)
{
	printf("|---------------------------------|\n");
	printf("|*********************************|\n");
	printf("|*************1、PLAY*************|\n");
	printf("|*************0、EXIT*************|\n");
	printf("|*********************************|\n");
	printf("|---------------------------------|\n");
}

void game(void)
{
	int randomNum = rand() % 100 + 1;
	int guessNum = 0;

	while (1)
	{
		printf("请输入你猜的数字：>\n");
		scanf("%d",&guessNum);
		if (guessNum > randomNum)
			printf("猜大了！\n");
		else if (guessNum < randomNum)
			printf("猜小了！\n");
		else
		{
			printf("恭喜你！猜对了！\n");
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
		printf("请输入你的选择：>\n");
		scanf("%d", &choice);
		switch (choice)
		{
		case 0:
			printf("退出游戏！\n");
			break;
		case 1:
			game();
			break;
		default:
			printf("选择错误！\n请重新选择！\n");
			break;
		}
	} while (choice);
	return 0;
}