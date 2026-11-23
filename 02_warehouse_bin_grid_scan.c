#include <stdio.h>

int main(void) {
    int grid[3][3] = {{4, 9, 2}, {7, 1, 6}, {3, 12, 5}};
    int total = 0, max = grid[0][0], maxRow = 0, maxCol = 0;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            total += grid[i][j];

            if (grid[i][j] > max) {
                max = grid[i][j];
                maxRow = i;
                maxCol = j;
            }
        }
    }

    printf("Total = %d\n", total);
    printf("Maximum coordinate = (%d, %d)\n", maxRow, maxCol);
    return 0;
}
