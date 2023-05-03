#include<stdlib.h>
#include<stdio.h>
struct node{
    int data ;
    struct node *prev;
    struct node *next;
};

struct node * pushtop(struct node* head,int value ){
    struct node *ptr= (struct node *)malloc(sizeof (struct node));    
    ptr->data=value ;
    ptr->prev=NULL;
    ptr->next=head;
    head->prev=ptr;
    return ptr;

};

struct node * pushatindex(struct node* head,int value ,int index){
    struct node *ptr= (struct node *)malloc(sizeof (struct node));    
    struct node *p=head;
    ptr->data=value;
    int i=0;
    while (i!=index-1){
        i++;
        p=p->next;

    }
    ptr->next=p->next;
    ptr->prev=p;
    p->next=ptr;
    return head;
};

struct node * pushatend (struct node * head,int value ){
    struct node * ptr =(struct node *)malloc(sizeof(struct node));
    struct node *p=head;
    ptr->data=value;
    ptr->next=NULL;

    while(p->next!=NULL){
        p=p->next;
    }
    ptr->prev=p;
    p->next=ptr;
    return head;
    
}


void LLtraversal(struct node *ptr){
    while(ptr->next!=NULL){
        printf("Element :%d\n",ptr->data);
        ptr=ptr->next;
    printf("Element :%d\n",ptr->data);
    }
};

int main()
{
    struct node *head;
    struct node* first ;
    struct node * second;
    struct node * third ;
    struct node * fourth;
    struct node * fifth;
    head= (struct node *)malloc(sizeof(struct node));
    first= (struct node *)malloc(sizeof(struct node));
    second= (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth= (struct node *)malloc(sizeof(struct node));
    fifth= (struct node *)malloc(sizeof(struct node));

    head->data=12;//1 
    head->prev=NULL;
    head->next=first;

    first->data=132;//2
    first->prev=head;
    first->next=second;
    
    second->data=12;//3
    second->prev=first;
    second->next=third ;
    
    third ->data=12;//4
    third ->prev=second;
    third ->next=fourth;
    
    fourth->data=12;//5
    fourth ->prev=third ;
    fourth ->next=fifth;
    
    fifth->data=1209;//6
    fifth->prev=fourth;
    fifth->next=NULL;
    printf("elements before push at index\n");

    head=pushtop(head,5);
    head=pushtop(head,1290);
    
    LLtraversal(head);
printf("elements after push at index:\n") ;   
head=pushatindex(head,56,2);
LLtraversal(head);
printf("______ after further pushatindex");
head=pushatindex(head,78,5);
LLtraversal(head);

printf("after using pushatend:\n");
head=pushatend(head,889);
LLtraversal(head);
return 0;
 } 