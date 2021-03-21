#include "contact.h"
//姓名、年龄、性别、电话、地址
//增、删、查、改、显示、排序、退出

static void menu()
{
	printf("**********************************\n");
	printf("***** 1、add      2、delete  *****\n");
	printf("***** 3、search   4、modify  *****\n");
	printf("***** 5、show     6、sort    *****\n");
	printf("***** 0、exit     7、save    *****\n");
	printf("**********************************\n");
}

static enum Option
{ EXIT,ADD,DELETE,SEARCH,MODIFY,SHOW,SORT,SAVE};

void LoadContact(Contact * pc)
{
	//打开文件
	FILE* pfIn = fopen("contact.txt","rb");
	if (pfIn == NULL)
	{
		printf("LoadContact:%s",strerror(errno));
		return;
	}
	//读取文件
	PeopInfo tmp = { 0 };
	while (fread(&tmp,sizeof(PeopInfo),1,pfIn))
	{
		//检查是否需要扩容
		CheckCapacity(pc);
		pc->date[pc->sz] = tmp;
		pc->sz++;

	}


	//关闭文件
	if (pfIn != NULL)
	{
		fclose(pfIn);
		pfIn = NULL;
	}
}

void InitContact(Contact* pc)
{
	pc->capacity = 3;
	pc->sz = 0;
	pc->date = (Contact*)malloc(sizeof(PeopInfo)*3);
	if(NULL == pc->date)
	{
		printf("初始化失败!\n");
		exit(1);
	}
	//加载文件
	LoadContact(pc);

	printf("初始化成功!\n");
}


int main()
{
	Contact con;
	InitContact(&con);
	int input = 0;
	do
	{
		menu();
		printf("请输入你的选择：");
		scanf("%d",&input);
		switch (input)
		{
		case ADD:
			AddContact(&con);
			break;
		case DELETE:
			DeleteContact(&con);
			break;
		case SEARCH:
			SearchContact(&con);
			break;
		case MODIFY:
			ModifyContact(&con);
			break;
		case SHOW:
			ShowContact(&con);
			break;
		case SORT:
			SortContact(&con);
			break;
		case SAVE:
			SaveContact(&con);
			break;
		case EXIT:
			DestoryContact(&con);
			printf("退出通讯录！\n");
			break;
		default:
			printf("选择错误!\n请重新选择!\n");
			break;
		}
	} while (input);
	return 0;
}