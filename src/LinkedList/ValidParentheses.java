package LinkedList;

import java.util.LinkedList;

public class ValidParentheses {

    public boolean isValid(String s) {
        int n = s.length();
        // Using LinkedList as a Stack
        LinkedList<Character> stack = new LinkedList<Character>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // If it's an opening bracket, push to stack
            if (c == '(' || c == '[' || c == '{') {
                stack.addLast(c);
            }
            else {
                // If it's a closing bracket but stack is empty, it's invalid
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the last element (LIFO)
                char top = stack.removeLast();

                // Check if the popped element matches the current closing bracket
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }

        // If stack is empty, all brackets were matched. If not, there are leftovers.
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        ValidParentheses solution = new ValidParentheses();

        // Test Case 1: Valid
        String s1 = "()[]{}";
        System.out.println("Input: " + s1 + " -> Valid? " + solution.isValid(s1));

        // Test Case 2: Invalid (Wrong type)
        String s2 = "(]";
        System.out.println("Input: " + s2 + " -> Valid? " + solution.isValid(s2));

        // Test Case 3: Invalid (Unclosed)
        String s3 = "([)]";
        System.out.println("Input: " + s3 + " -> Valid? " + solution.isValid(s3));

        // Test Case 4: Invalid (Empty stack scenario)
        String s4 = "]";
        System.out.println("Input: " + s4 + " -> Valid? " + solution.isValid(s4));
    }
}