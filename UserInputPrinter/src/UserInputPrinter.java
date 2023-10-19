/**
 * @class: UserInputPrinter
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Write a method, getInput, that allows the user to enter a String and
 * returns this value to be printed using your printString method defined above. Again,
 * do not use the static keyword on your methods other than main.
*/

import java.util.Scanner;

public class UserInputPrinter {

    // Method to get user input and return it as a String
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    // Method to print a String
    public void printString(String value) {
        System.out.println("You entered: " + value);
    }

    public static void main(String[] args) {
        UserInputPrinter userInputPrinter = new UserInputPrinter();

        // Get user input and print it
        String userInput = userInputPrinter.getInput();
        userInputPrinter.printString(userInput);
    }
}



