import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take two numbers as input
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Euclid's algorithm to find GCD
        while (b != 0) {
            int temp = b;   // store b
            b = a % b;      // update b with remainder
            a = temp;       // update a with old b
        }

        // when b gets 0, a contains the GCD
        System.out.println("GCD = " + a);

        sc.close();
    }
}