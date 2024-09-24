#include<stdio.h>
#include<stdlib.h>

void main()
{
    int *ptr;

    ptr = (int*) malloc(5*sizeof(int));//take 1 argument

    for(int i=0;i<5;i++)
    {
        printf("Enter the %d no.: \n",i+1);
        scanf("%d",&ptr[i]);
    }

    for(int i=0;i<5;i++)
    {
        printf("The %d element of the array: %d\n",i+1,ptr[i]);
    }
    free(ptr);
}
