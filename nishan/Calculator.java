import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.println("Please enter the first number:");
        int num1=input.nextInt();
        System.out.println("Please enter the second number:");
        int num2=input.nextInt();
        System.out.println("Now,enter the operation:");
        String operation=input.next();
        int result=switch(operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.println("your answer is:"+result);
    }
}
