// Why backward? Because we're calculating the sum of right-side elements, so we must start from the rightmost side.

// https://chatgpt.com/share/685e2cef-6398-8010-b8ad-34c537c96860

/*
Index:   0   1   2
Array:  [10, 20, 30]
Result: [50, 30, 0]

int current = arr[i];  // current = 30
arr[i] = sum;          // arr[2] = 0 ✅
sum = sum + current;   // sum = 0 + 30 = 30

*/


//Approach 1



import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);     // Input reader
        int n = sc.nextInt();                    // Number of elements

        int[] arr = new int[n];                  // Original array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();               // Read array elements
        }
        //common part array
        
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) 
        {
            int current = arr[i];    // Store current value safely
            arr[i] = sum;            // Replace with current right-side sum
            sum = sum + current;     // Update running sum
        }

        //print 
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");      // Print modified array
        }
    }
}

/*
Index:   0   1   2
Array:  [10, 20, 30]
Result: [50, 30, 0]

int current = arr[i];  // current = 30
arr[i] = sum;          // arr[2] = 0 ✅
sum = sum + current;   // sum = 0 + 30 = 30

*/



-----------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Input reader
        int n = sc.nextInt();                    // Number of elements

        int[] arr = new int[n];                  // Original array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();               // Read array elements
        }

        int sum = 0;                              // Running sum from right
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];    // Store current value safely
            arr[i] = sum;            // Replace with current right-side sum
            sum = sum + current;     // Update running sum
        }
        // for (int i = n - 1; i >= 0; i--) {
        //     int temp = arr[i];                   // Save current value
        //     arr[i] = sum;                        // Replace with sum of right elements
        //     sum += temp;                         // Add saved value to running sum
        // }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");      // Print modified array
        }
    }
}


