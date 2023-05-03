#include <stdio.h>
int a[50], t[50], size = 0;
void init_array()
{
    for (int i = 0; i < 50; i++)
    {
        t[i] = 0;
    }
    
}
int hashcode(int key)
{
    return key % 50;
}
void insert(int key,int value)
{
    size++;
    int index = hashcode(key);
    if (t[index] == 0)
    {
        t[index] = 1;
        a[index] = value;
    }
    else if (t[index] == 1)
    {
        while (t[index] != 0)
        {
            index = (index + 1) % 50;
        }
        t[index] = 2;
        a[index] = key;
    }
}

int search(int key)
    {
    int index = hashcode(key);
    if(t[index]==1 && a[index]==key){
        return index;
    }
    else if(t[index]==2 && a[index]!=key){
        while(a[index]!=key){
            index=(index+1)%50;
        }
        return index;
    }
    else {
        return -1;
    }
    }

    void display()
    {
        for (int i = 0; i < 50; i++)
        {
            if (t[i] == 0)
            {
                printf("index %d --\n",i);
            }
            else if (t[i] == 1)
            {
                printf("index %d has element %d\n", i,a[i]);
            }
        }
    }
    int main()
    {
        init_array();
        insert(5);
        insert(15);
        insert(35);
        insert(55);
        insert(56);
        insert(54);
        insert(590);
        display();
        return 0;
    }