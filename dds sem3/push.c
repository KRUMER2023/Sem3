#include<stdio.h>

int maxsize=8;
int stack[8];
int top=-1;

int isFull()
{
    if(top==maxsize)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int push(int data)
{
    if(!isFull())
    {
        top=top+1;
        stack[top]=data;
    }
    else
    {
        printf("stack is full... ");
    }
}

int main()
{
    int i;
    push(44);
    push(55);
    push(62);
    push(01);
    push(12);

    for(i=0;i<maxsize;i++)
    {
        printf("%d ",stack[i]);
    }
    return 0;
}
