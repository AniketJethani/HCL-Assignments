package Assignment1;

public class MatrixOperations {

    public void addition(int[][]arr1,int[][]arr2){
        int row=arr1.length;
        int column=arr1[0].length;
        int[][]arr3=new int[row][column];
         for(int i=0;i<row;i++){
             for(int j=0;j<column;j++){
                 arr3[i][j]=arr1[i][j]+arr2[i][j];
             }
         }
    }
  public void substraction(int[][]arr1,int[][]arr2){
      int row=arr1.length;
      int column=arr1[0].length;
      int[][]arr3=new int[row][column];
      for(int i=0;i<row;i++){
          for(int j=0;j<column;j++){
              arr3[i][j]=arr1[i][j]-arr2[i][j];
          }
      }

  }
  public void multiplication(int[][]arr1,int[][]arr2){
        if(arr1[0].length==arr2.length){
            int row=arr1.length;
            int col=arr2[0].length;
            int[][]arr3=new int[row][col];
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    int k=0;
                    arr3[i][j]=arr1[i][k]*arr2[i][k]+arr1[i][k+1]*arr2[i+1][k];

                }
            }

        }
        else {
            System.out.println("Matrix multiplication not possible");
        }


  }

}
