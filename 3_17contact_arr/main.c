/*通讯录
* 保存1000个人的信息：
* 名字、年龄、性别、电话、地址
* 1、增加一个人的信息
* 2、删除一个人的信息
* 3、查找一个人的信息
* 4、修改一个人的信息
* 5、显示所有人的信息
* 6、排序
* 0、退出
*/
#include "contact.h"

void menu()
{	//选择菜单
	printf("********************************\n");
	printf("*****1、add       2、del   *****\n");
	printf("*****3、search    4、modify*****\n");
	printf("*****5、show      6、sort  *****\n");
	printf("*****0、exit      7、save  *****\n");
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
	InitContact(&con);//对通讯录进行初始化
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
			printf("退出通讯录！\n");
			break;
		default:
			printf("选择错误，请重新选择！\n");
			break;
		}

	} while (input);
	return 0;
}