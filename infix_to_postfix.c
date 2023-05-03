#include <stdlib.h>
#include <stdio.h>
#include <string.h>
struct stack
{
    int size;
    int top;
    char *arr;
};

int stackTop(struct stack *sp)
{
    return sp->arr[sp->top];
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

void push(struct stack *ptr, char val)
{
    if (isFull(ptr))
    {
        printf("Stack Overflow! Cannot push %d to the stack\n", val);
    }
    else
    {
        ptr->top++;
        ptr->arr[ptr->top] = val;
    }
}

char pop(struct stack *ptr)
{
    if (isEmpty(ptr))
    {
        printf("Stack Underflow! Cannot pop from the stack\n");
        return -1;
    }
    else
    {
        char val = ptr->arr[ptr->top];
        ptr->top--;
        return val;
    }
}
int prec(char ch)
{
    if (ch == '*' || ch == '/')
        return 3;
    else if (ch == '+' || ch == '-')
        return 2;
    else
        return 0;
}

int isOperator(char ch)
{
    if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
        return 1;
    else
        return 0;
}
char *infixtopostfix(char *infix)
{                                                                    // taking infix array as an input
    struct stack *sp = (struct stack *)malloc(sizeof(struct stack)); // dynamically allocating the memory
    sp->size = 100;
    sp->top = -1;
    sp->arr = (char *)malloc((sp->size * sizeof(char)));
    char *postfix = (char *)malloc((strlen(infix) + 1) * sizeof(char));
    int i = 0;
    int j = 0;
    while (infix[i] != '\0')
    { // keep running until the end of line character is encountered .
        if (!isOperator(infix[i]))
        {
            postfix[j] = infix[i];
            i++; // checks if the element is an operator or not .
            j++;
        }
        else
        {
            if (prec(infix[i]) > prec(stackTop(sp)))
            { // checks the precedence of the character  and pushes it into the bin stack if precedence of the stack top is lower than infix element at the ith index .
                push(sp, infix[i]);
                i++;
            }
            else
            {
                postfix[j] = pop(sp);
                j++;
            }
        }
    }
    while (!isEmpty(sp))
    {
        postfix[j] = pop(sp);
        j++;
    }

    postfix[j] = '\0';
    return postfix;
}
int main()
{
    printf("enter the expression you would like to convert from infix to postfix: \n");
    char *expression;
    scanf("%s", expression);

    printf("the expression after converting into postfix is %s", infixtopostfix(expression));

    return 0;
}