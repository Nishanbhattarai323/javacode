import java.util.Scanner;
import java.util.Arrays;

public class Deletearray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int[] originalArray = new int[size];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        // Get the element to delete
        System.out.print("Enter the element to delete: ");
        int elementToDelete = scanner.nextInt();


        int[] newArray = new int[size - 1];

        // Copy elements from the original array to the new array, excluding the element to delete
        int newArrayIndex = 0;
        for (int i = 0; i < size; i++) {
            if (originalArray[i] != elementToDelete) {
                newArray[newArrayIndex] = originalArray[i];
                newArrayIndex++;
            }
        }


        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array after deleting " + elementToDelete + ": " + Arrays.toString(newArray));

        // Close the scanner
        scanner.close();
    }
}
