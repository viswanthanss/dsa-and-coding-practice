import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();  // Read full line to match platform input
        
        String compressed = "";
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed = compressed + s.charAt(i - 1) + count;
                count = 1;
            }
        }

        // Add last character group
        compressed = compressed + s.charAt(s.length() - 1) + count;

        if (compressed.length() >= s.length()) {
            System.out.print(s);  // Print without newline
        } else {
            System.out.print(compressed);
        }
    }
}





Approach 2: 
import java.util.*;  // Import scanner for input

public class Main {  // Main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create scanner object
        String s = sc.next();  // Read the input string (one word)

        String compressed = "";  // To store compressed string
        int count = 1;  // Start count at 1

        for (int i = 1; i < s.length(); i++) {  // Loop through string
            if (s.charAt(i) == s.charAt(i - 1)) {  // If same as previous
                count++;  // Increase count
            } else {
                compressed = compressed + s.charAt(i - 1) + count;  // Add char + count
                count = 1;  // Reset count for new char
            }
        }

        compressed = compressed + s.charAt(s.length() - 1) + count;  // Add last char + count

        if (compressed.length() >= s.length()) {  // If compressed not shorter
            System.out.print(s);  // Print original
        } else {
            System.out.print(compressed);  // Print compressed
            #code logic - https://chatgpt.com/share/685bb9cb-41e4-8010-b2db-fc62eb0ec3a1
        }
    }
}


