/**
 * @class: MyStringReader
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description: Question3. Read a String (class method, no parameters) Using the keyword static, define this method.
 */

import java.util.Scanner;

public class MyStringReader {

    // Define a static method to read a string using the provided Scanner
    public static String readString(Scanner scanner) {
        System.out.print("Please enter a string: ");
        String input = scanner.nextLine();
        return input;
    }

    public static void main(String[] args) {
        // Create an instance of the Scanner class in the main method
        Scanner inputScanner = new Scanner(System.in);

        // Call the readString method, passing the Scanner instance as a parameter
        String userInput = readString(inputScanner);

        // Display the user's input
        System.out.println("You entered: " + userInput);

        // Don't forget to close the Scanner when you're done with it
        inputScanner.close();
    }
}
