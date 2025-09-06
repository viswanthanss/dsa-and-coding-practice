public class Main {
    public static int solve(int[][] matrix) {
        int n = matrix.length;              // number of rows
        int m = matrix[0].length;           // number of columns
        
        int maxRow = 0;                     // to store largest row sum
        int maxCol = 0;                     // to store largest column sum
        
        // find maximum row sum
        for (int i = 0; i < n; i++) {       // loop through each row
            int rowSum = 0;                 // sum of current row
            for (int j = 0; j < m; j++) {   // loop through each column of that row
                rowSum += matrix[i][j];     // add element to row sum
            }
            if (rowSum > maxRow)            // check if this row sum is largest
                maxRow = rowSum;            // update max row sum
        }
        
        // find maximum column sum
        for (int j = 0; j < m; j++) {       // loop through each column
            int colSum = 0;                 // sum of current column
            for (int i = 0; i < n; i++) {   // loop through each row of that column
                colSum += matrix[i][j];     // add element to column sum
            }
            if (colSum > maxCol)            // check if this column sum is largest
                maxCol = colSum;            // update max column sum
        }
        
        return maxRow + maxCol;             // return sum of max row + max column
    }
}
