/*ͨѶ¼
* ����1000���˵���Ϣ��
* ���֡����䡢�Ա𡢵绰����ַ
* 1������һ���˵���Ϣ
* 2��ɾ��һ���˵���Ϣ
* 3������һ���˵���Ϣ
* 4���޸�һ���˵���Ϣ
* 5����ʾ�����˵���Ϣ
* 6������
* 0���˳�
*/
#include "contact.h"

void menu()
{	//ѡ��˵�
	printf("********************************\n");
	printf("*****1��add       2��del   *****\n");
	printf("*****3��search    4��modify*****\n");
	printf("*****5��show      6��sort  *****\n");
	printf("*****0��exit      7��save  *****\n");
	printf("********************************\n");

}

enum Option
{  EXIT ,ADD ,DEL ,SEARCH ,MODIFY ,SHOW ,SORT ,SAVE };

void InitContact(Contact * pc)
{
	pc->sz = 0;
	memset(pc->date,0,sizeof(pc->date));

}
int main()
{
	Contact con;
	InitContact(&con);//��ͨѶ¼���г�ʼ��
	int input;
	do
	{
		menu();
		printf("input your choice:");
		scanf("%d",&input);
		switch (input)
		{
		case ADD:
			AddContact(&con);
			break;
		case DEL:
			DelConct(&con);
			break;
		case SEARCH:
			SearchContact(&con);
			break;
		case MODIFY:
			ModContact(&con);
			break;
		case SHOW:
			ShowContact(&con);
			break;
		case SORT:
			SortContact(&con);
			break;
		case SAVE:
			break;
		case EXIT:
			printf("�˳�ͨѶ¼��\n");
			break;
		default:
			printf("ѡ�����������ѡ��\n");
			break;
		}

	} while (input);
	return 0;
}