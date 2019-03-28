package StackTugas;

import java.util.Scanner;

/**
 * @author Sultan
 * @see PrefixMain
 */
public class PrefixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String P, Q;
        System.out.println("Masukkan Eskpresi : ");
        Q = sc.nextLine();
        Q = Q.trim();

        Prefix pf = new Prefix();
        pf.n = Q.length();
        P = pf.convert(Q);
        System.out.println("Prefix : " + P);
    }
}