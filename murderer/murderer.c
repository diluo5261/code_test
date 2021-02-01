#include <stdio.h>
/*5位运动员参加了10米台跳水比赛，有人让他们预测比赛结果：
A选手说：B第二，我第三；
B选手说：我第二，E第四；
C选手说：我第一，D第二；
D选手说：C最后，我第三；
E选手说：我第四，A第一；
比赛结束后，每位选手都说对了一半*/
int main()
{
	int a, b, c, d, e;

	for (a = 1; a <= 5; a++)
		for (b = 1; b <= 5; b++)
			for (c = 1; c <= 5; c++)
				for (d = 1; d <= 5; d++)
					for (e = 1; e <= 5; e++)
					{
						if (120 == a * b * c * d * e)
						{
							if ((1 == (2 == b) + (3 == a)) &&
								(1 == (2 == b) + (4 == e)) &&
								(1 == (1 == c) + (2 == d)) &&
								(1 == (5 == c) + (3 == d)) &&
								(1 == (4 == e) + (1 == a)) == 1)
								printf("a=%d b=%d c=%d d=%d e=%d\n", a, b, c, d, e);
						}						
					}
	return 0;

}





















///*日本某地发生了一件谋杀案，警察通过排查确定杀人凶手必为4个嫌疑犯的一个。
//以下为4个嫌疑犯的供词:
//A说：不是我。
//B说：是C。
//C说：是D。
//D说：C在胡说
//已知3个人说了真话，1个人说的是假话。*/
//int main()
//{
//	char murderer = 0;
//	for (murderer = 'a'; murderer <= 'd'; murderer++)
//		if (3 == (murderer != 'a') + (murderer == 'c') + (murderer == 'd') + (murderer != 'd'))
//			printf("murderer is %c\n",murderer);
//	return 0;
//}