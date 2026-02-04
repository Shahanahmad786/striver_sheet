/*
 * Check if a String is Palindrome
 * -------------------------------
 * A palindrome is a string that reads the same forward and backward.
 *
 * Examples:
 *  "madam"  → Palindrome
 *  "level"  → Palindrome
 *  "hello"  → Not Palindrome
 *
 * Approach:
 * 1. Take input string from the user.
 * 2. Reverse the string.
 * 3. Compare the reversed string with the original string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Scanner;

public class PalindromeString {

    public static boolean isPalindrome(String str) {
        String reverse = "";

        // reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // compare original and reversed string
        return str.equals(reverse);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}