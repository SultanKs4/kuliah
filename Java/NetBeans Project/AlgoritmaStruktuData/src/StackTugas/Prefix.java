package StackTugas;

import java.util.Stack;

/**
 * @author Sultan
 * @see Prefix
 */
public class Prefix {
    int n, top = -1;
    Stack<Character> stack = new Stack<Character>();

    public String convert(String Q) {
        String P = "", Temp = "";
        char c;
        for (int i = Q.length() - 1; i >= 0; i--) {
            c = Q.charAt(i);
            if (isOperand(c))
                Temp += c;
            else if (c == ')')
                stack.push(c);
            else if (c == '(') {
                while (stack.peek() != ')')
                    Temp += stack.pop();
                stack.pop();
            } else {
                if (!stack.empty() && !(stack.peek() == ')') && presedence(c) <= presedence(stack.peek()))
                    Temp += stack.pop();
                stack.push(c);
            }
        }
        while (!stack.empty()) {
            Temp += stack.pop();
        }
        for (int i = Temp.length() - 1; i >= 0; i--) {
            P += Temp.charAt(i);
        }
        return P;
    }

    public boolean isOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.')
            return true;
        else
            return false;
    }

    public int presedence(char c) {
        if (c == '^')
            return 3;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        return 0;
    }
}