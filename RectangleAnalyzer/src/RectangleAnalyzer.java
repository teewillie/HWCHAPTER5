/**
 * @class:  RectangleAnalyzer
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Create a method that allows the user to enter the height and width for a
 * rectangle. You will need to use instance variables to hold the values entered. Once you
 * obtain these measurements, call the calculateArea method passing these values to the method.
 */

import java.util.Scanner;

public class RectangleAnalyzer {
    private double height;
    private double width;

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return height * width;
    }

    // Method to determine if the rectangle is large
    public boolean isLarge(int area) {
        return area > 300;
    }

    // Method to print the size of the rectangle
    public void printSize(boolean isLarge) {
        if (isLarge) {
            System.out.println("This is a large rectangle.");
        } else {
            System.out.println("This is a small rectangle.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RectangleAnalyzer rectangle = new RectangleAnalyzer();

        System.out.print("Enter the height of the rectangle: ");
        rectangle.height = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        rectangle.width = scanner.nextDouble();

        double area = rectangle.calculateArea();
        boolean isLarge = rectangle.isLarge((int) area);
        rectangle.printSize(isLarge);

        scanner.close();
    }
}
