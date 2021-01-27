#pragma once
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

#define ROW 9
#define COL 9

#define ROWS ROW+2
#define COLS COL+2

#define EASE_COUNT 10

void InitBoard(char mine[ROWS][COLS], int rows, int cols, char set);	//初始化

void DisPlayBoard(char board[ROW][COL], int row, int col);		//打印棋盘

void SetMine(char board[ROW][COL], int row, int col); // 设置雷

void FindMine(char mine[ROW][COL], char show[ROW][COL], int row, int col);
