/**
 * @class: AverageGradeCalculator
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 6, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 *
 * Description:
 */

import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter student grades (enter 'c' to calculate average):");

        while (true) {
            String input = scanner.next();

            // Check if the input is 'c' to calculate the average and exit the loop
            if (input.equalsIgnoreCase("c")) {
                break;
            }

            try {
                int grade = Integer.parseInt(input);
                sum += grade;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a grade or 'c' to calculate the average.");
            }
        }

        scanner.close();

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average student grade is %.1f%n", average);
        } else {
            System.out.println("No grades entered. Unable to calculate the average.");
        }
    }
}
