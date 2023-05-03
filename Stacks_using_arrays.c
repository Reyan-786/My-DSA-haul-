#include<stdlib.h>
#include<stdio.h>
struct stack{
    int top;
    int size;
    int * arr;
};// created a structure of stack.using size and top and a pointer for the array.
int IsEmpty(struct stack*s){
    if (s->top==-1){
        // printf("Stack Underflow,Stack is Empty");
        return 1;
    }
    else {
        // printf("Stack is not empty");
        return 0;
    }
}
int IsFull(struct stack*s){
    if(s->top==s->size-1){
        // printf("Stack Overflow,Stcak is already full...");
        return 1;
    }
    else {
        // printf("Stack is not full...");
        return 0;
    }
}
void push(struct stack *s ,int value ){
    if (IsFull(s)){
        printf("Stack Overflow, stack is already full....");
    }
    else {
        s->top++;
        s->arr[s->top]=value;
    }
}

int  pop(struct stack *s){
 int val;

    if(IsEmpty(s)){
        printf("Stack Underflow,Stack is already empty...");
 }
 else {
    val = s->arr[s->top];
    s->top--;
    return val;
    
    
    
 }
}

// int peek(struct stack *s,int index){
//     int arrayInd=s->top-index+1;
//     if (arrayInd<0){
//         return -1;

//     }
//     else {
//         return s->arr[arrayInd];
//     }
//     // return s->arr[index];
// }

int peek(struct stack* sp, int i){
    int arrayInd = sp->top -i + 1;
    if(arrayInd < 0){
        printf("Not a valid position for the stack\n");
        return -1;
    }
    else{
        return sp->arr[arrayInd];
    }
}
int StackTop(struct stack *s){
    return s->arr[s->top];
}
int StackBottom(struct stack *s){
    return s->arr[0];
}

int main()
 {  
    struct stack *s1;
    s1->top=-1;
    s1->size=50;
    s1->arr=(int *)malloc(s1->size*sizeof(int));
    push(s1,9);
    push(s1,91);
    push(s1,92);
    push(s1,90);
    push(s1,92);
    push(s1,89);
    // push(s1,91);
    // pop(s1);
    // pop(s1);
    // pop(s1);
    // pop(s1);

// printf("%d",peek(s1,3));

    // printf("%d",s1->arr[s1->top]);
    // peek(s1,3);
    // for (int j = 1; j <= s1->top + 1; j++)// peek not working in a for loop.
    // {
    //     printf("The value at position %d is %d\n", j, peek(s1, j));
    // }
    printf("%d\n",StackBottom(s1));
    printf("%d\n",StackTop(s1));

    // printf("%d",s1->arr[1]);
    // s1->top++;
    // printf("%d",IsFull(s1));
return 0;
 } 