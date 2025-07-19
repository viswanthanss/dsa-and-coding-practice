import java.util.*; // Import Scanner to take input

public class Solution { // Class name as required by the problem
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create scanner to read input
        int n = sc.nextInt(); // Read the number from input
        int count = 0; // To count how many times we apply the rule

        while (n != 1) { // Keep going until n becomes 1
            System.out.println(n); // Print the current number

            if (n % 2 == 0) { // If number is even
                n = n / 2; // Divide it by 2
            } else {
                n = 3 * n + 1; // If number is odd, do 3n + 1
            }

            count++; // Increase step count
        }

        System.out.println(1); // Finally print 1 (last number)
        System.out.println(count); // Print how many steps it took
    }
}
