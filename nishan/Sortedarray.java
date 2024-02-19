import java.util.Scanner;

public class Sortedarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=scanner.nextInt();
        int []number=new int[size];
        System.out.println("Enter the element of the array:");
        for(int i=0;i<size;i++){
            System.out.println("Element"+(i+1)+":");
            number[i]=scanner.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < size - 1; i++) {
            if (number[i] > number[i + 1]) {
                isSorted = false;
                break;
            }
        }


        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted.");
        }


        scanner.close();

    }
}
