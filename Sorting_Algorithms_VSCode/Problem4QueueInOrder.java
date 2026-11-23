public class Problem4QueueInOrder {

    // Returns the index of the first token that is smaller than its predecessor.
    // Returns -1 when the queue is in increasing (or equal) order.
    public static int firstBreak(int[] tokens) {
        if (tokens == null || tokens.length <= 1) {
            return -1;
        }

        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] sample1 = {3, 5, 5, 8, 6, 9};
        int[] sample2 = {1, 2, 2, 7};
        int[] ownInput = {2, 4, 3, 6};

        System.out.println("Sample input: [3, 5, 5, 8, 6, 9]");
        System.out.println("First break index: " + firstBreak(sample1));

        System.out.println("\\nSample input: [1, 2, 2, 7]");
        System.out.println("First break index: " + firstBreak(sample2));

        System.out.println("\\nOwn input: [2, 4, 3, 6]");
        System.out.println("First break index: " + firstBreak(ownInput));
    }
}
