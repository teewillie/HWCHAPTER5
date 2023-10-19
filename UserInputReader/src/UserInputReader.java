/**
 * @class: UserInputReader
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Question 4. Read a String (instance method, no parameters)
 * Without using the keyword static, define this method.
 */

import java.util.Scanner;

public class UserInputReader {

    // Define an instance method to read a string
    public String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = scanner.nextLine();
        scanner.close(); // Close the scanner to release its resources
        return input;
    }

    public static void main(String[] args) {
        // Create an object of the UserInputReader class
        UserInputReader userInputReader = new UserInputReader();

        // Call the readString method using the object
        String userInput = userInputReader.readString();

        // Display the user's input
        System.out.println("You entered: " + userInput);
    }
}


