#include <stdio.h>
#include <string.h>

int main(void) {
    char ids[4][10] = {"E245", "E110", "E390", "E101"};
    char departments[4][20] = {"Finance", "Engineering", "Marketing", "Engineering"};
    char target[] = "E390";
    int found = 0;

    for (int i = 0; i < 4; i++) {
        if (strcmp(ids[i], target) == 0) {
            printf("%s\n", departments[i]);
            found = 1;
            break;
        }
    }

    if (!found) printf("Unknown\n");
    return 0;
}
