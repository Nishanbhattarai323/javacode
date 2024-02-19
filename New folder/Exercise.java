import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter the total marks of this exam: ");
            int total_marks = sc.nextInt();
            System.out.print("Enter the marks in dotnet: ");
            int a = sc.nextInt();
            System.out.print("Enter the marks in Technical writing: ");
            int b = sc.nextInt();
            System.out.print("Enter the marks in E-governace: ");
            int c = sc.nextInt();
            System.out.print("Enter the marks in E-commerce: ");
            int d = sc.nextInt();
            System.out.print("Enter the marks in Compiler: ");
            int e = sc.nextInt();
            System.out.print("enter the marks in SE");
            int f=sc.nextInt();
            float sum = (a+b+c+d+e+f);
            float per = (sum/total_marks)*100;
            System.out.println(name+" got "+per+" % in AISSCE.");
        }
    }  
}