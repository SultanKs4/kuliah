package JS3Praktikum;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class minMaxNewMain {
    public static minMax[] ppArray = new minMax[5];
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        output();
    }

    public static void input() {
        for (int i = 0; i < 5; i++) {
            ppArray[i] = new minMax();
            System.out.println("Nilai Array index ke-" + i);
            System.out.print("Masukkan nilai : ");
            ppArray[i].nilaiArray = scan.nextInt();
        }
    }

    public static void output() {

    }
}
