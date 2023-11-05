package OOPS;

public class CopybyRecusion {

    public static void copyArray(int[] x, int[] y, int index) {
        // Base case: If the index reaches the end of the source array, stop recursion.
        if (index == x.length) {
            return;
        }

        // Copy the current element from source to destination array.
        y[index] = x[index];

        // Recursively copy the rest of the elements.
        copyArray(x, y, index + 1);
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int[] y = new int[x.length];

        // Start the recursion from index 0.
        copyArray(x, y, 0);

        // Print the elements of the destination array (array y) to verify the copy.
        System.out.print("Array y: ");
        for (int num : y) {
            System.out.print(num + " ");
        }
    }
}
