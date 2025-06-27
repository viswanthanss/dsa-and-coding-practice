import java.util.*;  // for Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // input reader

        int n = sc.nextInt();         // read size
        int[] arr = new int[n];       // create array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();    // read elements
        }

        int max_sum = arr[0];         // to store final answer
        int current_sum = arr[0];     // running sum

        for (int i = 1; i < n; i++) {
            current_sum = Math.max(arr[i], current_sum + arr[i]);  // choose better
            max_sum = Math.max(max_sum, current_sum);              // update max
        }

        System.out.print(max_sum);    // ✅ print only once, after loop
    }
}



