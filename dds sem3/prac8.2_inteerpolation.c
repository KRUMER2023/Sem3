#include<stdio.h>

void print(int a[],int l)
{
    for(int i=0;i<l;i++)
    {
        printf("%d ",a[i]);
    }
    puts(" ");
}

int interpolation(int a[],int lo,int hi,int tar)
{
    if(lo==hi)
    {
        if(a[lo]==a[hi])
        {
            return lo;
        }
        return -1;
    }

    int pos = -1;

    while(lo <= hi && tar >= a[lo] && tar <= a[hi])
    {
        pos = lo+ (((double)(hi - lo) / (a[hi] - a[lo]))* (tar - a[lo]));

        if (a[pos] == tar)
            return pos;

        else if (a[pos] < tar)
            pos + 1;

        else
            pos -1;
    }
}

int main()
{
    int arr[] = { 2,4,7,9,12,15,18,20,23,25};
    int n = sizeof(arr) / sizeof(arr[0]);

    int x = 20;
    int index = interpolation(arr, 0, n - 1, x);

    puts("Original Array:");
    print(arr,n);

    if (index != -1)
        printf("Element found at index %d", index);
    else
        printf("Element not found.");
    return 0;
}
