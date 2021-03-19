#include "contact.h"
//添加通讯录
void AddContact(Contact* pc)
{
	if (pc->capacity == pc->sz)
	{
		//扩容
		PeopInfo * ptr = (PeopInfo*)realloc(pc->date, sizeof(PeopInfo) * (pc->capacity + 2));
		if (ptr == NULL)
		{
			printf("扩容失败!\n");
			return;
		}
		pc->date = ptr;
		pc->capacity += 2;
		printf("扩容成功!\n");
	}
	printf("input name:");
	scanf("%s",pc->date[pc->sz].name);

	printf("input age:");
	scanf("%d", &pc->date[pc->sz].age);

	printf("input sex:");
	scanf("%s", pc->date[pc->sz].sex);

	printf("input telephone:");
	scanf("%s", pc->date[pc->sz].tele);

	printf("input address:");
	scanf("%s", pc->date[pc->sz].addr);

	pc->sz++;
	printf("添加成功!\n");
}

//显示通讯录
void ShowContact(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("通讯录为空!\n无法打印!\n");
		return;
	}
	else
	{
		printf("name    age   sex   tele    addr\n");
		int i = 0;
		for (i = 0; i < pc->sz; i++)
		{
			printf("%s\t %d     %s      %s       %s\n",
				pc->date[i].name,
				pc->date[i].age,
				pc->date[i].sex,
				pc->date[i].tele,
				pc->date[i].addr);
		}
		printf("显示完毕!\n");
	}
}

//找到联系人时返回联系人位置
//找不到联系人时返回-1
static int FindName(Contact * pc, char * name)
{
	int i = 0;
	for ( i = 0; i < pc->sz; i++)
	{
		if (strcmp(pc->date[i].name, name) == 0)
			return i;
	}
	return -1;
}

//删除通讯录
void DeleteContact(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("通讯录为空!\n无删除信息\n");
		return;
	}
	else
	{
		char name[NAME_MAX];
		printf("请输入你要删除人的姓名:");
		scanf("%s",name);
		int pos = FindName(pc,name);

		if (-1 == pos)
		{
			printf("无删除人信息!\n");
		}
		else
		{
			int i = 0;
			for ( i = pos; i < pc->sz-1; i++)
			{
				pc->date[i] = pc->date[i + 1];
			}
			pc->sz--;
			printf("删除成功!\n");
		}
	}
}

//查找通讯录
void SearchContact(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("通讯录为空!\n无查找联系人信息!\n");
	}
	else
	{
		char name[NAME_MAX];
		printf("请输入你要查找联系人的姓名:");
		scanf("%s",name);

		int pos = FindName(pc, name);
		if (-1 == pos)
		{
			printf("查不到此联系人!\n");
		}
		else
		{
			printf("name    age   sex   tele    addr\n");
				printf("%s\t %d     %s      %s       %s\n",
					pc->date[pos].name,
					pc->date[pos].age,
					pc->date[pos].sex,
					pc->date[pos].tele,
					pc->date[pos].addr);
			printf("查找完毕!\n");
		}
	}
}

//修改通讯录
void ModifyContact(Contact* pc)
{
	if(0 == pc->sz)
	{
		printf("通讯录为空!\n无可修改信息!\n");
	}
	else
	{
		char name[NAME_MAX];
		printf("请输入你要修改人的姓名:");
		scanf("%s", name);
		int pos = FindName(pc, name);
		if (-1 == pos)
		{
			printf("找不到要修改的联系人:\n");
		}
		else
		{
			printf("请输入要修改的信息:\n");
			printf("input name:");
			scanf("%s", pc->date[pos].name);

			printf("input age:");
			scanf("%d", &pc->date[pos].age);

			printf("input sex:");
			scanf("%s", pc->date[pos].sex);

			printf("input telephone:");
			scanf("%s", pc->date[pos].tele);

			printf("input address:");
			scanf("%s", pc->date[pos].addr);

			printf("修改成功!\n");
		}
	}
}

//排序通讯录
void SortContact(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("通讯录为空!\n无法排序!\n");
	}
	else
	{
		int i = 0;
		for ( i = 0; i < pc->sz; i++)
		{
			int j = 0;
			for (j = 0; j <pc->sz-i-1; j++)
			{
				if (strcmp(pc->date[j].name, pc->date[j + 1].name) > 0)
				{
					PeopInfo tmp = pc->date[j];
					pc->date[j] = pc->date[j + 1];
					pc->date[j + 1] = tmp;
				}
			}

		}
		printf("排序完成!\n");
	}
}

//销毁通讯录
void DestoryContact(Contact* pc)
{
	if (pc->date != NULL)
	{
		pc->sz = 0;
		pc->capacity = 0;
		free(pc->date);
		pc->date = NULL;
		printf("销毁成功!\n");
	}
}