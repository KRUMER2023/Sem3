#include<stdio.h>

int main()
{
    int ar[]={21,2,45,8,2,9,41};
    int n = sizeof(ar)/sizeof(int);
    int tar;
    int con=0;

    puts("THE ARRAY:");

    for(int i=0;i<n;i++)
    {
        printf("%d ",ar[i]);
    }
    puts(" ");

    puts("Enter the no. want to search:");
    scanf("%d",&tar);

    for(int i=0;i<n;i++)
    {
        if(ar[i]==tar)
        {
            printf("TARGET %d FOUOND AT POSITION: %d\n",tar,i+1);
        }
        else
        {
            con++;
        }
    }

    if(con==n)
    {
        puts("TARGET NOT FOUND");
    }
    return 0;
}
