#include<stdio.h>

int main()
{
    struct chapter
    {
        char name[100];
        int nopages;
        struct chapter *nextchapter;
    };

    struct chapter ch1={"WELCOME YOU",20,NULL};
    struct chapter ch2={"WHAT ARE THINGS",41,NULL};
    struct chapter ch3={"FINAL BYE",87,NULL};

    ch1.nextchapter = &ch2;
    ch2.nextchapter = &ch3;

    struct chapter *c = &ch1;
    while(c != NULL)
    {
        printf("Title: %s \nNo. of pages : %d\n\n",c->name,c->nopages);
        c = c->nextchapter;
    }
    return 0;
}
