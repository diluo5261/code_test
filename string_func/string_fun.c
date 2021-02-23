#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <assert.h>
#include <errno.h>

//长度受限的字符操作函数
int main()
{
	char dest[50], src[50];

	strcpy(dest,"hello china!");
	strcpy(src,"hello world!");

	strncat(dest,src,strlen(src)+5);

	printf("%s\n",dest);

	return 0;
}






////错误报告函数
//int main()
//{
//
//
//	FILE* fp = fopen("test.txt","r");
//	if (fp == NULL)
//		printf("the error message is:%s\n",strerror(errno));
//
//	perror("the error message is");
//	/*printf("%s\n",strerror(0));
//	printf("%s\n", strerror(1));
//	printf("%s\n", strerror(2));
//
//	printf("-------------------\n");
//
//	perror("error  message is:");*/
//
//	return 0;
//}



//int main()
//{
//	char str[] = "hello@china.123.world@456";
//	char* p;
//	char* delim = "@.";
//	for (p = strtok(str, delim); p; p = strtok(NULL, delim))
//	{
//		printf("%s\n",p);
//	}
//	return 0;
//}




//int main()
//{
//	char str[] = "hello@china.123.world@456";
//	char* p;
//	printf("%s\n", strtok(str, "@."));
//	while (p = strtok(NULL, "@."))
//			printf("%s\n", p);
//	
//	/*printf("%s\n", strtok(NULL, "@."));
//	printf("%s\n", strtok(NULL, "@."));
//	printf("%s\n", strtok(NULL, "@."));
//	printf("%s\n", strtok(NULL, "@."));
//	printf("%s\n", strtok(NULL, "@."));*/
//	return 0;
//}






//char* my_strstr(const char * str1,const char* str2)
//{
//	assert(str1 && str2);
//	if (!*str2)
//		return (char *)str1;
//	const char* cp = str1;
//	while (*cp)
//	{
//		const char* p1 = cp;
//		const char* p2 = str2;
//		while ((*p1) && (*p2) &&(*p1 == *p2))
//		{
//			p1++;
//			p2++;
//		}
//		if (!*p2)
//			return (char *)cp;
//		cp++;
//	}
//	return NULL;
//}


//int main()
//{
//	char *str1 = "hello china!";
//	char* str2 = "china";
//	char* ret = my_strstr(str1,str2);
//	if (ret)
//		printf("%s\n", ret);
//	else
//		printf("not find!\n");
//	return 0;
//}



//char* my_strcpy(char *dest, char * src)
//{
//	assert(dest && src);
//	char* ret =dest;
//	while (*dest++ = *src++)
//		;
//
//	return ret;
//}
//
//int main()
//{
//	char str1[] = "hello china!";
//	char str2[50] = { 0 };
//	/*strcpy(str2,str1);*/
//
//	my_strcpy(str2,str1);
//	printf("%s\n",str2);
//
//	return 0;
//}