import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array based on the user input size
        int[] numbers = new int[size];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        System.out.print("Enter the number to find occurrences: ");
        int targetNumber = scanner.nextInt();


        int occurrences = 0;
        for (int number : numbers) {
            if (number == targetNumber) {
                occurrences++;
            }
        }

        // Display the result
        System.out.println("Number of occurrences of " + targetNumber + ": " + occurrences);

        // Close the scanner
        scanner.close();
    }
}
