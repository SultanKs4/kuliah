package JS3Praktikum;

import java.util.Scanner;
import static JS3Praktikum.minMax.max_min;

/**
 *
 * @author Sultan
 */
public class MaxminMain {
    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5];
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            ppArray[i] = new minMax();
            System.out.println("Nilai Array index ke-" + i);
            System.out.print("Masukkan nilai : ");
            ppArray[i].nilaiArray = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            arr[i] = ppArray[i].nilaiArray;
        }
        Maxmin hasil = new Maxmin();

        max_min(arr, 0, 4, hasil);

        System.out.println("\nDivide Conquer");
        System.out.println("Nilai Minimal : " + hasil.minimum + "\nNilai Maksimal : " + hasil.maximum);
        System.out.println();
        if (sc != null) {
            sc.close();
        }
    }
}
