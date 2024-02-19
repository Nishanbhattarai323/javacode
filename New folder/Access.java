

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class Access {
    public static void main(String[] args) {
        MyEmployee nishan = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        nishan.setName("CodeWithnishan");
        System.out.println(nishan.getName());
        nishan.setId(234);
        System.out.println(nishan.getId());
    }
}
