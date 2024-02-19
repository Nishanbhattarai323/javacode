public class Array {
    public static void main(String[] args) {
        int []mark={100,70,50,67,89,87};
        /*
          mark=new int[5];
        mark[0]=100;
        mark[1]=89;
        mark[2]=98;
        mark[3]=59;
        mark[4]=79;
         */
        
       /* for(int i=0;i<mark.length;i++)
        System.out.println(mark[i]);
        System.out.println("printing using foreach loop");
       
       */
       for(int element:mark)
        System.out.println(element);
   
    }
    
}
