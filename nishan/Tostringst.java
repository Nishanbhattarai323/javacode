public class Tostringst {
    String name;
    int age;
    String rollNumber;
    String house;

    public Tostringst(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;

    }

    @Override
    public String toString() {
        return "Tostringst{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber='" + rollNumber + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
    public static void main(String[]args){
        Tostringst stu=new Tostringst("nishan",22,"001","yellow");
        System.out.println(stu);
    }

}
