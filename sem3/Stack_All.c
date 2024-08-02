#include <stdio.h>
#define MAX 100

typedef struct Stack{
  int item[MAX];
  int top;
}Stack;

void creation(Stack *s)
{
  s->top=-1;
}

int isFull(Stack *s)
{
  return s->top==(MAX-1);
}

int isEmpty(Stack *s)
{
  return s->top==-1;
}

void push(Stack* s , int Item)
{
  if(isFull(&s))
  {
    puts("Stack is full...");
  }
  else
  {
    s->top++;
    s->item[s->top]=Item;
    printf("Item %d push to the stack\n",Item);
  }
}

void pop(Stack* s)
{ int item;
  if(isEmpty(&s))
  {
    puts("Stack is Empty.......");
  }
  else 
  {
    item=s->item[s->top];
    s->top--;
    printf("Item %d pop from the stack\n",item);
  }
}

void peek(Stack *s)
{
  if(s->top==-1)
  {
    puts("No top Item Stack is Empty......");
  }
  else
  {
    printf("Top Item: %d\n",s->item[s->top]);
  }
}

void search(Stack *s,int key)
{

  printf("Searching %d in Stack: \n",key);
  if(isEmpty(&s))
  {
    puts("Stack is Empty....");
    return;
  }
  else
  {
    for(int i=0;i<=s->top;i++)
    {
      if(s->item[i]==key)
      {
        printf("Item %d found at index: %d\n",key,i);
        return;
      }
    }
    puts("Item not found....");
    return;
  }
}

void travel(Stack *s)
{
  
  if(isEmpty(&s))
  {
    puts("Stack is Empty....\n");
  }
  else
  {
    puts("Stack items:");
    for(int i=s->top;i>=0;i--)
    {
      printf("%d \n",s->item[i]);
    } 
  }  
}

int main()
{
  Stack s;
  creation(&s);
  
  push(&s,10);
  push(&s,20);
  push(&s,30);
  
  travel(&s);
  
  pop(&s);
  //pop(&s);
  //pop(&s);
  
  search(&s,20);
  
  peek(&s);
    
}