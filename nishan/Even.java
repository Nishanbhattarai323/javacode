import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ODD Even");
        System.out.println("enter the number:");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("Odd number");
        }
        input.close();
    }
}
