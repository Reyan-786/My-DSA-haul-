#include <stdio.h>

void printArray(int *A, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", A[i]);
    }
}
int count = 0;
void BubbleSort(int *A, int n)
{
    for (int i = 0; i < n - 1; i++)
    { // for number of pass
        for (int j = 0; j < n - i - 1; j++)
        { // for number of comparisons.
            if (A[j] > A[j + 1])
            {
                count++;
                int temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
            }
        }
    }
    if (count == 0)
    {
        printf("The array is already sorted,no need to apply bubble sort \n");
    }
    else
    {
        printf("it took %d comparisons to bubble sort the entire array \n", count);
    }
}
void BubbleSortAdaptive(int *A, int n)
{
    int isSorted = 0;
    for (int i = 0; i < n - 1; i++)
    { // for number of pass
        isSorted = 1;
        printf("working on pass %d\n", i + 1);
        for (int j = 0; j < n - i - 1; j++)
        { // for number of comparisons.
            if (A[j] > A[j + 1])
            {
                count++;
                int temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
                isSorted = 0;
            }
        }
        if (isSorted)
        {
            return;
        }
    }
}
int main()
{
    int A[] = {14, 2, 33, 44, 25, 26, 7, 8, 9, 120, 11};
    BubbleSort(A, 11);
    BubbleSortAdaptive(A, 11);
    printArray(A, 11);

    return 0;
}
