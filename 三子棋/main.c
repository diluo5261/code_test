#include "game.h"
void menu()
{
	printf("**************************\n");
	printf("*********1��paly**********\n");
	printf("*********0��exit**********\n");
	printf("**************************\n");
}

void game()
{
	char ret;
	//���ݴ洢���Ƕ�λ����
	char board[ROW][COL];
	//��ʼ������-��ʼλ�ո�
	InitBoard(board,ROW,COL);

	//��ӡ����
	DisplayBoard(board,ROW,COL);
	while (1)
	{
		//�������
		PlayMove(board,ROW,COL);
		ret = CheckWin(board, ROW, COL);
		if (ret != 'C')
		{
			break;
		}		
		DisplayBoard(board, ROW, COL);
		//��������
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
		printf("���������ѡ��>\n");
		scanf("%d",&choice);
		switch (choice)
		{
		case 1:
			game();
			break;
		case 0:
			printf("�˳���Ϸ��\n");
				break;
		default:
			printf("ѡ�����������ѡ��\n");
			break;
		}
	} while (choice);

	return 0;
}