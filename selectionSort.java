/**
 * Selection Sort implementation in Java
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class selectionSort {

    // Method to perform selection sort
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {

            // Assume the current index has the minimum value
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        // Call selection sort
        selectionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}