import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Input reader
        char ch = sc.next().charAt(0);         // Read a single character

        // Check if it's an alphabet (A-Z or a-z)
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            // Convert to lowercase to simplify vowel check
            char lowerCh = Character.toLowerCase(ch);

            // Check for vowel
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
