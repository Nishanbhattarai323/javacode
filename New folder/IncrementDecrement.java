public class IncrementDecrement {
    public static void main(String[] args) {
       
       /*  byte x =5;
        int y =6;
        float b=6.5f+x;
        short z=8;
        System.out.println(b);
        */
        // increment and decrement operator
        int i=56;
        int j=67;
        int c=++j;//first j is increased the c is assigned
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(--i);
        System.out.println(c);
        int y=7;
        System.out.println(++y*8);//++ has higher precedent than *

    }
}
