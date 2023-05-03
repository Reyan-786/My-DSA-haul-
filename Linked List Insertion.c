#include<stdlib.h>
#include<stdio.h>
struct node{
    int data ;
    struct node * next;

};
void LLtraversal(struct node *ptr){
    while (ptr!=NULL){
        printf("%d\n",ptr->data);
        ptr=ptr->next;
    }
}
int main()
 { 
    struct node*head;
    struct node*first;
    struct node*second;
    struct node*third;
    struct node*fourth;
head=(struct node*)malloc(sizeof(struct node));
first=(struct node*)malloc(sizeof(struct node));
second=(struct node*)malloc(sizeof(struct node));
third =(struct node*)malloc(sizeof(struct node));
fourth=(struct node*)malloc(sizeof(struct node));


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

 LLtraversal(head)   ;
return 0;
 } 