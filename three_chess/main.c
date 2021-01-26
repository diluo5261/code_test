#include "game.h"

void menu()	//菜单显示
{
	printf("*************************\n");
	printf("*********1、PLAY*********\n");
	printf("*********0、EXIT*********\n");
	printf("*************************\n");
}

void game()
{
	srand((size_t)time(NULL));
	char board[ROW][COL];
	InitBoard(board,ROW,COL);//数组初始化
	DisplayBoard(board, ROW, COL);//打印棋盘
	char ret =ChieckWin(board, ROW, COL);//判断输赢

	while (1)
	{
		PlayMove(board, ROW, COL);
		ret = ChieckWin(board, ROW, COL);
		if (ret != 'C')
		{
			break;
		}
		DisplayBoard(board, ROW, COL);

		CompterMove(board, ROW, COL);
		ret = ChieckWin(board, ROW, COL);
		if (ret != 'C')
		{
			break;
		}
		DisplayBoard(board, ROW, COL);
	}

	if (ret == '*')
		printf("player win !!!\n");
	else if (ret == '#')
		printf("compter win !!!\n");
	else if (ret == 'Q')
		printf("half a match !!!\n");
	

}


int main()
{
	int choice = 0;	

	do
	{
		//游戏选择菜单
		menu();
		printf("please intput choice:>\n");
		scanf("%d", &choice);
		switch (choice)
		{
		case 1:
			game();
			break;
		case 0:
			printf("EXIT GAME!\n");
				break;
		default:
			printf("select error!\nplease input again!\n");
			break;
		}

	} while (choice);




	return 0;
}