#include "game.h"

void InitBoard(char board[ROW][COL],int row,int col)			//置位数组
{
	int i, j;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
			board[i][j] = ' ';
	}
	return;
}

void DisplayBoard(char board[ROW][COL],int row,int col) //打印棋盘
{
	int i;
	for (i = 0; i < row; i++)
	{
		int j = 0;
		for (j = 0; j < col; j++)
		{
			printf(" %c ",board[i][j]);
			if (j < col - 1)
				printf("|");
		}
		putchar(10);
		if (i < row - 1)
		{
			for (j = 0; j < col; j++)
			{
				printf("---");
				if (j < col - 1)
					printf("|");
			}
		}
		putchar(10);
	}
	return;
}


//玩家下棋
void PlayMove(char board[ROW][COL], int row, int col)
{
	int x = 0, y = 0;
	printf("玩家请下棋：>\n");
	while (1)
	{
		printf("请输入一个坐标：>\n");
		scanf("%d %d",&x,&y);
		if (x >= 1 && x <= row && y >= 1 && y <= col)
		{
			if (board[x - 1][y - 1] != ' ')
				printf("The position is full\nTry again\n");
			else
			{
				board[x - 1][y - 1] = '*';
				break;
			}
				
		}
		else
		{
			printf("Range error\nTry again\n");
		}
	}
}

void CompterMove(char board[ROW][COL], int row, int col)
{
	int x = 0, y = 0;

	while (1)
	{
		x = rand() % 3;
		y = rand() % 3;

		if (x >= 0 && x <= row && y >= 0 && y <= col)
			if (' ' == board[x][y])
			{
				board[x][y] = '#';
				break;
			}
	}
}

bool ISFull(char board[ROW][COL], int row, int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			if (board[i][j] == ' ')
				return 0;
		}
	}
	return 1;
}

char ChieckWin(char board[ROW][COL], int row, int col)
{
	//行判断
	int i = 0;
	for (i = 0; i < row; i++)
	{
		if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
			return board[i][0];
	}

	//三列判断
	for (i =0;i<col;i++)
	{
		if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
			return board[0][i];
	}
	//对角线判断
	if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
		return board[1][1];
	if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
		return board[1][1];


	if (ISFull(board, row, col) == 1)
		return 'Q';
	return 'C';
}