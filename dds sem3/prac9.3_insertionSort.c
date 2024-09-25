#include<stdio.h>

void print(int a[],int n)
{
    for(int i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    puts(" ");
}

void inserSort(int *arr,int l)
{
    int key,j;//1 ele. of unsorted array
    for(int i=1;i<=l-1;i++)//taking every ele. as key 1 by 1
    {
        key=arr[i];
        j=i-1;//last ele. of sorted array
        while(j>=0 && key<arr[j])
        {
            arr[j+1]=arr[j];
            j--;
        }

        arr[j+1]=key;
    }
}

void main()
{
    int arr[]={10,2,35,96,1,41},temp;
    int len=sizeof(arr)/sizeof(arr[0]);

    puts("Original array:");
    print(arr,len);

    inserSort(arr,len);

    puts("Edited array:");
    print(arr,len);


}
