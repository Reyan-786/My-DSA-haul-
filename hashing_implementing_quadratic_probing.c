#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

#define SIZE 20
int s = 0;
struct DataItem
{
    int data;
    int key;
};

struct DataItem *hashArray[SIZE];
struct DataItem *dummyItem;
struct DataItem *item;

int hashCode(int key)
{
    return key % SIZE;
}

struct DataItem *search(int key)
{
    // get the hash
    int hashIndex = hashCode(key);

    //    move in array until an empty cell is captured
    while (hashArray[hashIndex] != NULL)
    {

        if (hashArray[hashIndex]->key == key)
        {
            return hashArray[hashIndex];
        }

        // else go to next cell
        else
        {
            ++hashIndex;
        }

        // circular increment
        hashIndex %= SIZE;
    }

    return NULL;
}
int i = 1;
void insert(int key, int data)
{

    struct DataItem *item = (struct DataItem *)malloc(sizeof(struct DataItem));
    item->data = data;
    item->key = key;

    // get the hash
    int hashIndex = hashCode(key);

    // move in array until an empty or deleted cell is encountered
    while (hashArray[hashIndex] != NULL && hashArray[hashIndex]->key != -1)
    {
        // go to next cell
        hashIndex = (hashIndex + (i ^ 2)) % SIZE;
        i++;
        // wrap around the table
    }

    hashArray[hashIndex] = item;
}

struct DataItem *delete (struct DataItem *item)
{
    int key = item->key;

    // get the hash
    int hashIndex = hashCode(key);

    // move in array until an empty
    while (hashArray[hashIndex] != NULL)
    {

        if (hashArray[hashIndex]->key == key)
        {
            struct DataItem *temp = hashArray[hashIndex];

            // assign a dummy item at deleted position
            hashArray[hashIndex] = NULL;
            return temp;
        }

        // go to next cell
        ++hashIndex;
        // wrap around the table
          hashIndex %= SIZE;
    }

    return NULL;
}

void display()
{
    int i = 0;

    for (i = 0; i < SIZE; i++)
    {

        if (hashArray[i] != NULL)
            printf(" (%d,%d)", hashArray[i]->key, hashArray[i]->data);
        else
            printf(" ~~ ");
    }

    printf("\n");
}

int main()
{
    dummyItem = (struct DataItem *)malloc(sizeof(struct DataItem));
    dummyItem->data = -1;
    dummyItem->key = -1;

    insert(1, 20);
    insert(2, 70);
    insert(42, 80);
    insert(4, 25);
    insert(12, 44);
    insert(14, 32);
    insert(17, 11);
    insert(13, 78);
    insert(37, 97);
    insert(10, 23);
    insert(101, 2223);
    insert(104, 223);
    insert(103, 2343);

    display();
    item = search(42);

    if (item != NULL)
    {
        printf("Element found: %d\n", item->data);
    }
    else
    {
        printf("Element not found\n");
    }

    delete (item);
    item = search(42);
    if (item != NULL)
    {
        printf("Element found: %d\n", item->data);
    }
    else
    {
        printf("Element not found\n");
    }
    display();
}