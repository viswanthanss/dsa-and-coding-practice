import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ✅ Create Scanner for input

        int input1 = sc.nextInt();           // ✅ Read the size of the array

        int[] input2 = new int[input1];      // ✅ Declare array properly

        // ✅ Take array input from user
        for (int i = 0; i < input1; i++) {
            input2[i] = sc.nextInt();
        }

        int input3 = sc.nextInt();           // ✅ Number of positions to rotate

        int[] arr = new int[input1];         // ✅ New array for rotated result

        int j = 0; // index for result array

        // ✅ Copy elements from input3 to end
        for (int i = input3; i < input1; i++) {
            arr[j++] = input2[i];
        }
        
        /*
        Because we want to fill values in the new array (arr) from left to right.

So after writing to arr[0], we must write to arr[1], then arr[2], and so on.

If we don’t increase j, we will keep writing to the same spot (e.g., arr[0] again and again) — and we will lose data.
        
        */ 

        // ✅ Copy first part (0 to input3-1)
        for (int i = 0; i < input3; i++) {
            arr[j++] = input2[i];
        }

        // ✅ Print the result array
        for (int i = 0; i < input1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
