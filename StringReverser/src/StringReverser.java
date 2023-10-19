/**
 * @class:  StringReverser
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Create a method reverseString which takes a String as a parameter and returns
 * a String with all of the characters reversed.
 */

public class StringReverser {

    // Method to reverse a string
    public static String reverseString(String input) {
        if (input == null) {
            return null; // Handle null input
        }

        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello, World!"; // Change this to the string you want to reverse
        String reversed = reverseString(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

