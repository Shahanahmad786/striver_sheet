import java.util.Scanner;

/**
 * Program to calculate the sum of first N natural numbers
 * using functional recursion.
 */
public class SumOfN {

    // Recursive function that returns sum of 1 to n
    static int sumOfN(int n) {

        // Base condition
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return n + sumOfN(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int result = sumOfN(n);
        System.out.println("Answer: " + result);

        sc.close();
    }
}