package JS5Tugas;

import java.util.Scanner;

/**
 * @author Sultan SeqSRight
 */
public class SeqSRight {
    static Scanner scanInt = new Scanner(System.in);
    static int[] data = { 6, 7, 3, 5, 1, 7, 9, 6, 5, 8 };
    static int cari, hasil;

    public static void main(String[] args) {
        input();
        hasil = SequentialSearch(data, cari);
        convertOutput();
    }

    public static void input() {
        System.out.println("Mencari posisi terkanan bilangan dalam array");
        System.out.print("Data : { ");
        for (int i = 0; i < data.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(data[i]);
        }
        System.out.println(" }");
        System.out.print("Masukkan nilai yang dicari : ");
        cari = scanInt.nextInt();
    }

    public static int SequentialSearch(int[] data, int cari) {
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == cari) {
                return i;
            }
        }
        return -1;
    }

    public static void convertOutput() {
        if (hasil == -1)
            System.out.println("Pencarian tidak ketemu");
        else
            System.out.println("Pencarian ketemu di index ke : " + hasil);
    }
}