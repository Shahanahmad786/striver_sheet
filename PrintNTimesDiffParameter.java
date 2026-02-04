import java.util.Scanner;

public class PrintNTimesDiffParameter {

    // Recursive function using different parameters
    static void printName(int i, int n) {

        // Base condition: stop when i exceeds n
        if (i > n) {
            return;
        }

        // Print the message
        System.out.println("Hello");

        // Recursive call with incremented i
        printName(i + 1, n);
    }

    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Prompt user
        System.out.println("Enter n:");

        // Read input value
        int n = sc.nextInt();

        // Initial recursive call
        printName(1, n);
    }
}