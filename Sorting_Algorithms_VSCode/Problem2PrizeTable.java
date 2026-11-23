import java.util.Arrays;

public class Problem2PrizeTable {

    // Sorts marks in descending order and returns the number of actual swaps.
    public static int prizeTable(int[] marks) {
        if (marks == null) {
            throw new IllegalArgumentException("Marks array cannot be null.");
        }

        int swaps = 0;

        for (int i = 0; i < marks.length - 1; i++) {
            int largestIndex = i;

            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] > marks[largestIndex]) {
                    largestIndex = j;
                }
            }

            if (largestIndex != i) {
                int temp = marks[i];
                marks[i] = marks[largestIndex];
                marks[largestIndex] = temp;
                swaps++;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] sample = {45, 90, 60, 75};
        System.out.println("Sample input: " + Arrays.toString(sample));
        int sampleSwaps = prizeTable(sample);
        System.out.println("Sorted output: " + Arrays.toString(sample));
        System.out.println("Swaps = " + sampleSwaps);

        int[] ownInput = {30, 10, 50, 20};
        System.out.println("\\nOwn input: " + Arrays.toString(ownInput));
        int ownSwaps = prizeTable(ownInput);
        System.out.println("Sorted output: " + Arrays.toString(ownInput));
        System.out.println("Swaps = " + ownSwaps);
    }
}
