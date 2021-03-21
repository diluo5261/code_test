#pragma once
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define NAME_MAX 10
#define SEX_MAX 3
#define TELE_MAX 12
#define ADDR_MAX 30

typedef struct PeopInfo
{
	char name[NAME_MAX];
	int age;
	char sex[SEX_MAX];
	char tele[TELE_MAX];
	char addr[ADDR_MAX];
} PeopInfo;

typedef struct Contact
{
	PeopInfo* date;
	int capacity;	//��ǰͨѶ¼������С
	int sz;		//��ǰͨѶ¼��������
} Contact;

//����Ƿ���Ҫ����
void CheckCapacity(Contact* pc);

//���ͨѶ¼
void AddContact(Contact * pc);

//��ʾͨѶ¼
void ShowContact(Contact *pc);

//ɾ��ͨѶ¼
void DeleteContact(Contact * pc);

//����ͨѶ¼
void SearchContact(Contact * pc);

//�޸�ͨѶ¼
void ModifyContact(Contact * pc);

//����ͨѶ¼
void SortContact(Contact * pc);

//����ͨѶ¼
void DestoryContact(Contact * pc);

//����ͨѶ¼
void SaveContact(Contact * pc);