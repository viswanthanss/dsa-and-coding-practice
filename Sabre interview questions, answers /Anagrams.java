import java.util.*; // For Scanner and Arrays

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // For input

        // Input the array of strings
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Input the target string to compare anagrams with
        String s = sc.nextLine(); // Example: "eat"

        // Sort the target string (this becomes the reference)
        char[] targetArr = s.toCharArray(); // Convert to char array
        Arrays.sort(targetArr); // Sort the array
        String sortedTarget = new String(targetArr); // Convert back to string

        // Go through each word in the array
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i]; // Get current word

            char[] wordArr = word.toCharArray(); // Convert word to char array
            Arrays.sort(wordArr); // Sort the characters
            String sortedWord = new String(wordArr); // Back to string

            // Compare sorted word with sorted target
            if (sortedWord.equals(sortedTarget)) {
                System.out.print(word + " "); // Print if it's an anagram
            }
        }
    }
}


// Sample Input:
//   eat
