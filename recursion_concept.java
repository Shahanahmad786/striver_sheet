/*
 * Recursion Example – Understanding the Base Condition
 * ----------------------------------------------------
 * This program demonstrates how recursion works using a simple counter.
 * The function 'recursion()' prints the current value of 'count' and
 * then calls itself again until a specific stopping condition is met.
 *
 * 📌 How the logic works:
 * 1. 'count' starts at 0.
 * 2. Each time recursion() runs:
 *      - It prints the current value of 'count'
 *      - Increases 'count' by 1
 *      - Calls recursion() again (recursive call)
 *
 * 📌 Base Condition:
 *      if (count == 3) return;
 * This stops recursion when count reaches 3.
 *
 * 📌 Final Output:
 *      0
 *      1
 *      2
 */

class recursion_concept {

    static int count = 0;

    public static void recursion() {

        if (count == 3) {   // base condition
            return;
        }

        System.out.println(count);

        count++;   // increment count

        recursion();   // recursive call
    }

    public static void main(String[] args) {
        recursion();   // start recursion
    }
}