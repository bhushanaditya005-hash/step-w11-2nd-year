import java.util.Arrays;

public class Problem1HeightLineUp {

    // Sorts heights in increasing order using adjacent swaps.
    // Prints the array after every left-to-right pass.
    public static void lineUp(int[] heights) {
        if (heights == null) {
            System.out.println("Heights array cannot be null.");
            return;
        }

        int pass = 1;

        while (true) {
            boolean swapped = false;

            for (int j = 0; j < heights.length - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }

            System.out.println("Pass " + pass + ": " + Arrays.toString(heights));
            pass++;

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] sample = {4, 2, 5, 1};
        System.out.println("Sample input: " + Arrays.toString(sample));
        lineUp(sample);

        int[] ownInput = {7, 3, 5, 2};
        System.out.println("\\nOwn input: " + Arrays.toString(ownInput));
        lineUp(ownInput);
    }
}
