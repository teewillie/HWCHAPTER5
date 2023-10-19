import java.util.Scanner;

public class GameScoreTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = enterName(scanner);
            if (name.isEmpty()) {
                break; // Exit loop if the user does not enter a name
            }

            int score = enterScore(scanner);
            printScore(name, score);
        }

        System.out.println("Thank you for entering game scores!");
    }

    // Method to enter a name
    public static String enterName(Scanner scanner) {
        System.out.print("Enter your name (or press Enter to quit): ");
        return scanner.nextLine();
    }

    // Method to enter a high score
    public static int enterScore(Scanner scanner) {
        System.out.print("Enter your high score: ");
        return scanner.nextInt();
    }

    // Method to print the name and score
    public static void printScore(String name, int score) {
        System.out.println("Name: " + name);
        System.out.println("High Score: " + score);
    }
}
