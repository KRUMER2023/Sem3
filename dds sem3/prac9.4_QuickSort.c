#include<stdio.h>

void print(int a[],int n)
{
    for(int i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    puts(" ");
}

void quick(int a[],int low,int high)
{   if(low<high)
    {
        int locpi=low,pivot=a[locpi];
        int i=locpi,j=high,temp;

        while(j>i)
        {
            while(a[i]<=pivot)//find larger value than pivot
            {
                i++;
            }
            while(a[j]>pivot)//finds smaller value then pivot
            {
                j--;
            }

            if(j>i)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }

        temp=a[locpi];
        a[locpi]=a[j];
        a[j]=temp;
        locpi=j;

        quick(a,low,locpi-1);
        quick(a,locpi+1,high);
    }


}

void main()
{
    int a[]={63,1,98,65,41,21,11,10};
    int len=sizeof(a)/sizeof(a[0]);

    puts("Original Array:");
    print(a,len);

    quick(a,0,len-1);

    puts("Sorted Array:");
    print(a,len);
}
