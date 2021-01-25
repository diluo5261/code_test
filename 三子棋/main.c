#include "game.h"
void menu()
{
	printf("**************************\n");
	printf("*********1、paly**********\n");
	printf("*********0、exit**********\n");
	printf("**************************\n");
}

void game()
{
	char ret;
	//数据存储的是二位数组
	char board[ROW][COL];
	//初始化棋盘-初始位空格
	InitBoard(board,ROW,COL);

	//打印棋盘
	DisplayBoard(board,ROW,COL);
	while (1)
	{
		//玩家下棋
		PlayMove(board,ROW,COL);
		ret = CheckWin(board, ROW, COL);
		if (ret != 'C')
		{
			break;
		}		
		DisplayBoard(board, ROW, COL);
		//电脑下棋
		CompterMove(board, ROW, COL);
		ret = CheckWin(board, ROW, COL);
		if (ret != 'C')
		{
			break;
		}
		DisplayBoard(board, ROW, COL);
	}
	if (ret == '#')
		printf("compter win!\n");
	else if (ret == '*')
		printf("player win!\n");
	else if (ret == 'Q')
		printf("half a match!\n");
	DisplayBoard(board, ROW, COL);
}



int main()
{
	srand((size_t)time(NULL));
	int choice = 0;
	do
	{
		menu();
		printf("请输入你的选择：>\n");
		scanf("%d",&choice);
		switch (choice)
		{
		case 1:
			game();
			break;
		case 0:
			printf("退出游戏！\n");
				break;
		default:
			printf("选择错误，请重新选择！\n");
			break;
		}
	} while (choice);

	return 0;
}