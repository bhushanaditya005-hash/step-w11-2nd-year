# Sorting Algorithms Assignment — Java / VS Code

This folder contains runnable Java solutions for Problems 1–5.

## Files

1. `Problem1HeightLineUp.java` — adjacent swaps (bubble-sort style), prints each pass.
2. `Problem2PrizeTable.java` — selection sort in descending order; returns actual swap count.
3. `Problem3LibraryBookShelf.java` — insertion sort; prints the shelf after each insertion.
4. `Problem4QueueInOrder.java` — finds the index of the first token smaller than the previous token.
5. `Problem5DiceThrowTally.java` — counting sort for dice values 1 through 6; prints frequencies.

The solutions do not call `Arrays.sort()`.

## Open and run in VS Code

1. Extract `Sorting_Algorithms_VSCode.zip`.
2. Open the extracted `Sorting_Algorithms_VSCode` folder in VS Code.
3. Install the **Extension Pack for Java** if VS Code asks.
4. Open the VS Code terminal: **Terminal → New Terminal**.
5. Compile all five programs:

   ```bash
   javac *.java
   ```

6. Run any problem:

   ```bash
   java Problem1HeightLineUp
   java Problem2PrizeTable
   java Problem3LibraryBookShelf
   java Problem4QueueInOrder
   java Problem5DiceThrowTally
   ```

Each file has a `main` method that runs the assignment's sample input and one additional test input.

## Notes

- Problem 1 prints the final no-swap pass too, as required.
- Problem 2 counts only swaps that actually happen.
- Problem 3 prints the array after each new book is inserted.
- Problem 4 uses zero-based indexing, as specified in the assignment.
- Problem 5 accepts only dice results from 1 to 6.
