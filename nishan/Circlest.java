import java.util.Scanner;

public class Circlest {
    double radius;

    public Circlest(double radius) {
        this.radius = radius;
    }

    double getCircum() {
        return 2 * radius * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: Radius: " + radius
                + " Circumference: " + getCircum()
                + " Area: " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        Circlest circle = new Circlest(radius);  // Corrected class name to Circlest
        System.out.println(circle);
    }
}
