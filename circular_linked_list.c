#include<stdlib.h>
#include <stdio.h>
struct node{
    int data ;
    struct node* next;
};
void cltraversal(struct node * ptr){
        struct node *ptr->next=first;
        while (ptr->next!=head){

            printf('%d\n',ptr->data);
            ptr=ptr->next;
        }
}

#include<stdio.h>
int main()
{ 
    struct node *head;
    struct node *first;
    struct node *second;
    struct node *third ;
    struct node *fourth;
    // struct node *fifth  ;
    // struct node *sixth; 

     head= (struct node *)malloc(sizeof (struct node ));
     first= (struct node *)malloc(sizeof (struct node ));
     second = (struct node *)malloc(sizeof (struct node ));
     third = (struct node *)malloc(sizeof (struct node ));
     fourth= (struct node *)malloc(sizeof (struct node ));
    //  fifth = (struct node *)malloc(sizeof (struct node ));
    
    head->data = 1;
    head->next=first;
    first->data=2;
    first ->next=second ;
    second->data =3;
    second ->next= third ;
    third ->data =4;
    third->next=fourth ;
    fourth->data =12;
    fourth ->next=head;

    


    
return 0;
} 
