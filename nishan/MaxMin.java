import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array based on the user input size
        int[] numbers = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the minimum and maximum
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display the result
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        // Close the scanner
        scanner.close();
    }
}
