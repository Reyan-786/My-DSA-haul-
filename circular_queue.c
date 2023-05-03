#include<stdio.h>
#include <stdlib.h>
struct queue{
    int size ;
    int f;
    int b;
    int *arr ;
};
int isFull(struct queue*q){
    if((q->b+1)%(q->size)==q->f){
           return 1;
        }
    else {
        return 0;
    }
}
void circularenqueue(struct queue *q, int value){
    if(isFull(q)){
        printf("queue is already full>>");
    }
    else {
        q->b=(q->b+1)%(q->size);
        q->arr[q->b]=value;
        
    }
}
int isEmpty(struct queue*q){
    if(q->f==q->b){
        return 1;
    }
    else {
        return 0;
    }
}
int dequeue(struct queue*q){
    int a=-1;
    if(isEmpty(q)){
        printf("queue is empty");
    }
    else{
       a=q->arr[q->f];
       q->f=(q->f+1)%q->size;
       printf("successfully dequed %d",a);
    }
    return a;
}
void display(struct queue *q,int numberofvalues){
    for(int i=0;i<numberofvalues;i++){
        printf("element at the %d th position is %d\n",i,q->arr[i]);
    }
}
int main()
{
    struct queue *q=(struct queue*)malloc(sizeof(struct queue));
    q->f=0;
    q->b=0;
    q->size=100;
    q->arr=(int*)malloc(q->size *sizeof(int));
    circularenqueue(q,52);
    circularenqueue(q,23);
    circularenqueue(q,523);
    circularenqueue(q,521);
    display(q,4);
   
return 0;
}
 