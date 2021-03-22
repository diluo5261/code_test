#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

typedef struct PeoInfo
{
	char name[10];
	int age;
	char tele[12];
	char addr[30];
}PeoInfo;

int main()
{
	PeoInfo p2 = {"zhangsan",33,"1235648","fhisanlfjslf"};
	char buff[100];
	sprintf(buff,"%s %d %s %s", p2.name, &p2.age, p2.tele, p2.addr);
	fprintf(stdout,"%s\n\n", buff);

	sscanf(buff,"%s %d %s %s",p2.name,&p2.age,p2.tele,p2.addr);
	fprintf(stdout, "%s %d %s %s", p2.name, p2.age, p2.tele, p2.addr);
	return 0;
}


//int main()
//{
//	PeoInfo p2 = { 0 };
//	FILE* pf = fopen("test4.txt", "r");
//	if (NULL == pf)
//	{
//		perror("open error:");
//		return 1;
//	}
//	fscanf(pf,"%s %d %s %s",p2.name,&p2.age,p2.tele,p2.addr);
//	fprintf(stdout, "%s %d %s %s", p2.name, p2.age, p2.tele, p2.addr);
//
//	if (NULL != pf)
//	{
//		fclose(pf);
//		pf = NULL;
//	}
//	return 0;
//}


//int main()
//{
//	PeoInfo p1 = {"zhangsan",23,"13522653652","beijingshidaxingqu"};
//	FILE* pf = fopen("test4.txt","w");
//	if (NULL == pf)
//	{
//		perror("open error:");
//		return 1;
//	}
//
//	fprintf(pf,"%s %d %s %s", p1.name, p1.age, p1.tele, p1.addr);
//
//	if (pf != NULL)
//	{
//		fclose(pf);
//		pf = NULL;
//	}
//	return 0;
//}



//
//int main()
//{
//	FILE* pf = fopen("test3.txt", "r");
//	if (pf == NULL)
//	{
//		perror("open failed:");
//	}
//	char arr[20];
//	while (fgets(arr,10,pf) != NULL)
//	{
//		printf("%s",arr);
//	}



	/*int ch = 0;*/
	/*while ((ch = fgetc(pf))!= EOF )
	{
		putchar(ch);
	}*/

	fclose(pf);
//	pf = NULL;
//
//	return 0;
//}


//int main()
//{
//	FILE* pf = fopen("test3.txt", "w");
//	if (NULL == pf)
//	{
//		perror("open error:");
//		return 1;
//	}
//	//写一行数据
//	fputs("asdfghjklzxcvbnm",pf);
//	fputs("123456789",pf);
//	fputs("\n", pf);
//	fputs("!@#$%^&*\n", pf);
//	fputs("qwertyuiop",pf);
//
//	fclose(pf);
//	pf = NULL;
//	return 0;
//}



//int main()
//{
//	/*FILE* pf = fopen("test2.txt","w");
//	if (pf == NULL)
//	{
//		printf("%s\n", strerror(errno));
//		return 1;
//	}
//	int i = 0;
//	for ( i = 'a'; i <= 'z'; i++)
//		fputc(i, pf);
//
//	fclose(pf);
//	pf = NULL;*/
//
//	FILE* pf = fopen("test2.txt", "r");
//	if (pf == NULL)
//	{
//		printf("%s\n", strerror(errno));
//		return 1;
//	}
//
//	int ch = fgetc(pf);
//	while ((ch =fgetc(pf))!= EOF) 
//	{
//		putchar(ch);
//	}
//	fclose(pf);
//	pf = NULL;

	/*fputc('a',stdout);
	fputc('\n', stdout);
	fputs("abf", stdout);
	fputc('c', stdout);*/
//	return 0;
//}




//int main()
//{
//	FILE* pf = fopen("test1.txt", "w");
//	if (!pf)
//	{
//		printf("%s\n", strerror(errno));
//		return 1;
//	}
//	int i = 0;
//	/*for ( i = 'a'; i < 'z'; i++)
//	{
//		fputc(i,pf);
//	}*/
//	//关闭文件
//	fclose(pf);
//	pf = NULL;
//	return 0;
//}