#include <stdio.h>

int main(void) {
    int prices[] = {7, 1, 5, 3, 6, 4};
    int n = 6, minPrice = prices[0], maxProfit = 0;

    for (int i = 1; i < n; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i];
        }

        if (prices[i] - minPrice > maxProfit) {
            maxProfit = prices[i] - minPrice;
        }
    }

    printf("Maximum profit = %d\n", maxProfit);
    return 0;
}
