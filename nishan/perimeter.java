import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("Perimeter:");
     System.out.println("Enter all 4side");
     double a=input.nextDouble();
     double b=input.nextDouble();
     double c=input.nextDouble();
     double d=input.nextDouble();

     double perimeter=a+b+c+d;
     System.out.println("perimeter of rectangle"+perimeter);
    input.close();
    }
   
}
