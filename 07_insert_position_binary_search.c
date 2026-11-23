#include <stdio.h>

int main(void) {
    int nums[] = {1, 3, 5, 6};
    int n = 4, target = 2;
    int low = 0, high = n - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            printf("%d\n", mid);
            return 0;
        } else if (nums[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    printf("%d\n", low);
    return 0;
}
