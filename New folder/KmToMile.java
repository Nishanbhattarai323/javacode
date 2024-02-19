import java.util.Scanner;

public class KmToMile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("enter the distance in kilometer:");
        double kilometer=scanner.nextDouble();
        double miles=kilometer*0.621371;
        System.out.println(kilometer+"kilometer is equal to"+miles+"miles");
        scanner.close();
    }
    
}
