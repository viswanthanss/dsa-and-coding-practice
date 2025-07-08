import java.util.*;
public class Main {

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
       // int i,j; 
         int[][] matrix = new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
       
       // int counter = 1;

        int topRow = 0;
        int bottomRow = rows - 1;
        int leftCol = 0;
        int rightCol = columns - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Fill top row (left to right)
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(matrix[topRow][i]+" ");
              //  matrix[topRow][i] = counter++;
            }
            topRow++;

            // Fill right column (top to bottom)
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol]+" ");
               // matrix[i][rightCol] = counter++;
            }
            rightCol--;

            // Fill bottom row (right to left)
            if (topRow <= bottomRow) { // Check to avoid filling already filled rows in odd-sized matrices
                for (int i = rightCol; i >= leftCol; i--) {
                    System.out.print(matrix[bottomRow][i]+" ");
                   // matrix[bottomRow][i] = counter++;
                }
                bottomRow--;
            }

            // Fill left column (bottom to top)
            if (leftCol <= rightCol) { // Check to avoid filling already filled columns in odd-sized matrices
                for (int i = bottomRow; i >= topRow; i--) {
                      System.out.print( matrix[i][leftCol]+" ");
                   // matrix[i][leftCol] = counter++;
                }
                leftCol++;
            }
            
            
            
            
            
        }
        
        
        
        
        
    }
}




//https://onlinegdb.com/u-gyrysk5




