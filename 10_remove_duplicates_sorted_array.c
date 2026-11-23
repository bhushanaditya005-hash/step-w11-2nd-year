#include <stdio.h>

int main(void) {
    int nums[] = {1, 1, 2, 2, 2, 3, 4, 4, 5};
    int n = 9, j = 0;

    for (int i = 1; i < n; i++) {
        if (nums[i] != nums[j]) {
            j++;
            nums[j] = nums[i];
        }
    }

    printf("Length = %d\n", j + 1);
    printf("Unique elements: ");
    for (int i = 0; i <= j; i++) {
        printf("%d ", nums[i]);
    }
    printf("\n");

    return 0;
}
