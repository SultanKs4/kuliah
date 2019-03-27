package StackTugas;

/**
 * @author Sultan
 * @see ReverseStack
 */
public class ReverseStack {
    int top = -1;
    String[] data = new String[256];

    public boolean IsEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public boolean IsFull() {
        if (top == data.length - 1)
            return true;
        else
            return false;
    }

    public void push(String dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("===================================");
            System.out.println("Isi Stack Penuh");
            System.out.println("===================================");
        }
    }

    public void tampilkan() {
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }
}