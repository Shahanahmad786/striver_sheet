// Program to print numbers from n to 1 using recursion
public class PrintNtoOne {

    // Recursive function
    static void printNumbers(int n) {
        // Base condition
        if (n == 0) {
            return;
        }

        // Print current number
        System.out.print(n + " ");

        // Recursive call
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // You can change this value
        printNumbers(n);
    }
}