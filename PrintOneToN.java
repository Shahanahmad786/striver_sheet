import java.util.Scanner;

public class PrintOneToN {

    static void printNumbers(int i, int n) {
        // Base condition
        if (i > n) {
            return;
        }

        // Print current number (this makes it 1 to n)
        System.out.println(i);

        // Recursive call
        printNumbers(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        // Start from 1
        printNumbers(1, n);
    }
}
