#include "game.h"

//初始化棋盘-初始位空格
void InitBoard(char board[ROW][COL], int row, int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j <col; j++)
		{
			board[i][j] = ' ';
		}
	}

}
//打印棋盘
void DisplayBoard(char board[ROW][COL], int row, int col)
{
	//方法一：-->使用这种方法，如果改变棋盘后，不利于扩展
	//int i = 0;
	//for (i = 0; i < row; i++)
	//{
	//	//打印数据
	//	printf(" %c | %c | %c \n", board[i][0], board[i][1], board[i][2]);
	//	//打印分隔行
	//	if(i<row-1)
	//	printf("---|---|---\n");
	//}	

	//方法2：-->
	int i = 0;
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
	
}

//玩家下棋
void PlayMove(char board[ROW][COL], int row,int col)
{
	int x = 0, y = 0;
	printf("玩家走；-->\n");
	while (1)
	{
		printf("请输入一个坐标：\n");
		scanf("%d %d",&x,&y);
		if (x >= 1 && x <= row && y>=1 && y <= col)
		{
			if (board[x-1][y-1] != ' ')
				printf("该处已有棋子，请重新输入：\n");
			else
			{
				board[x - 1][y - 1] = '*';
				break;
			}
		}
		else
		{
			printf("坐标范围不正确，请重新输入!：\n");
		}
	}
}

//电脑下棋
void CompterMove(char board[ROW][COL], int row, int col)
{
	printf("电脑走：-->\n");
	while (1)
	{
		int x = rand() % row;
		int y = rand() % col;
		if (x >= 0 && x < row && y >= 0 && y < col)
		{
			if (board[x][y] == ' ')
			{
				board[x][y] = '#';
				break;
			}
				
		}
	}
}

static int IsFull(char board[ROW][COL],int row,int col)
{
	int i = 0, j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			if (board[i][j] == ' ');//有空位，继续，返回0
			return 0;
		}
	}
	return 1;
}

//判断输赢
char  CheckWin(char board[ROW][COL], int row, int col)
{
	int i = 0;
	//三行的判断
	for (i = 0; i < row; i++)
	{
		if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
			return board[i][0];
	}
	//三列判断
	for (i = 0; i < col; i++)
	{
		if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
			return board[0][i];
	}
	//对角线
	if (board[1][1] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
		return board[1][1];
	if (board[1][1] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
		return board[1][1];

	//平局
	if (IsFull(board, row, col) == 1)
		return 'Q';

	return 'C';
}