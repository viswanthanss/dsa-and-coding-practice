// Can we make input2 using letters from input1?

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        for (int i = 0; i < input2.length(); i++)
            if (!input1.contains("" + input2.charAt(i))) {
                System.out.println("no");
                return;
            } else
            {
                // input1 = input1.replaceFirst("" + input2.charAt(i), "");
                char ch = input2.charAt(i);       // Get one letter from input2
                String letter = String.valueOf(ch); // Convert character to string
                input1 = input1.replaceFirst(letter, ""); // Remove first time it appears
            }
        System.out.println("yes");
    }
}


