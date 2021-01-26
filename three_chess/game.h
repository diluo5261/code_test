#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <time.h>
#include <stdbool.h>


#define ROW 3
#define COL 3

void InitBoard(char board, int row, int col); //初始化棋盘,置位数组

void DisplayBoard(char board[ROW][COL], int row, int col);

void PlayMove(char board[ROW][COL], int row, int col);		//玩家下棋

void CompterMove(char board[ROW][COL], int row, int col);	//电脑下棋

char ChieckWin(char board[ROW][COL], int row, int col);		//判断输赢

/*
* 玩家赢返回'*'
* 电脑赢返回'#'
* 平局返回 'Q'
* 继续返回'C'


*/