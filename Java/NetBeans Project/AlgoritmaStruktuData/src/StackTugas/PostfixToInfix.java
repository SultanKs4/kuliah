package StackTugas;

/**
 * @author Sultan
 * @see PostfixToInfix
 */
public class PostfixToInfix {
    int top = -1, size;
    String[] stack;

    public PostfixToInfix(int total) {
        size = total;
        top = -1;
        stack = new String[size];
    }

    public void push(String c) {
        top++;
        stack[top] = c;
    }

    public String pop() {
        String item = stack[top];
        top--;
        return item;
    }

    public String convert(String input) {
        char c;
        for (int i = 0; i < stack.length; i++) {
            c = input.charAt(i);
            if (isOperator(c)) {
                String a = pop();
                String b = pop();
                push("(" + b + c + a + ")");
            } else if (isOperand(c))
                push("" + c);
        }
        return stack[top];
    }

    public boolean isOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.')
            return true;
        else
            return false;
    }

    public boolean isOperator(char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+')
            return true;
        else
            return false;
    }
}