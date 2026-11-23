#include <stdio.h>

int main(void) {
    int nums[] = {2, 7, 11, 15};
    int n = 4, target = 9, found = 0;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (nums[i] + nums[j] == target) {
                found = 1;
                break;
            }
        }
        if (found) break;
    }

    printf("%s\n", found ? "true" : "false");
    return 0;
}
