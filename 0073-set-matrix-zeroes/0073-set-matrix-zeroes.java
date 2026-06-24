class Solution {

    public void setZeroes(int[][] matrix) {
        //code here
        int m = matrix.length; //counting number of rows
        int n = matrix[0].length; //how many elements in row 1 or we can say number of columns

        boolean firstRowZero = false; //mtlb abhi tk first row me zero nahi mila hai
        boolean firstColZero = false; // similarly for the column

        // Check if first row has any zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if first column has any zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row/column as markers
        for (int i = 1; i < m; i++) { //i=1 bcz we are using row1 as a marker
            for (int j = 1; j < n; j++) { //same column as a marker
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;// if a zero is found marking the markers of both row and column as zero
                    matrix[0][j] = 0;
                }
            }
        }

        // Set cells to zero based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero the first row if needed
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero the first column if needed
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}