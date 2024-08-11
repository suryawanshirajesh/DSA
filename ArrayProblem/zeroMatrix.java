public class zeroMatrix {
      public static void setZeroes(int [][] matrix){
        int rows= matrix.length;
        int cols= matrix[0].length;
        boolean [] zerorows = new boolean[rows];
        boolean [] zeroCols = new boolean[cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    zerorows[i]=true;
                    zeroCols[j]=true;
                }
            }
        }

        for(int i=0;i<rows;i++){
            if(zerorows[i]){
                for(int j=0;j<cols;j++){
                  matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<cols;j++){
          if(zeroCols[j]){
            for(int i=0;i<rows;i++){
               matrix[i][j]=0;
            }
          }
        }

      }
      public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
   
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
            };
    
            setZeroes(matrix);
            printMatrix(matrix);
        
    }
}
