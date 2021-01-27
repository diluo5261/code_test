#include "game.h"

void InitBoard(char mine[ROWS][COLS], int rows, int cols, char set)	//��ʼ��
{
	int i;
	for (i = 0; i < rows; i++)
	{
		int j;
		for (j = 0; j < cols; j++)
		{
			mine[i][j] = set;
		}
	}
}

void DisPlayBoard(char board[ROW][COL], int row, int col)		//��ӡ����
{
	//��ӡ�к�
	int i = 0;
	for (i = 0; i <= row; i++)
		printf("%d ", i);
	putchar(10);

	for (i = 1; i <= row; i++)
	{
		printf("%d ", i);
		int j = 0;
		for (j = 1; j <= col; j++)
		{
			printf("%c ", board[i][j]);
		}
		putchar(10);
	}
}

//������
void SetMine(char board[ROW][COL], int row, int col)
{
	int count = EASE_COUNT;
	while (count)
	{
		int x = rand() % row + 1;
		int y = rand() % col + 1;
		if (board[x][y] == '0')
		{
			board[x][y] = '1';
			count--;
		}
	}
}

int get_mine_count(char mine[ROW][COL], int x, int y)
{
	return mine[x - 1][y] + mine[x - 1][y - 1] + mine[x][y - 1] +
		mine[x + 1][y - 1] + mine[x + 1][y] + mine[x + 1][y + 1] +
		mine[x][y + 1] + mine[x + 1][y + 1] - 8 * '0';


}

void FindMine(char mine[ROW][COL], char show[ROW][COL], int row, int col)
{
	int win = 0;
	int x, y;
	while (1)
	{
		printf("�������������꣺>\n");
		scanf("%d %d", &x, &y);
		if (x >= 1 && x <= row && y >= 1 && y <= col)
		{
			if (mine[x][y] == '1')
			{
				printf("���ź����㱻ը���ˣ�\n");
				DisPlayBoard(mine, ROW, COL);
				break;
			}
			else
			{
				int count = get_mine_count(mine, x, y);
				show[x][y] = count + '0';
				DisPlayBoard(show, row, col);
				win++;
			}
		}
		else
			printf("���������������������룡\n");
		if (win == row * col - EASE_COUNT)
			printf("��ϲ�㣬���׳ɹ�\n");
	}
}