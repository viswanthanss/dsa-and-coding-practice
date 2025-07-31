import java.util.*; // For Scanner class

public class SubarraySumBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take input

        int n = sc.nextInt(); // Read size of array
        int k = sc.nextInt(); // Read target sum

        int[] arr = new int[n]; // Create array to store n numbers

        // Read all elements into array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Input each number
        }

        int count = 0; // To store number of subarrays with sum = k

        // Outer loop - start of subarray
        for (int i = 0; i < n; i++) {
            int sum = 0; // Start new sum for each starting point

            // Inner loop - end of subarray
            for (int j = i; j < n; j++) {
                sum = sum + arr[j]; // Add current element to sum

                if (sum == k) { // If sum equals target, increase count
                    count = count + 1;
                }
            }
        }

        System.out.println(count); // Print final count
    }
}
