class A{
    public int nishan(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of Class");
    }
}
class B extends A{
  public void meth2(){
    System.out.println("I am method of B");
  }
}
public class overiding {

    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
    }
}




