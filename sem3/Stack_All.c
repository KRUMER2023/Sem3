#include <stdio.h>
//#include <stdlib.h>

int MAX=10;

int top = -1;
int stack[10];

void push(int value)
{
    if (top >= MAX - 1)
    {
        printf("Stack Overflow\n");
        return;
    }
    top++;
    stack[top] = value;
    printf("%d pushed into stack\n", value);
}

int pop()
{
    if (top < 0)
    {
        printf("Stack Underflow\n");
        return 0;
    }
    int val=stack[top];
    top--;
    return val;
}

int peek()
{
    if (top < 0)
    {
        printf("Stack is Empty\n");
        return 0;
    }
    return stack[top];
}

void traverse()
{
    if (top < 0)
    {
        printf("Stack is Empty\n");
        return;
    }
    printf("Stack elements are: ");
    for (int i = top; i >= 0; i--)
    {
        printf("%d ", stack[i]);
    }
    printf("\n");
}

int main()
{
    push(10);
    push(20);
    push(30);
    push(35);
    printf("%d popped from stack\n", pop());
    printf("Top element is :%d\n", peek());
    traverse();
    return 0;
}
