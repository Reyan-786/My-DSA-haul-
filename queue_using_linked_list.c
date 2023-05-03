#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
};
struct node*r=NULL;
struct node *f=NULL;
void Enqueue(int value){
    struct node*n=(struct node*)malloc(sizeof(struct node));

    if(n==NULL){
        printf("Queue Overflow....");
    }
    else {
        n->data=value;
        n->next=NULL;
        if(f==NULL){
            f=r=n;
        }
        else {
            r->next=n;
            r=n;
        }
    }
}
void LinkedListTraversal(struct node*ptr){
    while (ptr!=NULL){
        
        printf("%d\n",ptr->data);
        ptr=ptr->next;
    }
}
int dequeue(struct node*q){
    int value =-1;
    struct node *ptr=f;
    if(f==NULL){
        printf("Queue Underflow...");
        return -1;
    }
    else {
            f=f->next;
            value=ptr->data;
            free(ptr);

    }
    return value;

}
int main()
{
    
    Enqueue(23);
    Enqueue(90);
    Enqueue(910);
    Enqueue(190);
    LinkedListTraversal(f);
    dequeue(f);
    LinkedListTraversal(f);
    dequeue(f);
    dequeue(f);
    // dequeue(f);
    LinkedListTraversal(f);
    
return 0;
}