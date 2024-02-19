public class Arraypractice {
    public static void main(String[] args) {
      /*   float[]mark={45.5f,68.8f,98.7f,34.5f,78.9f};
        float sum=0;
        for(float element:mark){
         sum=sum+element;
        }
        System.out.println("the value of sum is "+sum);
    }
    */
   /* float[]mark={45.5f,68.8f,98.7f,34.5f,78.9f};
        float num=45.5f;
        boolean isInArray=false;
        for(float element:mark){
            if(num==element){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("present in the array");
        }
        else{
            System.out.println("the value is not in array");
        } */
       /* float[]mark={45.5f,68.8f,98.7f,34.5f,78.9f};
        float sum=0;
        for(float element:mark){
         sum=sum+element;
        }
        System.out.println("the value of sum is "+sum/mark.length); */
      int [][ ]mat1={{1,2,3},{4,5,6}};
      int [][]mat2={{2,6,7},{11,3,6}};
      int [][]result={{0,0,0},{0,0,0}};
      for(int i=0;i<mat1.length;i++){
        for(int j=0;j<mat1[i].length;j++){
            System.out.format("setting value for i=%d and j=%d\n",i,j);
        result[i][j]=mat1[i][j]+mat2[i][j];
        }
      }
      for(int i=0;i<mat1.length;i++){
        for(int j=0;j<mat1[i].length;j++){
    System.out.print(result[i][j]+" ");
        result[i][j]=mat1[i][j]+mat2[i][j];
        }
        System.out.println(" ");
      }
    
    }

}
