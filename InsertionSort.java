/**
 * Insertion Sort implementation in Java
 * Time Complexity: O(n^2)
 * Best Case: O(n) when array is already sorted
 * Space Complexity: O(1)
 * Stable Sort
 */

public class InsertionSort {

    // Method to perform insertion sort
    static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element
        for (int i = 1; i < n; i++) {

            int key = arr[i];   // Element to be inserted
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        // Call insertion sort
        insertionSort(arr);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}