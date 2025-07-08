// →→→→→
// ↓       ↓
// ↓       ↓
// ←←←←←
// ↑ ↑ ↑ ↑

public class Main {

    public static int[][] generateSpiralMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int counter = 1;

        int topRow = 0;
        int bottomRow = rows - 1;
        int leftCol = 0;
        int rightCol = columns - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Fill top row (left to right)
            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = counter++;
            }
            topRow++;

            // Fill right column (top to bottom)
            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = counter++;
            }
            rightCol--;

            // Fill bottom row (right to left)
            if (topRow <= bottomRow) { // Check to avoid filling already filled rows in odd-sized matrices
                for (int i = rightCol; i >= leftCol; i--) {
                    matrix[bottomRow][i] = counter++;
                }
                bottomRow--;
            }

            // Fill left column (bottom to top)
            if (leftCol <= rightCol) { // Check to avoid filling already filled columns in odd-sized matrices
                for (int i = bottomRow; i >= topRow; i--) {
                    matrix[i][leftCol] = counter++;
                }
                leftCol++;
            }
            
            
            
            
            
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.printf("%4d", cell); // Format for better alignment
            }
            System.out.println();
        }
        
        
        
    }

    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        int[][] spiralMatrix = generateSpiralMatrix(rows, columns);
        printMatrix(spiralMatrix);
        
        
        
        
        
    }
}


/*
1  2  3  4  5 
16 17 18 19 6
15 14 13 24 23
12 25 22 11 20
21 10




*/
