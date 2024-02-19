public class practicefunction {
    /*static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++)
            System.out.print("*");
        }
        System.out.println();
        
        
    }
    */
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }
    public static void main(String[] args) {
      //  pattern(4);
      int c=sumRec(7);
      System.out.println(c);
    }
}
