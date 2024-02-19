import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();


        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first array (sorted):");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }


        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();


        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array (sorted):");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Merge the arrays
        int[] mergedArray = mergeArrays(array1, array2);

        // Display the original arrays and the merged array
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        // Close the scanner
        scanner.close();
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int mergedSize = array1.length + array2.length;
        int[] mergedArray = new int[mergedSize];

        int i = 0, j = 0, k = 0;


        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy remaining elements from array1, if any
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements from array2, if any
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
