import java.util.Arrays;

public class Problem5DiceThrowTally {

    // Counts the occurrences of dice values 1 through 6,
    // prints each count, and returns the values in increasing order.
    public static int[] diceSort(int[] rolls) {
        if (rolls == null) {
            throw new IllegalArgumentException("Rolls array cannot be null.");
        }

        int[] count = new int[7];

        for (int roll : rolls) {
            if (roll < 1 || roll > 6) {
                throw new IllegalArgumentException(
                        "Every dice result must be between 1 and 6.");
            }
            count[roll]++;
        }

        System.out.print("Counts: ");
        for (int value = 1; value <= 6; value++) {
            System.out.print(value + ":" + count[value]);
            if (value < 6) {
                System.out.print("  ");
            }
        }
        System.out.println();

        int[] sorted = new int[rolls.length];
        int index = 0;

        for (int value = 1; value <= 6; value++) {
            for (int occurrence = 0; occurrence < count[value]; occurrence++) {
                sorted[index] = value;
                index++;
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        int[] sample = {4, 1, 6, 4, 2, 1, 4};
        System.out.println("Sample input: " + Arrays.toString(sample));
        System.out.println("Sorted: " + Arrays.toString(diceSort(sample)));

        int[] ownInput = {6, 3, 3, 1, 5, 2};
        System.out.println("\\nOwn input: " + Arrays.toString(ownInput));
        System.out.println("Sorted: " + Arrays.toString(diceSort(ownInput)));
    }
}
