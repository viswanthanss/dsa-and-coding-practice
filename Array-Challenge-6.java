import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return; // Handle empty input
        int n = sc.nextInt();         

        int[] arr = new int[n];
        /*
                sc is the Scanner object, used to read input.
                
                hasNextInt() is a check:
                
                "Is there another integer value available to read?"
                
                It returns true if there's an integer to read, otherwise false.
                
                ✅ If input is present:
                Go ahead and read it safely.
                
                ❌ If input is missing (like user entered fewer than n values):
                Avoid reading and prevent Runtime Error.
        */
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                // Not enough input → handle gracefully
                System.out.println("No majority element found in the array");
                return;
            }
        }

        int candidate = arr[n / 2];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("The majority element is : " + candidate);
        } else {
            System.out.println("No majority element found in the array");
        }
    }
}
