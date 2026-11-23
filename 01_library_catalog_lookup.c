#include <stdio.h>
#include <string.h>

struct Book {
    char isbn[20];
    char title[100];
};

int main(void) {
    struct Book catalog[] = {
        {"0001112223", "Introduction to Algebra"},
        {"0002223334", "Beginning Python"},
        {"0003334445", "Classic Mythology"},
        {"0004445556", "Data and Society"},
        {"0005556667", "European History"}
    };

    int low = 0, high = 4;
    char target[] = "0003334445";

    while (low <= high) {
        int mid = low + (high - low) / 2;
        int cmp = strcmp(catalog[mid].isbn, target);

        if (cmp == 0) {
            printf("%s\n", catalog[mid].title);
            return 0;
        } else if (cmp < 0) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    printf("Not Found\n");
    return 0;
}
