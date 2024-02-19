import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();
         scanner.close();
        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
