public class overloading {
    
    // Swap integers
    public static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    // Swap doubles
    public static void swap(double a, double b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        double temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    // Swap strings
    public static void swap(String a, String b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        String temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        // Test swapping with different data types
        swap(5, 10);
        swap(3.14, 6.28);
        swap("Hello", "World");
    }
}
