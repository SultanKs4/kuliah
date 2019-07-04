
//package StackPraktikum2;

import java.util.Scanner;

/**
 * @author Sultan
 * @see PostfixMain
 */
public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String P, Q;
        System.out.println("Masukkan Eskpresi : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix pf = new Postfix(total);
        P = pf.convert(Q);
        System.out.println("Postfix : \n" + P);
    }
}