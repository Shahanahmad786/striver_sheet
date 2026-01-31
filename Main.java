import java.util.Scanner;   // Import Scanner class for user input

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create Scanner object

        int n = sc.nextInt();  // Read input value N

        long sum = 0;          // Variable to store the sum

        // Loop from 1 to N
        for (int i = 1; i <= n; i++) {
            sum = sum + i;     // Add each number to sum
        }

        System.out.println(sum);  // Print the final sum

        sc.close();  // Close the Scanner
    }
}