#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <time.h>
#include <stdbool.h>


#define ROW 3
#define COL 3

void InitBoard(char board, int row, int col); //��ʼ������,��λ����

void DisplayBoard(char board[ROW][COL], int row, int col);

void PlayMove(char board[ROW][COL], int row, int col);		//�������

void CompterMove(char board[ROW][COL], int row, int col);	//��������

char ChieckWin(char board[ROW][COL], int row, int col);		//�ж���Ӯ

/*
* ���Ӯ����'*'
* ����Ӯ����'#'
* ƽ�ַ��� 'Q'
* ��������'C'


*/