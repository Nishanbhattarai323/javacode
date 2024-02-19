class Employee1{
    private int id;
    private int salary;
    private String name;

    public Employee1(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

 class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee1 nishan = new Employee1(46, "JAVA PROGRAMMING", 40000);
        Employee1 john = new Employee1(98, "John Cena", 30000);

        nishan.printDetails();
        john.printDetails();

        int johnSalary = john.getSalary();
        System.out.println("John's salary is " + johnSalary);
    }
}
