import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If opening bracket, just push it
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If stack is empty, no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                // Get the last opening bracket from stack
                char last = stack.pop();

                // Check if this closing bracket matches the last opening bracket
                if (ch == ')' && last != '(') {
                    return false;
                }
                if (ch == '}' && last != '{') {
                    return false;
                }
                if (ch == ']' && last != '[') {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched; otherwise not valid
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
