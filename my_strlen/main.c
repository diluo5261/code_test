#include <stdio.h>

int my_strlen(const char *arr)
{
	int count = 0;
	while (*arr++ != '\0')	count++;
	return count;
}

int main()
{
	char arr[100] = "abcd";
	gets(arr);
	printf("%d\n", my_strlen(arr));

}