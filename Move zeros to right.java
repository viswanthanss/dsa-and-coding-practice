import java.util.*; // For Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create scanner to read input
        
        int n = sc.nextInt(); // Read size of array
        int[] nums = new int[n]; // Create array
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); // Read each number into the array
        }

        int pos = 0; // Pointer to place non-zero numbers

        for (int i = 0; i < n; i++) { // Loop through all elements
            if (nums[i] != 0) { // If number is not zero
                nums[pos] = nums[i]; // Move it to the current 'pos'
                pos++; // Move 'pos' to next slot
            }
        }

        while (pos < n) { // Fill the remaining positions with 0
            nums[pos] = 0;
            pos++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " "); // Print the result
        }
    }
}
