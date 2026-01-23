public class prime {

    public static void main(String[] args) {

        int n = 29;  // Number to check

        boolean isPrime = true; // Assume n is prime initially

        // A number less than or equal to 1 is NOT prime
        if (n <= 1) {
            isPrime = false;
        } else {
            // Check divisors from 2 to sqrt(n)
            for (int i = 2; i * i <= n; i++) {
                // If n is divisible by i, it's not prime
                if (n % i == 0) {
                    isPrime = false;
                    break;  // Exit loop early
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number");
        }
    }
}