#include <stdio.h>

char * my_strcpy(char * dest, const char *score)
{
	char* ret = dest;

	while (*score != '\0')
	{
		*dest = *score;
		dest++;
		score++;
	}
	*dest = '\0';
	return ret;
}


int main()
{
	char arr1[] = "------------------";
	char arr2[] = "hello china";
	char arr3[] = {'h','e','l','l','o'};
	char arr4[] = "------------------";

	//ʹ�ÿ⺯��ʵ���ַ����Ŀ���

	int sz = strlen(arr3);
	printf("%d\n",sz);

	//strcpy(arr1,arr3);  ������⣬�Ҳ���'/0',��Խ�����
	//strcpy(arr1, arr2);
	my_strcpy(arr4,arr2);
	printf("%s\n",arr4);
	return 0;
}