/**
 * @class:  PalindromeChecker
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Create a method, isPalindrome, which returns true if the String passed to it is a palindrome and false if it is not.
 */

public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false; // Handle null input
        }

        // Remove non-alphanumeric characters and convert to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanInput.length() - 1;

        while (left < right) {
            if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String palindrome = "A man, a plan, a canal, Panama"; // Change this to the string you want to check
        boolean isPalindrome = isPalindrome(palindrome);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
