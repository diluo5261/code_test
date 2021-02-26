#include <stdio.h>
#include <string.h>
int main()
{
    char arr[100] = "0";
    gets(arr);
    int sz = strlen(arr) - 1;
    int i = 0;
    for (i = sz; i >= 0; i--)
    {
        printf("%c", arr[i]);
    }
    return 0;
}
