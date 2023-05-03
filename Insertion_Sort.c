#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void printArray(int *A, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", A[i]);
    }
    printf("\n ");
}
void Insertionsort(int *array, int size)
{

    int count = 0;
    int j;
    int key;
    for (int i = 1; i < size; i++)
    {
        key = array[i];
        j = i - 1;
        while (j >= 0 && array[j] > key)
        {
            array[j + 1] = array[j];
            j--;
            count++;
        }
        array[j + 1] = key;
        printf("array after pass %d: ", i);
        printArray(array, size);
    }

    printf("\n");
    printf("number of comparisons: %d", count);
}
int main()
{
    int n;
    printf("enter the size of the array: \n");
    scanf("%d", &n);
    int array[n];
    srand(time(NULL));
    for (int i = 0; i < n; i++)
    {
        array[i] = rand() % 100;
    }

    printf("array before insertion sort\n");
    printf("\n");
    printArray(array, n);
    printf("\n");
    printf("now insertion sort begins :\n");
    printf("\n");
    Insertionsort(array, n);
    printf("\n");
    printf("after insertion sort :\n");
    printArray(array, n);

    return 0;
}