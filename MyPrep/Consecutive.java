import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read input

        int input1 = sc.nextInt(); // Read the size of the array

        int[] input2 = new int[input1]; // Declare array

        // Read array elements
        for (int i = 0; i < input1; i++) {
            input2[i] = sc.nextInt();
        }

        Arrays.sort(input2); // Sort the array

        // Check if all elements are consecutive
        for (int i = 0; i < input1 - 1; i++) {
            if (input2[i + 1] != input2[i] + 1) {
                System.out.println("0"); // Not consecutive
                return; // Exit early
            }
        }

        System.out.println("1"); // All are consecutive if and only if
    }
}
