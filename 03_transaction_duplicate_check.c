#include <stdio.h>
#include <string.h>

int main(void) {
    char ids[][20] = {"TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004"};
    int n = 5, duplicate = 0;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (strcmp(ids[i], ids[j]) == 0) {
                duplicate = 1;
                break;
            }
        }
        if (duplicate) break;
    }

    printf("%s\n", duplicate ? "true" : "false");
    return 0;
}
