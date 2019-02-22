package JS3Praktikum;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class minMaxMain {
    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            ppArray[i] = new minMax();
            System.out.println("Nilai Array index ke-" + i);
            System.out.println("Masukkan nilai : ");
            ppArray[i].nilaiArray = sc.nextInt();
        }

        int min = ppArray[0].nilaiArray;
        int max = ppArray[0].nilaiArray;

        for (int i = 0; i < 5; i++) {
            if (ppArray[i].nilaiArray < min) {
                min = ppArray[i].nilaiArray;
            } else if (ppArray[i].nilaiArray > max) {
                max = ppArray[i].nilaiArray;
            }
        }
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal : " + min);
        System.out.println("Nilai Maksimal : " + max);
    }
}
