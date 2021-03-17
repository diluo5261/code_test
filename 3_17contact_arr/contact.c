#include "contact.h"
void AddContact(Contact* pc)
{
	if (100 == pc->sz)
	{
		printf("通讯录已满！\n无法添加！");
		return;
	}
	else
	{
		printf("input name:");
		scanf("%s",pc->date[pc->sz].name);

		printf("input age:");
		scanf("%d", &pc->date[pc->sz].age);

		printf("input sex:");
		scanf("%s", pc->date[pc->sz].sex);

		printf("input tele:");
		scanf("%s", pc->date[pc->sz].tele);

		printf("input address:");
		scanf("%s", pc->date[pc->sz].addr);

		pc->sz++;
		printf("添加成功！\n");
	}
}

//显示信息
void ShowContact(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("通讯录为空！\n无法打印！\n");
		return;
	}
	printf("name  age  sex   tele   address\n");
	int i = 0;
	for (i = 0; i < pc->sz; i++)
	{
		printf("%s      %d    %s      %s      %s\n",
				pc->date[i].name, 
				pc->date[i].age, 
				pc->date[i].sex, 
				pc->date[i].tele,
				pc->date[i].addr);
	}
	printf("show finish!\n");
}

static int FindByName(Contact* pc, char* name)
{
	int i = 0;
	for (i = 0; i < pc->sz; i++)
	{
		if (!strcmp(pc->date[i].name, name))
			return i;//找到时返回下标的位置
	}
	return -1;//没找到时返回-1
}


//删除信息
void DelConct(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("通讯录为空!\n无删除信息!\n");
		return;
	}
	char name[NAME_MAX];
	printf("input your delete name:");
	scanf("%s",name);
	int pos =FindByName(pc, name);
	if (-1 == pos)
	{
		printf("你要删除的人不存在!\n");
	}
	else
	{
		int i = 0;
		for (i = pos; i < pc->sz - 1; i++)
			pc->date[pos] = pc->date[pos + 1];
		pc->sz--;
		printf("delete success!\n");
	}
}

//查找信息
void SearchContact(const Contact* pc)
{
	char name[NAME_MAX];
	printf("input your srarch name:");
	scanf("%s",name);
	int pos = FindByName(pc,name);
	if (-1 == pos)
	{
		printf("no person!");
		return;
	}
	else
	{
		printf("%s      %d    %s      %s      %s\n",
			pc->date[pos].name,
			pc->date[pos].age,
			pc->date[pos].sex,
			pc->date[pos].tele,
			pc->date[pos].addr);
		printf("search message finish!\n");
	}
}

//修改信息
void ModContact(Contact* pc)
{
	char name[NAME_MAX];
	printf("input your modify name:");
	scanf("%s",name);
	int pos = FindByName(pc,name);
	if (-1 == pos)
	{
		printf("not find!\n ");
		return;
	}
	else
	{
		printf("input name:");
		scanf("%s", pc->date[pos].name);

		printf("input age:");
		scanf("%d", &pc->date[pos].age);

		printf("input sex:");
		scanf("%s", pc->date[pos].sex);

		printf("input tele:");
		scanf("%s", pc->date[pos].tele);

		printf("input address:");
		scanf("%s", pc->date[pos].addr);

		printf("modify sucess!\n");
	}
}


//排序信息
void SortContact(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("通讯录为空!\n无法排序!\n");
		return;
	}
	else
	{
		PeoIfo tmp;
		int i = 0;
		for ( i = 0; i < pc->sz; i++)
		{
			int j = 0;
			for (j = 0; j < pc->sz-i-1; j++)
			{
				if (strcmp(pc->date[j].name, pc->date[j + 1].name) > 0)
				{
					tmp = pc->date[j];
					pc->date[j] = pc->date[j + 1];
					pc->date[j + 1] = tmp;

				}
			}
		}
		printf("end of the sort!\nsucess\n");
	}

}