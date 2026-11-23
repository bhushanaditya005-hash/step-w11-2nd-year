import java.util.Arrays;

public class Problem3LibraryBookShelf {

    // Inserts each new book into its correct position in the sorted portion.
    // Prints the shelf after placing every book from the second book onward.
    public static void shelf(int[] books) {
        if (books == null) {
            System.out.println("Books array cannot be null.");
            return;
        }

        for (int i = 1; i < books.length; i++) {
            int newBook = books[i];
            int j = i - 1;

            while (j >= 0 && books[j] > newBook) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = newBook;
            System.out.println("After placing " + newBook + ": "
                    + Arrays.toString(books));
        }
    }

    public static void main(String[] args) {
        int[] sample = {30, 10, 40, 20};
        System.out.println("Sample input: " + Arrays.toString(sample));
        shelf(sample);

        int[] ownInput = {25, 5, 15, 10};
        System.out.println("\\nOwn input: " + Arrays.toString(ownInput));
        shelf(ownInput);
    }
}
