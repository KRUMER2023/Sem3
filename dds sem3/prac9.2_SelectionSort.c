#include<stdio.h>

void print(int a[],int n)
{
    for(int i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    puts(" ");
}

void ss(int *A,int n)
{
    int min,temp;

    for(int i=0;i<n;i++)//putting elem to proper index 1 by 1
    {
        min=i;
        for(int j=i+1;j<n;j++)//finds min. value from array
        {
            if(A[j]<A[min])
            {
                min=j;
            }
        }

        temp=A[i];
        A[i]=A[min];
        A[min]=temp;
    }
}

void main()
{
    int A[]={8,21,5,99,30,19};
    int n=sizeof(A)/sizeof(A[0]);

    puts("Original array:");
    print(A,n);

    ss(A,n);

    puts("Sorted array:");
    print(A,n);
}
