package StackPraktikum1;

/**
 * @author Sultan
 * @see Stack
 */
public class Stack {
    int size, top = -1;
    int[] data;

    public Stack(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public boolean IsFull() {
        if (top == size - 1)
            return true;
        else
            return false;
    }

    public void push(int dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("===================================");
            System.out.println("Isi Stack Penuh");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            int a = data[top];
            top--;
            System.out.println("===================================");
            System.out.println("Data yang di Pop : " + a);
        } else {
            System.out.println("===================================");
            System.out.println("Tidak dapat Pop, Stack masih kosong");
        }
    }

    public void tampilkan() {
        System.out.println("===================================");
        System.out.println("Isi Stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println("[" + data[i] + "] ");
        }
        System.out.println("===================================");
    }

    public void clearStack() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }

            System.out.println("===================================");
            System.out.println("Stack Berhasil dikosongkan");
        } else {
            System.out.println("===================================");
            System.out.println("Tidak dapat Hapus, Stack Masih Kosong");
        }
    }
}