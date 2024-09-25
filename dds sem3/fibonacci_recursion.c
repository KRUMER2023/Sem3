#include<stdio.h>
#include<conio.h>

// 0 1 1 2 3 5 8 13

int fibo(int n)
{
    static int a=0,b=1,c;
    c=a+b;
    a=b;
    b=c;
    if(n>0)
    {
        printf("%d ",c);
        return fibo(n-1);
    }
}

int main()
{
    int n;
    puts("Enter length of fibonacci series:");
    scanf("%d",&n);
    printf("the fibonacci series upto of %d is\n",n);
    printf("%d %d ",0,1);
    fibo(n-2);
    return 0;
    getch();
}
