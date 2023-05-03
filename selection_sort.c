#include <stdio.h>
#include <stdlib.h>
#include<time.h>
int count = 0;
void printArray(int *A, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", A[i]);
    }
    printf("\n ");
}
void SelectionSort(int *array, int size)
{
    int minindex;
    int temp;
    for (int i = 0; i < size; i++)
    {
        minindex = i;

        for (int j = i + 1; j < size; j++)
        {
            if (array[j] < array[minindex])
            {
                minindex = j;
            }
            count++;
        }
        temp = array[i];
        array[i] = array[minindex];
        array[minindex] = temp;
        printf("array after pass %d :", i + 1);
        printArray(array, size);
    }
    printf("number of comparisons: %d", count);
}

int main()
{
    srand(time(NULL));
    int n;
    printf("enter the size of the array: \n");
    scanf("%d",&n);
    int array[n];
    for (int i=0;i<n;i++){
    array[i]=rand()%100;
    }
    // int array[] = {1,2,3,45,56,78,90,109,110,112,332};

    printf("array before selection sort :\n");
    printArray(array, n);
    printf("\n");
    printf("now itertions start \n");
    // printArray(array,11);
    SelectionSort(array, n);
    printf("\n");
    printf("array after selection sort :\n");
    printArray(array, n);

    return 0;
}