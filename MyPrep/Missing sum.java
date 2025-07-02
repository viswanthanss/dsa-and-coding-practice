import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // To read input

        int n = sc.nextInt();                // Read size of array (n)
        int[] arr = new int[n];              // Create array of size n

        int sum = 0;                         // For adding array values

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();           // Read array elements
            sum = sum + arr[i];              // Add each element to sum
        }

        int total = n * (n + 1) / 2;         // Expected sum from 0 to n
        int missing = total - sum;           // Subtract actual from expected

        System.out.println(missing);         // Print missing number
    }
}
