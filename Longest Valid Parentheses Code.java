import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // base index
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);  // store index of '('
            } else {
                stack.pop();    // match with previous '('
                if (stack.isEmpty()) {
                    stack.push(i);  // reset base when no match
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        System.out.println(maxLength);
    }
}
