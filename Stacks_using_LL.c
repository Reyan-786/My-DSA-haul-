#include<stdlib.h>
#include<stdio.h>
struct node{
    // int node *prev; doubly linked list 
    int data;
    struct node *next;//self referencing node .
};
struct node *top=NULL;
int head;
void linkedlisttraversal (struct node * ptr){//working well.
    while(ptr!=NULL){
        printf("element:%d\n",ptr->data);
        ptr=ptr->next;
    }
    printf("element:%d\n",ptr->data);
}

int IsFull(struct node* ptr){//working fine .
    struct node *p=(struct node *)malloc(sizeof(struct node));
    if(p==NULL){
        return 1;
    }
    else {
        return 0;
    }
}

int IsEmpty(struct node *ptr){//working fine .
    if (ptr==NULL){
        return 1;
    }
    else {
        return 0;
    }
}

struct node * push(struct node *ptr,int value){//working fine .
    if(IsFull(ptr)){
        printf("Stack Overflow....");
    }
    else {
        struct node *n=(struct node *)malloc(sizeof(struct node));
        n->data=value;
        // head=n->data;
        n->next=ptr;
        ptr=n;
        return ptr;
    }
}
int pop(struct node * tp){
    if(IsEmpty(tp)){
        printf("Stack Underflow...");
    }
    else {
        struct node * n=tp;
        int x =n->data;
        top=(tp)->next;
        free(n);
        // return x;
     }
}

int StackTop(struct node *ptr){
   return ptr->data;
}  
int stackbottom(struct node *ptr,int numberofpushes){
    int i=0;
     for (i=0;i!=numberofpushes-1;i++){
        ptr=ptr->next;
        
    }
    return ptr->data;
    
}
int peek(int pos){
    // int i=0;
    struct node * ptr=top;
    for (int i=0;(i<pos-1 && ptr!=NULL);i++){
        ptr=ptr->next;
    }
    if (ptr!=NULL){
        return ptr->data;
    }
    else {
        return -1;
    }
}


int main()
{
    // printf("before poping operation\n");
    top=push(top,1000);
    top=push(top,9);
    top=push(top,9009);
    top=push(top,10);

    // int ele=peek(1);
    int stackb=stackbottom(top,4);
    printf("%d",stackb);

    // printf("element at the requested index is :%d",ele);
    // printf("Stack Top:%d\n",StackTop(top));
    // printf("Stack Bottom:%d\n",stackbottom(top));
// linkedlisttraversal(top);

// linkedlisttraversal(s);
    // linkedlisttraversal(top);
    // printf("after popping :\n");
    // pop(top);
    // pop(top);

    // pop(top);
    // int stacktop=StackTop(top);
    // printf("stack top:%d\n",stacktop);
    // int Stackbottom=stackbottom(*top);
    // printf("elemet at the bottom of the stack is :%d",Stackbottom);
    // linkedlisttraversal(top);

  
return 0;
} 