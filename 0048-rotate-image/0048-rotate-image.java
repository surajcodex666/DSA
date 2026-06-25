class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length; 
        
        //transpose
        for (int i = 0; i<=n-2; i++){
            for( int j =i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            
        }

        //reverese in rows
        for(int i = 0; i<n; i++){
            int left = 0;
            int rigth = n-1;

            while(left < rigth){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][rigth];
                matrix[i][rigth] = temp;
                left++;
                rigth--;

            }   
        }

    }
}