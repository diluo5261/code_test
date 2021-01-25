#include "game.h"

//��ʼ������-��ʼλ�ո�
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
//��ӡ����
void DisplayBoard(char board[ROW][COL], int row, int col)
{
	//����һ��-->ʹ�����ַ���������ı����̺󣬲�������չ
	//int i = 0;
	//for (i = 0; i < row; i++)
	//{
	//	//��ӡ����
	//	printf(" %c | %c | %c \n", board[i][0], board[i][1], board[i][2]);
	//	//��ӡ�ָ���
	//	if(i<row-1)
	//	printf("---|---|---\n");
	//}	

	//����2��-->
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

//�������
void PlayMove(char board[ROW][COL], int row,int col)
{
	int x = 0, y = 0;
	printf("����ߣ�-->\n");
	while (1)
	{
		printf("������һ�����꣺\n");
		scanf("%d %d",&x,&y);
		if (x >= 1 && x <= row && y>=1 && y <= col)
		{
			if (board[x-1][y-1] != ' ')
				printf("�ô��������ӣ����������룺\n");
			else
			{
				board[x - 1][y - 1] = '*';
				break;
			}
		}
		else
		{
			printf("���귶Χ����ȷ������������!��\n");
		}
	}
}

//��������
void CompterMove(char board[ROW][COL], int row, int col)
{
	printf("�����ߣ�-->\n");
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
			if (board[i][j] == ' ');//�п�λ������������0
			return 0;
		}
	}
	return 1;
}

//�ж���Ӯ
char  CheckWin(char board[ROW][COL], int row, int col)
{
	int i = 0;
	//���е��ж�
	for (i = 0; i < row; i++)
	{
		if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
			return board[i][0];
	}
	//�����ж�
	for (i = 0; i < col; i++)
	{
		if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
			return board[0][i];
	}
	//�Խ���
	if (board[1][1] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
		return board[1][1];
	if (board[1][1] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
		return board[1][1];

	//ƽ��
	if (IsFull(board, row, col) == 1)
		return 'Q';

	return 'C';
}