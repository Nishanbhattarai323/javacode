public class Multideminson {
public static void main(String[] args) {
    
    int [][]flat;
    flat=new int[2][3];
    flat[0][0]=101;
    flat[0][1]=102;
    flat[0][2]=103;
    flat[1][0]=201;
    flat[1][1]=202;
    flat[1][2]=203;
    System.out.println("printing a 2-D array");
    for(int i=0;i<flat.length;i++){
        for(int j=0;j<flat[i].length;j++){
            System.out.print(flat[i][j]);
            System.out.print("\n");
        }
       
    }
    System.out.println("");

}
    
}