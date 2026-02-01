import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Ask for array elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse array
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}