package com.stack;

import java.util.Stack;

public class InfixToPostfix {
    public static String convertToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c); // Append operands directly to result
            } else if (c == '(') {
                stack.push(c); // Push '(' to stack
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop()); // Pop until '(' is found
                }
                stack.pop(); // Remove '('
            } else { // Operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()); // Append remaining operators
        }

        return result.toString();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        String expression = "(a+b)*(c+d)";
        System.out.println("Postfix Expression: " + convertToPostfix(expression)); // Output: "ab+cd+*"
    }
}
