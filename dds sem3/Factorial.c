#include <stdio.h>

int fact(int a)
{
  if(a==0)
  {
    return 1;
  }
  else
  {
    return a*fact(a-1);
  }
}

void main()
{
  int n;
  puts("Enter the no. to find factorial:");
  scanf("%d",&n);
  int fac=fact(n);
  printf("Factorial of the %d is : %d.",n,fac);
}

