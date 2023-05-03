#include<stdlib.h>
#include<stdio.h>
struct stack{// stack is being implemented using array.
    int top;
    char *arr;
    int size;
    };

int isFull(struct stack *ptr)
{
    if (ptr->top == ptr->size - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
 

int isEmpty(struct stack *ptr)
{
    if (ptr->top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
void push(struct stack * sp, char ch){
    if (isFull(sp)){
        printf("stack overflow...");

    }
    else {
        sp->top++;
        sp->arr[sp->top]=ch;
    }
}
char  pop(struct stack *s){
    if(isEmpty(s)){
        printf("Stack Underflow...");
        return -1;
    }
    else {
        char cha=s->arr[s->top];
        s->top--;
        return cha;
        
    }
}
int paranthesismatching(char *exp){
    struct stack * sp;
    sp->size=1000;
    sp->top=-1;
    sp->arr=(char*)malloc(sp->size*sizeof(char));
    for(int i=0;exp[i]!='\0';i++){
        if(exp[i]=='('){
            push(sp,'(');
        }
        else if (exp[i]==')'){
            if (isEmpty(sp)){
                return 0;
            }
            pop(sp);

        }
        
    }
    if (isEmpty(sp)){
        return 1;
    }
    else {
        return 0;
    }
}
int main(){
char * exp = "((8)(*--$$9))";    
if(paranthesismatching(exp)){
        printf("parenthesis are matched.");
    }
    else{
        printf("parenthesis are not matching.");
    }
    return 0;
}