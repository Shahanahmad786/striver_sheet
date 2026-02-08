/**
 * Merge Sort implementation in Java
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * Stable Sort
 */

public class MergeSort {

    // Function to divide the array
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            // Find the middle index
            int mid = left + (right - left) / 2;

            // Recursively sort left half
            mergeSort(arr, left, mid);

            // Recursively sort right half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two sorted halves
    static void merge(int[] arr, int left, int mid, int right) {

        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge the temp arrays back into arr
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[], if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[], if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        // Call merge sort
        mergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}