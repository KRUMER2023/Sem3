#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node* next;
} node;

node* print(node *c)
{
    puts(" ");
    while(c!=NULL)
    {
        printf("Data : %d \n",c->data);
        c=c->next;
    }
    puts(" ");
}

node* createNode(int data)
{
    node* newNode = (node*)malloc(sizeof(node));
    if (!newNode)
    {
        printf("Memory error\n");
        return NULL;
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

void *insertStart(node *head,int ndata)
{
    node *ptr=(struct node *)malloc(sizeof(struct node));
    ptr->data=ndata;
    ptr->next=head;
    head=ptr;
    return head;
}

void *insertEnd(node *head,int ndata)
{
    node *ptr=(node *)malloc(sizeof(node));
    node *p=head;
    while(p->next!=NULL)
    {
        p=p->next;
    }
    ptr->data=ndata;
    p->next=ptr;
    ptr->next=NULL;
    return head;
}

void *InsertAtIndex(node *head,int ndata,int index)
{
    node *ptr=(node *)malloc(sizeof(node));
    node *p=head;

    int i=0;
    while(i!=index-1)// -1 if asssuming index is the gap || -2 if assuming a consecutive index of list
    {
        p=p->next;
        i++;
    }

    ptr->data=ndata;
    ptr->next=p->next;
    p->next=ptr;

    return head;

}

void *DelBegin(node *head)
{
    node *ptr=head;
    head=head->next;
    free(ptr);
    return head;

}

void *DelEnd(node *head)
{
    node *ptr=head;
    node *p;
    while(ptr->next!=NULL)
    {
        p=ptr;
        ptr=ptr->next;
    }
    p->next=NULL;
    free(ptr);
    return head;

}

void *DelIndex(node *head,int index)
{
    node *p=head;
    node *q;
    int i=0;
    while(i!=index-1)// -1 if asssuming postion
    {
        p=p->next;
        i++;
    }
    q=p;
    p=p->next;
    q->next=p->next;
    free(p);
    return head;
}

void reverse(node** head)
{

    node* prev=NULL;
    node* current=*head;
    node* next =NULL;
    while(current !=NULL)
    {
        next=current->next;
        current->next=prev;
        prev=current;
        current=next;
    }
    *head=prev;

}

void search(node* head, int key) {
    node* ptr = head;
    int i=0;
    printf("Searching: %d\n",key);
    while (ptr->next!= NULL)
    {
        if (ptr->data == key) {
            printf("Key found at index : %d\n",i);
            return;
        }
        ptr = ptr->next;
        i++;
    }
    printf("Key not found...\n");
    return;
}

void main()
{
    struct node *head=createNode(20);
    struct node *first=createNode(60);
    struct node *second=createNode(80);
    struct node *third=createNode(100);

    head->next=first;
    first->next=second;
    second->next=third;
    third->next=NULL;
    puts("Elements in the list:");
    print(head);

    printf("Inserting %d at first:",10);
    head=insertStart(head,10);
    print(head);

    printf("Inserting %d at end:",120);
    head=insertEnd(head,120);
    print(head);

    printf("Inserting %d at index %d:",30,2);
    head=InsertAtIndex(head,30,2);
    print(head);

    puts("Deletion at first:");
    head=DelBegin(head);
    print(head);

    puts("Deletion at end:");
    head=DelEnd(head);
    print(head);

    printf("Deletion at index %d:\n",2);
    head=DelIndex(head,2);
    print(head);

    int key=80;
    search(head,key);

    reverse(&head);
    print(head);
}
