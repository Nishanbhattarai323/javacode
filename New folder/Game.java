import java.util.Random;
import java.util.Scanner;

public class Game {
    private int randomNumber;
    private int userGuess;
    private int noOfGuesses;
    private static final int MAX_GUESSES = 10;  // Set a maximum number of guesses

    public Game() {
        // Constructor to generate a random number between 1 and 100
        Random random = new Random();
        this.randomNumber = random.nextInt(100) + 1;
        this.noOfGuesses = 0;
    }

    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        if (scanner.hasNextInt()) {
            this.userGuess = scanner.nextInt();
            this.noOfGuesses++;
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next();  // Clear the invalid input
        }
    }

    public boolean isCorrectNumber() {
        // Method to detect whether the number entered by the user is correct
        return this.userGuess == this.randomNumber;
    }

    // Getter and setter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public static void main(String[] args) {
        // Example of using the Game class
        Game guessGame = new Game();

        while (guessGame.getNoOfGuesses() < MAX_GUESSES) {
            guessGame.takeUserInput();

            if (guessGame.isCorrectNumber()) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Number of guesses: " + guessGame.getNoOfGuesses());
                break;
            } else {
                System.out.println("Try again!");

                // Provide feedback to the user (optional)
                if (guessGame.userGuess < guessGame.randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
        }

        // If the loop completes without a correct guess
        if (!guessGame.isCorrectNumber()) {
            System.out.println("Sorry! You've reached the maximum number of guesses. The correct number was: " + guessGame.randomNumber);
        }
    }
}
