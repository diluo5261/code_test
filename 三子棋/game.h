#pragma once
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <time.h>
#define ROW 3
#define COL 3

//��ʼ������-��ʼλ�ո�
void InitBoard(char board[ROW][COL], int row, int col);
//��ӡ����
void DisplayBoard(char board[ROW][COL], int row, int col);
//�������
void PlayMove(char board[ROW][COL], int row, int col);
//�ж���Ӯ
char CheckWin(char board[ROW][COL], int row, int col);

/*
* ����Ӯ #
* ���Ӯ *
* ƽ�� Q
* ���� C




*/