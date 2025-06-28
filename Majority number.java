 // majority element exists (> n/2 times)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);                // Sorting the array
        int max_no = arr[n / 2];         // Middle element is majority
        System.out.println(max_no);      // Print it once
    }
}
