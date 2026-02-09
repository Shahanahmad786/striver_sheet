// Import Scanner class to take input from the user
import java.util.Scanner;

// Class name (file name should be NToOne.java)
public class nToOne {

    // Recursive function to print numbers from n to 1
    // i -> current number
    static void ntoone(int i) {

        // STEP 1: Base condition
        // If i becomes less than 1, stop recursion
        if (i < 1) {
            return;
        }

        // STEP 2: Print the current number
        System.out.println(i);

        // STEP 3: Recursive call
        // Decrease i by 1 and call the function again
        ntoone(i - 1);
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
        // Start printing from n down to 1
        ntoone(n);

        // STEP 8: Close Scanner (good practice)
        sc.close();
    }
}