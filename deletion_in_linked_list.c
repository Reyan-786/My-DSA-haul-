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
    
}
struct node * delatend(struct node *head){
    struct node *ptr,*ptr1;  
        if(head == NULL)  
        {  
            printf("\nlist is empty");  
        }  
        else if(head -> next == NULL)  
        {  
            head = NULL;  
            free(head);  
            printf("\nOnly node of the list deleted ...");  
        }  
              
        else  
        {  
            ptr = head;   
            while(ptr->next != NULL)  
                {  
                    ptr1 = ptr;  
                    ptr = ptr ->next;  
                }  
                ptr1->next = NULL;  
                free(ptr);  
                return head;
                printf("\n Deleted Node from the last ...");  
            }     
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
    struct node *head=  (struct node  *) malloc(sizeof(struct node));
    struct node *first=  (struct node *) malloc(sizeof(struct node));
    struct  node*second=  (struct node *) malloc(sizeof(struct node));
    struct  node*third =  (struct node *) malloc(sizeof(struct node));
    struct  node*fourth =  (struct node *) malloc(sizeof(struct node));
    struct  node*fifth =  (struct node *) malloc(sizeof(struct node));
    struct  node*sixth =  (struct node *) malloc(sizeof(struct node));
    struct  node*seven=  (struct node *) malloc(sizeof(struct node));
    




    head-> data=7;
    head-> next=first;
    first-> data=11;
    first-> next=second ;
    second-> data=15;
    second-> next=third;
    third -> data=19;
    third-> next=fourth;
    fourth->data=23;
    fourth->next=fifth;
    fifth->data=41;
    fifth->next=sixth;
    sixth->data=67;
    sixth->next=seven;
    seven->data=90;
    seven->next=NULL;

   LLtraversal(head);
    printf("enter a number from 1 to 3 for the following operations.\n");
    printf("---------------------------------------------------------------\n");
    printf("1) at the beggining\n 2) at the end\n3) delete a value\n");
    int i;
    scanf("%d",&i);
    switch(i){
        case 1:
            head=delatfirst(head);
            printf("after deleting the element from the starting...\n");
            LLtraversal(head);
            break;
        case 2:
            head=delatend(head);
            printf("after deleting the element from the end of the linked list .....\n");
            LLtraversal(head);
            break;
        case 3 :
            printf("enter the number you would like to delete from the linked list.\n");
            int number3;
            scanf("%d",&number3);
            head=delavalue(head,number3);
            LLtraversal(head);
            break;
    }

    
return 0;
 } 