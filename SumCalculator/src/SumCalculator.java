/**
 * @class: SumCalculator
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Question 6. Create a method named sum that takes two numbers
 * and returns the sum of these two numbers.*/

public class SumCalculator {

    // Method to sum two integers
    public int sum(int a, int b) {
        System.out.println("Calling sum(int, int) method");
        return a + b;
    }

    // Method to sum two double numbers
    public double sum(double a, double b) {
        System.out.println("Calling sum(double, double) method");
        return a + b;
    }

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();

        // Call the sum method for integers
        int result1 = calculator.sum(5, 10);
        System.out.println("Sum of two integers: " + result1);

        // Call the sum method for doubles
        double result2 = calculator.sum(5.5, 10.5);
        System.out.println("Sum of two doubles: " + result2);

        // Call the sum method with one double and one int
        double result3 = calculator.sum(7.5, 3);
        System.out.println("Sum of one double and one int: " + result3);

        // Call the sum method with two ints, will call the integer version
        int result4 = calculator.sum(3, 2);
        System.out.println("Sum of two integers: " + result4);
    }
}
