import java.util.Scanner;

/**
 * Program to calculate factorial of a number
 * using functional recursion.
 */
public class Factorial {

    // Recursive function that returns factorial of n
    static int factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;   // factorial base case
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int result = factorial(n);
        System.out.println("Answer: " + result);

        sc.close();
    }
}