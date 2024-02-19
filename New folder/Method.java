public class Method {
  static int logic(int x,int y){
    int z;
    if(x>y){
        z=x+y;
    }
    else{
        z=(x+y)*5;
    }
    return z;
  }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        int a1=4;
        int b1=8;
        int c1;
        c1=logic(a1,b1);
        c=logic(a,b);
        System.out.println(c);
        System.out.println(c1);
        
    }
}
