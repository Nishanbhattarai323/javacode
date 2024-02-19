import java.util.Scanner;

public class  twonumber{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        //  the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
       
        // the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Close the Scanner to prevent resource leaks
        scanner.close();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;
        int multi=num1*num2;
        int sub=num1-num2;

        // Display the result
         System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The multiplication of two number is:"+multi);
    System.out.println("the subtraction of number is:"+sub);
    }
}
