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

//每个人的信息
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
	PeoIfo date[MAX];//存放100个人的信息
	int sz;//表示通讯录中当前存放的人的信息个数
}Contact;

//增加一个人的信息
void AddContact(Contact * pc);

//显示信息
void ShowContact(Contact * pc);

//删除信息
void DelConct(Contact * pc);

//查找信息
void SearchContact(const Contact * pc);

//修改信息
void ModContact(Contact * pc);

//排序信息
void SortContact(Contact *pc);
