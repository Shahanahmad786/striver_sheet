import java.util.Scanner;

/**
 * Program to reverse an array using recursion
 * (two-pointer approach)
 */
public class ReverseArray2 {

    // Recursive function to reverse array
    static void reverse(int[] arr, int l, int r) {

        // Base condition
        if (l >= r) {
            return;
        }

        // Swap elements at l and r
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        // Recursive call
        reverse(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Start recursion from index 0 to n-1
        reverse(arr, 0, n - 1);

        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}