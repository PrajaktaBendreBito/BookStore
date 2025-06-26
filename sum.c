#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr;
    int n, i, sum = 0;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    arr = malloc(n * sizeof(int));

    for (i = 0; i <= n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", arr + i);
        sum += arr[i];
    }

    printf("Sum is: %d\n", sum);

    free(arr);

    return 0;
}
