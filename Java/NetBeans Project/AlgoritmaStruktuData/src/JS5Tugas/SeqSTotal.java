package JS5Tugas;

import java.util.Scanner;

/**
 * @author Sultan SeqSTotal
 */
public class SeqSTotal {
    static Scanner scanInt = new Scanner(System.in);
    static int[] data = { 6, 7, 3, 5, 1, 7, 9, 6, 5, 8 };
    static int cari, hasil, sum;

    public static void main(String[] args) {
        input();
        SequentialSearch(data, cari);
        convertOutput();
    }

    public static void input() {
        System.out.println("Menghitung jumlah suatu bilangan dalam array");
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

    public static void SequentialSearch(int[] data, int cari) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                sum += 1;
            }
        }
    }

    public static void convertOutput() {
        if (sum == 0)
            System.out.println("Pencarian tidak ketemu");
        else
            System.out.println("Pencarian nilai " + cari + " dalam array ada : " + sum);
    }
}