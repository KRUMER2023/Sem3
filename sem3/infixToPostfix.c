#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#define MAX 100
typedef struct
{
    int top;
    char items[MAX];
} Stack;
// Function to initialize the stack
void initialize(Stack *s)
{
    s->top = -1;
}
// Function to check if the stack is empty
int isEmpty(Stack *s)
{
    return s->top == -1;
}
// Function to push an element onto the stack
void push(Stack *s, char item)
{
    if (s->top == MAX - 1)
    {
        printf("Stack overflow\n");
        exit(1);
    }
    s->items[++(s->top)] = item;
}

// Function to pop an element from the stack
char pop(Stack *s)
{
    if (isEmpty(s))
    {
        printf("Stack underflow\n");
        exit(1);
    }
    return s->items[(s->top)--];
}
// Function to return the top element of the stack without popping it
char peek(Stack *s)
{
    if (isEmpty(s))
    {
        return '\0';
    }
    return s->items[s->top];
}
// Function to determine if a character is an operator
int isOperator(char ch)
{
    return ch == '+' || ch == '-' || ch == '*' || ch == '/';
}
// Function to determine the precedence of an operator
int precedence(char op)
{
    switch (op)
    {
    case '+':
    case '-':
        return 1;
    case '*':
    case '/':
        return 2;
    default:
        return 0;
    }
}
// Function to convert infix expression to postfix expression
void infixToPostfix(char *infix, char *postfix)
{
    Stack s;
    initialize(&s);
    int i, j = 0;
    char ch;
    for (i = 0; infix[i] != '\0'; i++)
    {
        ch = infix[i];
        if (isalpha(ch))
        {
            postfix[j++] = ch; // Add operand to postfix expression
        }
        else if (ch == '(')
        {
            push(&s, ch); // Push '(' onto the stack
        }
        else if (ch == ')')
        {
            while (!isEmpty(&s) && peek(&s) != '(')
            {
                postfix[j++] = pop(&s); // Pop until '(' is found
            }
            pop(&s); // Pop '(' from the stack
        }
        else if (isOperator(ch))
        {
            while (!isEmpty(&s) && precedence(peek(&s)) >= precedence(ch))
            {
                postfix[j++] = pop(&s); // Pop higher or equal precedence operators
            }
            push(&s, ch); // Push the current operator onto the stack
        }
    }
    // Pop all remaining operators from the stack
    while (!isEmpty(&s))
    {
        postfix[j++] = pop(&s);
    }
    postfix[j] = '\0'; // Null-terminate the postfix expression
}
int main()
{
    char infix[] = "A*(B+C)/D";
    char postfix[MAX];
    infixToPostfix(infix, postfix);
    printf("Infix Expression: %s\n", infix);
    printf("Postfix Expression: %s\n", postfix);
    return 0;
}
