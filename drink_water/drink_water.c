#include <stdio.h>
//��Ŀ���ݣ�
//����ˮ��1ƿ��ˮ1Ԫ��2����ƿ���Ի�һƿ��ˮ����20Ԫ�����Զ�����ˮ

int main()
{
	//����1��
	int money = 0;
	scanf("%d", &money);//20
	int total = 0;
	int empty = 0;
	total += money;
	empty = money;

	//�û�
	while (empty>=2)
	{
		total += empty / 2;
		empty = empty / 2 + empty%2;
	}
	printf("total = %d\n", total);
	return 0;
}


//����2��
//int main()
//{
//	int money = 0;
//	int total = 0;
//	scanf("%d", &money);//20
//	if (money > 0)
//		total = money * 2 - 1;
//
//	printf("total = %d\n", total);
//	return 0;
//}