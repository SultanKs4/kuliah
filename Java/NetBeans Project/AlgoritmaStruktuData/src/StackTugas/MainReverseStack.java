package StackTugas;

import java.util.Scanner;

/**
 * @author Sultan
 * @see MainReverseStack
 */
public class MainReverseStack {
    static Scanner sc = new Scanner(System.in);
    static ReverseStack Obj = new ReverseStack();
    static String input;

    public static void main(String[] args) {
        input();
        reverse(input);
        output();
    }

    public static void input() {
        System.out.print("Masukkan Kalimat : ");
        input = sc.nextLine();
    }

    public static void reverse(String input) {
        String[] split = input.trim().split("\\s+");
        for (String data : split)
            Obj.push(data);
    }

    public static void output() {
        System.out.print("Kalimat dibalik : ");
        Obj.tampilkan();
    }
}