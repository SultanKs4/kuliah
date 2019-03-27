package StackTugas;

/**
 * @author Sultan
 * @see Infix
 */
public class Infix {
    int top = -1, size;
    String[] stack;

    public Infix(int total) {
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

    public String get() {
        return stack[top];
    }

    public String convert(String input) {
        char c;
        for (int i = 0; i < stack.length; i++) {
            c = input.charAt(i);
            if (isOperator(c)) {
                String b = pop();
                String a = pop();
                push("(" + a + c + b + ")");
            } else if (isOperand(c))
                push("" + c);
        }
        return get();
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