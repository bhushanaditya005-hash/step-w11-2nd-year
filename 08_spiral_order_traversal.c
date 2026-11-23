#include <stdio.h>

int main(void) {
    int grid[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int top = 0, bottom = 2, left = 0, right = 2;

    while (top <= bottom && left <= right) {
        for (int i = left; i <= right; i++)
            printf("%d ", grid[top][i]);
        top++;

        for (int i = top; i <= bottom; i++)
            printf("%d ", grid[i][right]);
        right--;

        if (top <= bottom) {
            for (int i = right; i >= left; i--)
                printf("%d ", grid[bottom][i]);
            bottom--;
        }

        if (left <= right) {
            for (int i = bottom; i >= top; i--)
                printf("%d ", grid[i][left]);
            left++;
        }
    }

    printf("\n");
    return 0;
}
