/**
 * @class: ReverseString
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 6, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 *
 * Description:
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize variables for the reversed string and index
        String reversed = "";
        int index = input.length() - 1;

        // Reverse the string using a while loop
        while (index >= 0) {
            reversed += input.charAt(index);
            index--;
        }

        // Display the reversed string
        System.out.println("Reverse of \"" + input + "\" is \"" + reversed + "\"");

        scanner.close();
    }
}

