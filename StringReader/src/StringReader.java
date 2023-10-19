/**
 * @class: String Reader
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description: Question 2.Read a String (class method, no parameters)
  Using the keyword static, define this method.
 */

import java.util.Scanner;

public class StringReader {

    // Define a static method to read a string
    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = scanner.nextLine();
        scanner.close(); // Close the scanner to release its resources
        return input;
    }

    public static void main(String[] args) {
        // Call the readString method to read a string
        String userInput = readString();

        // Display the user's input
        System.out.println("You entered: " + userInput);
    }
}
