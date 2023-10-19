/**
 * @class: InputHandler
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Question 5. Read a String (instance method, no parameters)
 * Without using the keyword static, define this method.
 */

import java.util.Scanner;

public class InputHandler {

    // Define an instance method to read a string using a provided Scanner
    public String readString(Scanner scanner) {
        System.out.print("Please enter a string: ");
        String input = scanner.nextLine();
        return input;
    }

    public static void main(String[] args) {
        // Create an object of the InputHandler class
        InputHandler inputHandler = new InputHandler();

        // Create an object of the Scanner class
        Scanner inputScanner = new Scanner(System.in);

        // Call the readString method using the object, passing the Scanner object as a parameter
        String userInput = inputHandler.readString(inputScanner);

        // Display the user's input
        System.out.println("You entered: " + userInput);

        // Don't forget to close the Scanner when you're done with it
        inputScanner.close();
    }
}
