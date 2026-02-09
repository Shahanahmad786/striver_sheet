// Import Scanner class to take input from the user
import java.util.Scanner;

// Class name (file name should be OneToN.java)
public class oneToN {

    // Recursive function to print numbers from 1 to n
    // i -> current number
    // n -> last number
    static void oneton(int i, int n) {

        // STEP 1: Base condition
        // If current number becomes greater than n,
        // stop the recursion
        if (i > n) {
            return;
        }

        // STEP 2: Print the current number
        System.out.println(i);

        // STEP 3: Recursive call
        // Increase i by 1 and call the function again
        oneton(i + 1, n);
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        // STEP 4: Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // STEP 5: Ask user to enter n
        System.out.println("Enter n:");

        // STEP 6: Read integer input and store in n
        int n = sc.nextInt();

        // STEP 7: Initial call to recursive function
        // Start printing from 1 up to n
        oneton(1, n);

        // STEP 8: Close the Scanner (good practice)
        sc.close();
    }
}