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

import java.util.*;
import java.util.Scanner;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Scanner for input

        int n = sc.nextInt();                       // Read number of elements
        int[] arr = new int[n];                     // Declare array

        int sum = 0;                                // Variable to store the sum

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                  // Read array element
            sum += arr[i];   //math                       // Add to sum
            //sum = sum + arr[i];
            
        }

        System.out.println(sum);                    // Print the total sum
    }
}


-----------------------------------------------------------------------------------------

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Read input
        int n = sc.nextInt();                    // Number of elements
        int[] arr = new int[n];                  // Declare array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();               // Input elements
        }

        int sum = 0;                              // To store running sum of left elements
        for (int i = 0; i < n; i++) {
            System.out.print(sum + " ");         // Print current sum (left side)
            sum += arr[i];                       // Add current element to sum
            //sum holds the sum of all previous (left) elements
           // We want to print that left-side sum before adding the current element
        }
    }
}



-----------------------------------------------------------------------------------------



  
