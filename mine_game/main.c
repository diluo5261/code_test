#include "game.h"
void menu()
{
	printf("*******************\n");
	printf("******1��PLAY******\n");
	printf("******0��EXIT******\n");
	printf("*******************\n");
}
void game()
{
	//�׵���Ϣ
	//���ú��׵���Ϣ
	char mine[ROWS][COLS] = { 0 };
	//�Ų��׵���Ϣ
	char show[ROWS][COLS] = { 0 };

	//��ʼ��
	InitBoard(mine, ROWS, COLS, '0');
	InitBoard(show, ROWS, COLS, '*');

	//DisPlayBoard(mine, ROW, COL);
	DisPlayBoard(show, ROW, COL);

	//������
	SetMine(mine ,ROW,COL);
	//ɨ��
	FindMine(mine,show, ROW, COL);
}

int main()
{
	srand((size_t)time(NULL));
	int choice = 0;
	do
	{
		menu();
		printf("please choice:\n");
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
			printf("select error!\nplease again!\n");
			break;
		}

	} while (choice);

	return 0;
}