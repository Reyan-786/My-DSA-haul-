#include<stdio.h>
#include<stdlib.h>

struct queue{
    int size ;
    int f;
    int b;
    int *arr;
};
int isFull(struct queue*q){
    if(q->b==q->size-1){
        return 1;
    }
    else{
        return 0;
    }
}
int isEmpty(struct queue* q){
    if(q->f==q->b){
        return 1;
    }
    else {
        return 0;
    }
}

void enqueue(struct queue *q,int value){
    if(isFull(q)){
        printf("queue overflow->->->,cannot enque the element->");
    }
    else {
        q->b++;
        q->arr[q->b]=value;
    }
}
int dequeue(struct queue*q){
    int a=-1;
    if(isEmpty(q)){
        printf("queue underflow->->->,cannot dequeue the queue->");
    }
    else {
        q->f++;
        a =q->arr[q->f];
    }
        return a;

}
int main()
{
    struct queue *q=(struct queue*)malloc(sizeof(struct queue));
    q->size=11;
    q->f=-1;
    q->b=-1;

    q->arr=(int*)malloc(q->size*sizeof(int));
    enqueue(q,112);
    enqueue(q,101);
    printf("element enqued is %d ",q->arr[1]);
    if(isEmpty(q)){
        printf("queue is empty\n");
    }
    else {
        printf("queue is not empty\n");

    }
    dequeue(q);
    dequeue(q);
    printf("after deque\n");
    if(isEmpty(q)){
        printf("the que is now empty\n");
    }
    else {
        printf("the que is not empty\n");
    }
    return 0;
}