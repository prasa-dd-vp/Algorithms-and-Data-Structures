class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        
        if (matrix == null || matrix.length == 0) return result;
        
        int m = matrix.length,
            n = matrix[0].length,
            up = 0,
            left = 0,
            down = m - 1,
            right = n - 1;
        
        while (result.size() < m*n) {
            int i;
            
            //Left to right
            for (i=left; i<=right && result.size() < m*n; i++) {
                result.add(matrix[up][i]);    
            }

            //Up to down
            for (i=up+1; i<=down-1 && result.size() < m*n; i++) {
                result.add(matrix[i][right]);    
            }

            //Right to left
            for (i=right; i>=left && result.size() < m*n; i--) {
                result.add(matrix[down][i]);    
            }

            //Down to up
            for (i=down-1; i>=up+1 && result.size() < m*n; i--) {
                result.add(matrix[i][left]);    
            }
            up++;
            left++;
            down--;
            right--;
        }
        
        return result;
    }
}
