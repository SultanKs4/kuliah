package StackPraktikum1;

import java.util.Scanner;

/**
 * @author Sultan
 * @see TestStack
 */
public class TestStack {
    static int size, value, choice;
    static Scanner sc = new Scanner(System.in);
    static Stack tumpuk;

    public static void main(String[] args) {
        inputSizeStack();
        menu();
    }

    public static void inputSizeStack() {
        System.out.print("Masukkan ukuran Stack : ");
        size = sc.nextInt();

        tumpuk = new Stack(size);
    }

    public static void menu() {
        System.out.println("\n1. Tampilkan\n2. Push\n3. Pop\n4. Clear Stack");
        System.out.print("Pilihan : ");
        choice = sc.nextInt();
        System.out.println();
        if (choice == 1)
            tumpuk.tampilkan();
        else if (choice == 2)
            inputValueStack();
        else if (choice == 3)
            tumpuk.pop();
        else if (choice == 4)
            tumpuk.clearStack();
        else
            System.out.println("Input tidak valid");
        menu();
    }

    public static void inputValueStack() {
        System.out.print("Masukkan angka : ");
        value = sc.nextInt();
        tumpuk.push(value);
        menu();
    }
}