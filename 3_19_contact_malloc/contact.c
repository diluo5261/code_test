#include "contact.h"
//���ͨѶ¼
void AddContact(Contact* pc)
{
	if (pc->capacity == pc->sz)
	{
		//����
		PeopInfo * ptr = (PeopInfo*)realloc(pc->date, sizeof(PeopInfo) * (pc->capacity + 2));
		if (ptr == NULL)
		{
			printf("����ʧ��!\n");
			return;
		}
		pc->date = ptr;
		pc->capacity += 2;
		printf("���ݳɹ�!\n");
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
	printf("��ӳɹ�!\n");
}

//��ʾͨѶ¼
void ShowContact(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("ͨѶ¼Ϊ��!\n�޷���ӡ!\n");
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
		printf("��ʾ���!\n");
	}
}

//�ҵ���ϵ��ʱ������ϵ��λ��
//�Ҳ�����ϵ��ʱ����-1
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

//ɾ��ͨѶ¼
void DeleteContact(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("ͨѶ¼Ϊ��!\n��ɾ����Ϣ\n");
		return;
	}
	else
	{
		char name[NAME_MAX];
		printf("��������Ҫɾ���˵�����:");
		scanf("%s",name);
		int pos = FindName(pc,name);

		if (-1 == pos)
		{
			printf("��ɾ������Ϣ!\n");
		}
		else
		{
			int i = 0;
			for ( i = pos; i < pc->sz-1; i++)
			{
				pc->date[i] = pc->date[i + 1];
			}
			pc->sz--;
			printf("ɾ���ɹ�!\n");
		}
	}
}

//����ͨѶ¼
void SearchContact(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("ͨѶ¼Ϊ��!\n�޲�����ϵ����Ϣ!\n");
	}
	else
	{
		char name[NAME_MAX];
		printf("��������Ҫ������ϵ�˵�����:");
		scanf("%s",name);

		int pos = FindName(pc, name);
		if (-1 == pos)
		{
			printf("�鲻������ϵ��!\n");
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
			printf("�������!\n");
		}
	}
}

//�޸�ͨѶ¼
void ModifyContact(Contact* pc)
{
	if(0 == pc->sz)
	{
		printf("ͨѶ¼Ϊ��!\n�޿��޸���Ϣ!\n");
	}
	else
	{
		char name[NAME_MAX];
		printf("��������Ҫ�޸��˵�����:");
		scanf("%s", name);
		int pos = FindName(pc, name);
		if (-1 == pos)
		{
			printf("�Ҳ���Ҫ�޸ĵ���ϵ��:\n");
		}
		else
		{
			printf("������Ҫ�޸ĵ���Ϣ:\n");
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

			printf("�޸ĳɹ�!\n");
		}
	}
}

//����ͨѶ¼
void SortContact(Contact* pc)
{
	if (0 == pc->sz)
	{
		printf("ͨѶ¼Ϊ��!\n�޷�����!\n");
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
		printf("�������!\n");
	}
}

//����ͨѶ¼
void DestoryContact(Contact* pc)
{
	if (pc->date != NULL)
	{
		pc->sz = 0;
		pc->capacity = 0;
		free(pc->date);
		pc->date = NULL;
		printf("���ٳɹ�!\n");
	}
}