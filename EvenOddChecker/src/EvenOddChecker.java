/**
 * @class: EvenOddChecker
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Create a class that asks the user to enter a number. Call a method isEven
 * that returns true or false if the number is even. The return from isEven should be passed
 * to printEven which will print "The number is even" if the number is even and "The number is
 * odd" if the number is odd. Determination of what to print must be done based on the return
 * from the isEven method.
*/

import java.util.Scanner;

public class EvenOddChecker {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to print the result based on whether the number is even or odd
    public static void printEven(boolean isEven) {
        if (isEven) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        boolean isNumberEven = isEven(userInput);

        printEven(isNumberEven);

        scanner.close();
    }
}

