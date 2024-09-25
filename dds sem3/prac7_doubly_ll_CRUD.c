#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

#define CreateN (struct node *)malloc(sizeof(struct node))

void TravF(struct node *c)
{
    while(c!=NULL)
    {
        printf("Data : %d \n",c->data);
        c=c->next;
    }
    puts(" ");
}

void TravR(struct node *c)
{
    while(c->next!=NULL)
    {
        c=c->next;
    }

    while(c!=NULL)
    {
        printf("Data : %d \n",c->data);
        c=c->prev;
    }
    puts(" ");
}
struct node *Beginning(struct node *head,int ndata)
{
    struct node *ptr=(struct node *)malloc(sizeof(struct node));
    ptr->data=ndata;

    head->prev=ptr;

    ptr->next=head;
    ptr->prev=NULL;
    head=ptr;
    return head;

}

struct node *insertEnd(struct node *head,int ndata)
{
    struct node *ptr=(struct node *)malloc(sizeof(struct node));
    struct node *p=head;
    while(p->next!=NULL)
    {
        p=p->next;
    }
    ptr->data=ndata;
    ptr->prev=p;
    p->next=ptr;
    ptr->next=NULL;
    return head;
}

struct node *InsertAtIndex(struct node *head,int ndata,int index)
{
    struct node *ptr=(struct node *)malloc(sizeof(struct node));
    struct node *p=head;
    int i=1;
    while(i!=index-1)
    {
        p=p->next;
        i++;
    }
    ptr->data=ndata;
    ptr->prev=p;
    ptr->next=p->next;
    p->next=ptr;
    ptr->next->prev=ptr;
    return head;
}

struct node *DelBegin(struct node *head)
{
    struct node *ptr=head;
    head=head->next;
    head->prev=NULL;
    free(ptr);
    return head;

}

struct node *DelEnd(struct node *head)
{
    struct node *ptr=head;
    while(ptr->next!=NULL)
    {
        ptr=ptr->next;
    }
    ptr->prev->next = NULL;
    free(ptr);
    return head;

}

struct node *DelIndex(struct node *head,int index)
{
    struct node *p=head;
    int i=0;
    while(i!=index-1)// -1 if asssuming postion
    {
        p=p->next;
        i++;
    }
    p->prev->next=p->next;
    p->next->prev=p->prev;
    free(p);
    return head;
}

int search(struct node* head, int key) {
    struct node* ptr = head;
    int i=1;
    while (ptr->next!= NULL)
    {
        if (ptr->data == key) {
            return i;
        }
        ptr = ptr->next;
        i++;
    }
    return -1;
}

void main()
{
    struct node *head=CreateN;
    struct node *first=CreateN;
    struct node *second=CreateN;
    struct node *third=CreateN;

    head->prev=NULL;
    head->data=10;
    head->next=first;

    first->prev=head;
    first->data=25;
    first->next=second;

    second->prev=first;
    second->data=40;
    second->next=third;

    third->prev=second;
    third->data=50;
    third->next=NULL;

    printf("Original Link List\n");
    TravF(head);

    printf("Reverse Printing Original Link List:\n");
    TravR(head);

    printf("Inserting 45 at Beginning:\n");
    head=Beginning(head,45);
    TravF(head);

    printf("Inserting 65 at End:\n");
    head=insertEnd(head,65);
    TravF(head);

    printf("Inserting 70 at position 3:\n");
    head=InsertAtIndex(head,70,3);
    TravF(head);

    printf("Deletion at Beginning:\n");
    head=DelBegin(head);
    TravF(head);

    printf("Deletion at End:\n");
    head=DelEnd(head);
    TravF(head);

    printf("Deleting node at position 2:\n");
    head=DelIndex(head,2);
    TravF(head);

    printf("searching 25 in the list:\n");
    int result = search(head, 25);
    if (result != -1) {
        printf("Element %d found in the list at position : %d\n\n", 25,result);
    } else {
        printf("Element %d not found in the list....\n", 25);
    }
}
