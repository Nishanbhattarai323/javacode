public class Car {
    int wheel;
    int door;
    int maxspeed;
    String name;
    String model;
    String  company;

    public Car(int wheel, int door, int maxspeed, String name, String model, String company) {
        this.wheel = wheel;
        this.door = door;
        this.maxspeed = maxspeed;
        this.name = name;
        this.model = model;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", door=" + door +
                ", maxspeed=" + maxspeed +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
    Car swift=new Car(4,4,120,"swift","SW98","Maruti");
        System.out.println(swift);

    }



}
