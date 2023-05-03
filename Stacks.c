#include<stdlib.h>
#include<stdio.h>
struct stack{
    int top;
    int size;
    int *arr;

};

int main()
 {  
     struct stack* a= (struct stack*)malloc(sizeof(struct stack));
     int array={1,2,3,4,5};
     a->top=4;
     a->size= 5;
     a->arr=&array;

    printf("%d",*a->arr);
return 0;
 } 