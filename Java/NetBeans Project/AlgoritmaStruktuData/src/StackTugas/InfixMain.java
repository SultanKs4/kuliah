package StackTugas;

import java.util.Scanner;

/**
 * @author Sultan
 * @see InfixMain
 */
public class InfixMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input, output;
        System.out.print("Masukkan Ekspresi Postfix : ");
        input = scan.nextLine();
        input = input.trim();

        int size = input.length();
        Infix InfixConvert = new Infix(size);
        output = InfixConvert.convert(input);
        System.out.println("Infix : " + output);
    }
}