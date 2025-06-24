import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Read input
        String input = sc.nextLine();           // Read entire line

        char[] s = input.toCharArray();         // Convert string to char array

        int left = 0;                           // Start pointer
        int right = s.length - 1;               // End pointer

        while (left < right) {                  // Loop until pointers meet
            char temp = s[left];                // Swap chars
            s[left] = s[right];
            s[right] = temp;

            left++;                              // Move pointers
            right--;
        }

        System.out.println(new String(s));      // Print reversed string
    }
}
