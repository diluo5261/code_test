#pragma once
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <errno.h>

#define NAME_MAX 20
#define SEX_MAX 5
#define TELE_MAX 12
#define ADDR_MAX 30
#define MAX 1000

//ÿ���˵���Ϣ
typedef struct PeoIfo
{
	char name[NAME_MAX];
	int age;
	char sex[SEX_MAX];
	char tele[TELE_MAX];
	char addr[ADDR_MAX];
}PeoIfo;

typedef struct Contact
{
	PeoIfo date[MAX];//���100���˵���Ϣ
	int sz;//��ʾͨѶ¼�е�ǰ��ŵ��˵���Ϣ����
}Contact;

//����һ���˵���Ϣ
void AddContact(Contact * pc);

//��ʾ��Ϣ
void ShowContact(Contact * pc);

//ɾ����Ϣ
void DelConct(Contact * pc);

//������Ϣ
void SearchContact(const Contact * pc);

//�޸���Ϣ
void ModContact(Contact * pc);

//������Ϣ
void SortContact(Contact *pc);
