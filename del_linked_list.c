#include<stdlib.h>
#include<stdio.h>
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

struct node * delatfirst(struct node *head){
    struct node * p=head;
    head=head->next;
    free(p);
return head;

}

struct node * delatindex(struct node* head,int index){
    struct node *ptr= (struct node *)malloc(sizeof(struct node));
    struct node * p=head;
    int i=0;
    while (i!=index-1){
        p=p->next;
        i++;
    }
    ptr=p->next;
    p->next=ptr->next;
    free(ptr);
    return head;
}
struct node * delatend(struct node *head){
    struct node * ptr=head;
    struct node *p=head->next;
    while(p->next!=NULL){
        ptr=ptr->next;
        p=p->next;

    }
    ptr=p->next;
    ptr->next=p->next;
    free(p);
    return head;    
}

struct node * delavalue(struct node *head,int value){
    struct node *ptr=head;
    struct node*p=head->next;
    while (p->data!=value && p->next!=NULL){
        p=p->next;
        ptr=ptr->next;


    }
    if (p->data==value){
        // ptr0-=p->next;
        ptr->next=p->next;
        free(p);
        return head;
    }

}
int main()
 { 
    struct node*head;
    struct node*first;
    struct node*second;
    struct node*third;
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

    // head=delatfirst(head);
    // LLtraversal(head);
    // printf("__________________________");
    // head=delatfirst(head);
    // LLtraversal(head);
    // head=delatindex(head,2);
    // LLtraversal(head);
    // printf("_____________________________________________________________\n");
    // head=delatindex(head,3);
    // LLtraversal(head);
    // printf("_____________________________________________________________\n");

    // head=delatindex(head,2);
    // LLtraversal(head);
    // printf("_____________________________________________________________\n");

    head=delavalue(head,11);
    LLtraversal(head);
printf("_____________________________________________________________________________");
    head=delavalue(head,15);
    LLtraversal(head);
    // head
    // printf("\n");
    // head=delatend(head);
    // LLtraversal(head);
return 0;
 } 