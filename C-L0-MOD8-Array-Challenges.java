import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);          // Create Scanner for input

        int n = sc.nextInt();                         // Read number of elements
        int[] arr = new int[n];                       // Declare array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                    // Read each array element
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");           // Print each element with a space
        }
    }
}




---------------------------------------------------------------------------------




import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Input scanner

        int n = sc.nextInt();                    // Read number of elements
        int[] arr = new int[n];                  // Declare array

      //Odd = X
      //Even = Y

        int oddCount = 0;                        // Counter for odd numbers
        int evenCount = 0;                       // Counter for even numbers
        //% 2 == 0 → checks if the number is even
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();               // Read each element
            if (arr[i] % 2 == 0) {
                evenCount++;                     // Even number
            } else {
                oddCount++;                      // Odd number
            }
        }

        // Print the result
        System.out.println("Odd = " + oddCount);
        System.out.println("Even = " + evenCount);
    }
}

---------------------------------------------------------------------------------------------


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);          // Create Scanner for input
        //size  number n (number of elements)
        int n = sc.nextInt();                         // Read number of elements
        int[] arr = new int[n];                       // Declare array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                    // Read each array element
        }
        //Second loop prints the array from last index to 0
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");           // Print each element with a space
        }
    }
}



---------------------------------------------------------------------------------------------




  
