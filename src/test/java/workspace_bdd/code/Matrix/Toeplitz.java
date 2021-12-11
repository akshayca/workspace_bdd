package workspace_bdd.code.Matrix;

public class Toeplitz {
     
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i = 0; i< row - 1;i++){
            int j = 0;
            
            while(j<col-1){
                if (matrix[i][j] == matrix[i+1][j+1]){
                    j++;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }
}
