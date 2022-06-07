package 올바른괄호;

import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && s.charAt(i) == ')') {
                return false;
            } else if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return answer;
    }
}

