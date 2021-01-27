#pragma once
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

#define ROW 9
#define COL 9

#define ROWS ROW+2
#define COLS COL+2

#define EASE_COUNT 10

void InitBoard(char mine[ROWS][COLS], int rows, int cols, char set);	//��ʼ��

void DisPlayBoard(char board[ROW][COL], int row, int col);		//��ӡ����

void SetMine(char board[ROW][COL], int row, int col); // ������

void FindMine(char mine[ROW][COL], char show[ROW][COL], int row, int col);
