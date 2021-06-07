import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (char value : c) {
            if (value == '(' || value == '[' || value == '{') stack.push(value);
            else if (stack.isEmpty() || value == ')' && stack.peek() != '(' 
                    || value == ']' && stack.peek() != '['
                    || value == '}' && stack.peek() != '{') {
                return false;
            } else
                stack.pop();
        }
        return stack.isEmpty();
    }
}
//3ms 38.2mb
