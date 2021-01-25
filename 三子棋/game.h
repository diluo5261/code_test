#pragma once
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <time.h>
#define ROW 3
#define COL 3

//初始化棋盘-初始位空格
void InitBoard(char board[ROW][COL], int row, int col);
//打印棋盘
void DisplayBoard(char board[ROW][COL], int row, int col);
//玩家下棋
void PlayMove(char board[ROW][COL], int row, int col);
//判断输赢
char CheckWin(char board[ROW][COL], int row, int col);

/*
* 电脑赢 #
* 玩家赢 *
* 平局 Q
* 继续 C




*/