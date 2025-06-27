import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      // to read input
        String number = sc.next();                // read input as string

        // reverse the string manually (works for 3-digit number)
        String reversed = "" + number.charAt(2) + number.charAt(1) + number.charAt(0);

        System.out.println(reversed);             // print the reversed number
    }
}

-----------------------------------------------------------------------------------------

Approach 2 (Works for Any Digit Count)

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // read input
        String number = sc.next();                 // read number as string

        String reversed = "";                      // empty string to store reversed number

        // loop from last character to first
        for (int i = number.length() - 1; i >= 0; i--) {
            reversed += number.charAt(i);          // add each char in reverse order
        }

        System.out.println(reversed);              // print the reversed number
    }
}
