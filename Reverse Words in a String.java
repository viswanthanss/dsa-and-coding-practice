import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create scanner
        String s = sc.nextLine();             // Read the input line

        s = s.trim();                         // Remove extra spaces at start and end

        String[] words = s.split("\\s+");     // Split by one or more spaces

        StringBuilder sb = new StringBuilder();  // For building the reversed string

        for (int i = words.length - 1; i >= 0; i--) {  // Loop from last word
            sb.append(words[i]);                        // Add the word
            if (i != 0) {                               // If not the last word
                sb.append(" ");                         // Add a space after the word
            }
        }

        System.out.println(sb.toString());              // Print the final result
    }
}
