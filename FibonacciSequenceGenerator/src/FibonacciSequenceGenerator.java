/**
 * @class:  FibonacciSequenceGenerator
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Write a method, printFib, that takes an integer argument.
 * In this method, create the code required to generate A Fibonacci Sequence
 * with that many numbers. Your main method should contain a loop allowing the user
 * to print multiple sequences, ask them if they want to print another sequence.
 */

import java.util.Scanner;

public class FibonacciSequenceGenerator {

    // Method to generate and print a Fibonacci sequence with n terms
    public static void printFib(int n) {
        long first = 0, second = 1;

        System.out.print("Fibonacci Sequence with " + n + " terms: " + first + ", " + second);

        for (int i = 2; i < n; i++) {
            long next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuePrinting = true;

        while (continuePrinting) {
            System.out.print("Enter the number of terms for the Fibonacci Sequence: ");
            int terms = scanner.nextInt();

            if (terms < 1) {
                System.out.println("Invalid input. Please enter a positive integer.");
            } else {
                printFib(terms);

                System.out.print("Do you want to print another sequence? (yes/no): ");
                String response = scanner.next().toLowerCase();
                if (!response.equals("yes")) {
                    continuePrinting = false;
                }
            }
        }

        scanner.close();
    }
}

