#include<stdio.h>

void print(int a[],int l)
{
    for(int i=0;i<l;i++)
    {
        printf("%d ",a[i]);
    }
    puts(" ");
}

void binar(int a[],int lo,int hi,int tar)
{
    int mid;

    while(lo<=hi)
    {
        mid=(lo+hi)/2;
        if(a[mid]==tar)
        {
            printf("Element found at index %d and position %d",mid,mid+1);
            return 0;
        }
        else if(a[mid]<tar)
        {
            lo=mid+1;
        }
        else
        {
            hi=mid-1;
        }
    }
    printf("ELEMENT NOT FOUND.....");
}

void main()
{
    int a[]={12,23,36,46,58,59,60};
    int n=sizeof(a)/sizeof(int);
    int tar;

    puts("Original Array:");
    print(a,n);

    printf("Enter the no you want to search:");
    scanf("%d",&tar);

    binar(a,0,n-1,tar);

}
