#include "contact.h"
//���������䡢�Ա𡢵绰����ַ
//����ɾ���顢�ġ���ʾ�������˳�

static void menu()
{
	printf("**********************************\n");
	printf("***** 1��add      2��delete  *****\n");
	printf("***** 3��search   4��modify  *****\n");
	printf("***** 5��show     6��sort    *****\n");
	printf("***** 0��exit                *****\n");
	printf("**********************************\n");
}

static enum Option
{ EXIT,ADD,DELETE,SEARCH,MODIFY,SHOW,SORT};

void InitContact(Contact* pc)
{
	pc->capacity = 3;
	pc->sz = 0;
	pc->date = (Contact*)malloc(sizeof(PeopInfo)*3);
	if(NULL == pc->date)
	{
		printf("��ʼ��ʧ��!\n");
		exit(1);
	}
	printf("��ʼ���ɹ�!\n");
}


int main()
{
	Contact con;
	InitContact(&con);
	int input = 0;
	do
	{
		menu();
		printf("���������ѡ��");
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
		case EXIT:
			DestoryContact(&con);
			printf("�˳�ͨѶ¼��\n");
			break;
		default:
			printf("ѡ�����!\n������ѡ��!\n");
			break;
		}
	} while (input);
	return 0;
}