package JS5Tugas;

import java.util.Scanner;

/**
 * @author Sultan SearchingDynSequS
 */
public class SearchingDynSequS {
    static Scanner scanInt = new Scanner(System.in);
    static int[] data;
    static int cari, hasil;

    public static void main(String[] args) {
        input();
        hasil = SequentialSearch(data, cari);
        convertOutput();
    }

    public static void input() {
        System.out.print("Masukkan Jumlah Data : ");
        int nData = scanInt.nextInt();
        data = new int[nData];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Data ke-" + i + " : ");
            data[i] = scanInt.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari : ");
        cari = scanInt.nextInt();
    }

    public static int SequentialSearch(int[] data, int cari) {
        for (int i = 0; i < data.length; i++) {
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