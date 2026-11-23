#include <stdio.h>

int main(void) {
    int nums[] = {-4, -1, 0, 3, 5, 9};
    int n = 6, target = 4;
    int left = 0, right = n - 1;

    while (left < right) {
        int sum = nums[left] + nums[right];

        if (sum == target) {
            printf("(%d, %d)\n", nums[left], nums[right]);
            return 0;
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }

    printf("Not Found\n");
    return 0;
}
