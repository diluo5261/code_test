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
	int capacity;	//当前通讯录容量大小
	int sz;		//当前通讯录人数个数
} Contact;

//检查是否需要扩容
void CheckCapacity(Contact* pc);

//添加通讯录
void AddContact(Contact * pc);

//显示通讯录
void ShowContact(Contact *pc);

//删除通讯录
void DeleteContact(Contact * pc);

//查找通讯录
void SearchContact(Contact * pc);

//修改通讯录
void ModifyContact(Contact * pc);

//排序通讯录
void SortContact(Contact * pc);

//销毁通讯录
void DestoryContact(Contact * pc);

//保存通讯录
void SaveContact(Contact * pc);