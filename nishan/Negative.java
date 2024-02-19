import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Check wether the number is positive or negative:");
        System.out.println("Enter your number:");
        int num=input.nextInt();
        if(num>0){
            System.out.println("Your number is positive");
        }
        else if(num==0){
            System.out.println("Equal to Zero");
        }
        else{
            System.out.println("Your number is negative");
        }
        input.close();
    }
}
