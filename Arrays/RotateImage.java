class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int i, j, temp=0;
        
        //Transpose
        for (i=0; i<len; i++){
            for (j=i; j<len; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //Flip
        for (i=0; i<len; i++){
            for(j=0; j<len/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-1-j];
                matrix[i][len-1-j] = temp;
            }
        }
    }
}