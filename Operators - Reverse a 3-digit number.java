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
