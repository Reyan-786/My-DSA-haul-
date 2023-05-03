#include<stdio.h>
#include<stdlib.h>
struct DEqueue{
    int size ;
    int f;
    int r;
    int *array;
};
int isFull(struct DEqueue*q){
    if(q->r==q->size-1){
        return 1;
    }
    else {
        return 0;
    }
}
int isEmpty(struct DEqueue*q){
    if(q->f==q->r){
        return 1;
    }
    else {
        return 0;
    }
}
void EnqueueR(struct DEqueue *q,int value){
    if(isFull(q)){
        printf("the queue has no space to insert the given value...\n");
        
    }
    else {
        q->r++;
        q->array[q->r]=value;
        printf("succesfully enqueued the element %d in the DEqueue\n",value);
    }
}
void EnqueueF(struct DEqueue*q,int value){
    if(isFull(q)|| q->f==-1){
        printf("can't insert the element as the queue has no space...\n");
        
    }
    else {
        q->f--;
        q->array[q->f]=value;
        printf("Succesfully inserted the number %d at the front of the queue\n",value);
    }
}
int  DequeueF(struct DEqueue*q){
    
    if(isEmpty(q)){
        printf("the queue is already empty");
        return -1;
    }
    else {
        q->f++;
        int a=q->array[q->f];
        return a;
    }
}

int DequeueR(struct DEqueue*q){
    
    if(isEmpty(q)){
        printf("the queue is already empty...");
        return -1;
    }
    else {
        int a=q->array[q->r];
        q->r--;
        return a;
    }
}
void display(struct DEqueue *q,int sizeofqueue){
    int i=0;
    while(i<=(q->r))
    {
        printf("Element:%d\n",q->array[i]);
        i++;
    }
}
int main(){
    struct DEqueue*q=(struct DEqueue*)malloc(sizeof(struct DEqueue));
    q->size=10;
    q->f=q->r=-1;;
    q->array=(int*)malloc(q->size*sizeof(int));
    EnqueueR(q,10);
    EnqueueR(q,210);
    EnqueueR(q,310);
    EnqueueR(q,110);
    // EnqueueF(q,1022);
    // EnqueueF(q,1901);
    DequeueF(q);
    DequeueF(q);
    DequeueF(q);
    DequeueF(q);

    EnqueueF(q,1910);
    EnqueueF(q,1102);
    EnqueueF(q,109);
    display(q,4);
    return 0;
}