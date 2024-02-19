import java.util.Random;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // 0 for Rock, 1 for Paper1, 2 for Scissors

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissors: ");

        // Validate user input
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number (0, 1, or 2): ");
            sc.next(); // Consume invalid input
        }

        int userInput = sc.nextInt();

        if (userInput < 0 || userInput > 2) {
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
            sc.close();
            return;
        }

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }

        // Display computer's choice
        switch (computerInput) {
            case 0:
                System.out.println("Computer choice: Rock");
                break;
            case 1:
                System.out.println("Computer choice: Paper");
                break;
            case 2:
                System.out.println("Computer choice: Scissors");
                break;
        }

        sc.close();
    }
}
