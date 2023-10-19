/**
 * @class:  PrimeChecker
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 19, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Write a method, isPrime that takes an int as a parameter and returns
 * true if the number is prime, false if it is not.
 */

public class PrimeChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (number <= 3) {
            return true; // 2 and 3 are prime
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Numbers divisible by 2 or 3 are not prime
        }

        // Check for prime by testing divisibility up to the square root of the number
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 18; // Change this to the number you want to check
        boolean isPrimeNumber = isPrime(num);

        if (isPrimeNumber) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }
}

