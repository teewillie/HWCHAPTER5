/**
 * @class: PrimeNumber
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 6, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 *
 * Description:
 */

import java.util.Scanner;

public class LastCharOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter a character: ");
        char targetChar = scanner.nextLine().charAt(0);

        // Initialize the index to -1 (character not found)
        int lastIndex = -1;

        // Search for the last occurrence of the character
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                lastIndex = i;
            }
        }

        // Display the result
        if (lastIndex != -1) {
            System.out.println("Last occurrence of character '" + targetChar + "' in \"" + input + "\" is at index " + lastIndex);
        } else {
            System.out.println("Last occurrence of character '" + targetChar + "' in \"" + input + "\" is at index -1");
        }

        scanner.close();
    }
}
