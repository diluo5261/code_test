#include "game.h"
void menu()
{
	printf("*******************\n");
	printf("******1、PLAY******\n");
	printf("******0、EXIT******\n");
	printf("*******************\n");
}
void game()
{
	//雷的信息
	//布置好雷的信息
	char mine[ROWS][COLS] = { 0 };
	//排查雷的信息
	char show[ROWS][COLS] = { 0 };

	//初始化
	InitBoard(mine, ROWS, COLS, '0');
	InitBoard(show, ROWS, COLS, '*');

	//DisPlayBoard(mine, ROW, COL);
	DisPlayBoard(show, ROW, COL);

	//布置雷
	SetMine(mine ,ROW,COL);
	//扫雷
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