import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();             // Read number of elements
        int[] arr = new int[n];           // Original array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();        // Input array elements
        }

        int[] result = new int[n];        // To store updated values

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[i] = arr[i + 1] * 1;
            } else if (i == n - 1) {
                result[i] = arr[i - 1] * arr[i];
            } else {
                result[i] = arr[i - 1] * arr[i + 1];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
