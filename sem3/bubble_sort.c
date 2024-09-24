#include<stdio.h>

int main()
{
    int ar[]={21,2,45,8,36,9,41};
    int n = sizeof(ar)/sizeof(ar[0]);
    int i,j,temp;

    puts("THE ORIGINAL ARRAY:");
    for(i=0;i<(n);i++)
    {
        printf("%d ",ar[i]);
    }
    puts(" ");

    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
            printf("comparing %d with %d\n",ar[j],ar[j+1]);
            if(ar[j]>ar[j+1])
            {
                int temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
            }
        }
    }

    puts("THE SORTED ARRAY:");
    for(i=0;i<n;i++)
    {
        printf("%d ",ar[i]);
    }
    return 0;
}
