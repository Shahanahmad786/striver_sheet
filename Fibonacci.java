class Fibonacci {

    // Function to return nth Fibonacci number
    public int fib(int n) {

        // Base case:
        // If n is 0 or 1, just return n
        // Because F(0) = 0 and F(1) = 1
        if (n <= 1) return n;

        // prev2 stores Fibonacci of (i-2)
        // Initially F(0) = 0
        int prev2 = 0;

        // prev1 stores Fibonacci of (i-1)
        // Initially F(1) = 1
        int prev1 = 1;

        // Loop starts from 2 because
        // F(0) and F(1) are already known
        for (int i = 2; i <= n; i++) {

            // Calculate current Fibonacci number
            // Formula: F(n) = F(n-1) + F(n-2)
            int current = prev1 + prev2;

            // Shift values forward:
            // Now prev2 becomes old prev1
            prev2 = prev1;

            // Now prev1 becomes current
            prev1 = current;
        }

        // After loop ends,
        // prev1 will contain F(n)
        return prev1;
    }
}