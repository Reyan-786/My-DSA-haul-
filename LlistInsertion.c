#include<stdio.h>
#include <stdlib.h>
struct node{
    int data ;
    struct node *next;

};
void LLtraversal(struct node *ptr){
    while(ptr!=NULL){
        printf("Element :%d\n",ptr->data);
        ptr=ptr->next;
    }
};

struct node*insertatB(struct node *head,int data ){
    struct node *ptr=(struct node *)malloc(sizeof(struct node ));
    ptr->data=data;
    ptr->next=head;
    return ptr;
};
struct node *insertatindex(struct node* head,int data,int index){
    struct node * ptr=( struct node *)malloc(sizeof(struct node));
        struct node * p=head;
        int i=0;
    while(i!=index-1){
        p=p->next;
        i++;
    }
    ptr->data=data;
    ptr->next=p->next;
    p->next=ptr;
    return head;


}
struct node * insertatend(struct node *head,int data){
    struct node *ptr=(struct node *)malloc(sizeof(struct node));
    struct node *p= head;
    while(p->next!=NULL){
        p=p->next;

    }
    ptr->data=data;
    ptr->next=NULL;
    p->next=ptr;
    return head;
}

struct node* insertatnode(struct node*head,struct node *prevnode,int data){
    struct node *ptr=(struct node *)malloc(sizeof(struct node));
    struct node*p=head;
    ptr->data=data; 
    ptr->next=prevnode->next;
    prevnode->next=ptr;
   return head;
    

}
int main()
 { 

    struct node*head;
    struct node*first   ;
    struct node*second;
    struct node*third ;
    struct node *fourth;


    head=  (struct node  *) malloc(sizeof(struct node));
    first=  (struct node *) malloc(sizeof(struct node));
    second=  (struct node *) malloc(sizeof(struct node));
    third =  (struct node *) malloc(sizeof(struct node));
    fourth =  (struct node *) malloc(sizeof(struct node));


    head-> data=7;
    head-> next=first;
    first-> data=11;
    first-> next=second ;
    second-> data=15;
    second-> next=third;
    third -> data=19;
    third-> next=fourth;
    fourth->data=23;
    fourth->next=NULL;
    printf("enter a number from 1 to 3 for the following operations.\n");
    printf("---------------------------------------------------------------\n");
    printf("1) at the beggining\n 2) at the end\n3) at a given index\n");
    int i;
    scanf("%d",&i);
    switch(i){
        case 1:
            printf("enter the number you would like to insert at the beggining.\n");
            int number1 ;
            scanf("%d",&number1);
            head=insertatB(head,number1);
            LLtraversal(head);
            break;
        case 2:
            printf("enter the number you would like to insert at the end.\n");
            int number2;
            scanf("%d",&number2);
            head=insertatend(head,number2);
            LLtraversal(head);
            break;
        case 3 :
            printf("enter the number you would like to insert at the given node and at which index.\n");
            int number3;
            scanf("%d",&number3);
            int index;
            scanf("%d",&index);
            head=insertatindex(head,number3,index);
            LLtraversal(head);
            break;
    }
 
return 0;
 } 