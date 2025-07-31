import java.util.*; // For Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Read input from user
        String s = sc.nextLine(); // Read the input string

        StringBuilder sb = new StringBuilder(); // Used as a stack to store characters

        // Go through each character one by one
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i); // Get the current character

            // If last character in result is same as current, remove it
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == current) {
                sb.deleteCharAt(sb.length() - 1); // Remove last character
            } else {
                sb.append(current); // Otherwise, add current character
            }
        }

        System.out.println(sb.toString()); // Print final string after removing duplicates
    }
}


//https://chatgpt.com/share/688b14c7-10ec-8010-a348-3da8119e7428
