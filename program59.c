#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
    struct Node *prev;
};

typedef struct Node NODE;
typedef struct Node * PNODE;
typedef struct Node ** PPNODE;

void InsertLast(PPNODE Head, PPNODE Tail, int value)
{
    PNODE newn = NULL;
    
    newn = (PNODE)malloc(sizeof(NODE));
    
    newn->data = value;
    newn->next = NULL;
    newn->prev = NULL;
    
    if((*Head ==NULL) && (*Tail == NULL))       // Linked list is empty
    {
        *Head = newn;
        *Tail = newn;
    }
    else            // Linked list contains atleast one node
    {
        (*Tail)->next = newn;
        newn->prev = *Tail;
        *Tail = (*Tail) ->next;   //  *Tail = newn;
    }
    (*Tail)->next = *Head;
    (*Head)->prev = *Tail;
}

void InsertFirst(PPNODE Head, PPNODE Tail, int value)
{
    PNODE newn = NULL;
    
    newn = (PNODE)malloc(sizeof(NODE));
    
    newn->data = value;
    newn->next = NULL;
    newn->prev = NULL;
    
    if((*Head ==NULL) && (*Tail == NULL))       // Linked list is empty
    {
        *Head = newn;
        *Tail = newn;
    }
    else            // Linked list contains atleast one node
    {
        newn->next = *Head;
        (*Head)->prev = newn;
        *Head = (*Head)->prev;
    }
    (*Tail)->next = *Head;
    (*Head)->prev = *Tail;
}

int main()
{
    PNODE First = NULL;
    PNODE Last = NULL;          // Nawin
    int no = 0;
    
    printf("Enter number : ");
    scanf("%d",&no);
    InsertFirst(&First,&Last,no);
    
    
    return 0;
}

