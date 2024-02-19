import java.util.Scanner;

public class Search2d {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int rows=scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns=scanner.nextInt();
        int [][] array2D=new int[rows][columns];
        System.out.println("Enter elements of 2D array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Elements at position("+(i+1)+","+(j+1)+"):");
                array2D[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter the element to search for:");
        int targetElement=scanner.nextInt();
        boolean found =false;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(array2D[i][j]==targetElement){
                    found=true;
                    System.out.println("Element " + targetElement + " found at position (" + (i + 1) + ", " + (j + 1) + ")");
                    break;
                }
            }
            if (!found) {
                System.out.println("Element " + targetElement + " not found in the 2D array.");
            }
            scanner.close();
        }
    }
}
