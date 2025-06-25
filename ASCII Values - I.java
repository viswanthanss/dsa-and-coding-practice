// ✅ Problem Summary
// You need to:

// Take a single character as input

// Print its ASCII value (i.e., the integer code for that character)


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Create Scanner object to read input
        char ch = sc.next().charAt(0);              // Read one character from input
        int ascii = (int) ch;                       // Convert character to its ASCII value
        System.out.println(ascii);                  // Print ASCII value
    }
}
