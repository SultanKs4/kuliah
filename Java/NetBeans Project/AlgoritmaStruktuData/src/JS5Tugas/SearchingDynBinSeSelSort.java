package JS5Tugas;

import java.util.Scanner;

/**
 * @author Sultan SearchingDynBinSeSelSort
 */
public class SearchingDynBinSeSelSort {
    static Scanner scanInt = new Scanner(System.in);
    static int[] data;
    static int cari, hasil;

    public static void main(String[] args) {
        input();
        SelectionSort(data);
        hasil = binarySearch(data, cari);
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

    public static void SelectionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[idxMin]) {
                    idxMin = j;
                }
            }
            int tmp = data[idxMin];
            data[idxMin] = data[i];
            data[i] = tmp;
        }
    }

    public static int binarySearch(int[] data, int cari) {
        int awal = 0, akhir = data.length - 1;
        while (awal <= akhir) {
            int tengah = awal + (akhir - awal) / 2;
            if (cari == data[tengah])
                return tengah;
            if (cari > data[tengah])
                awal = tengah + 1;
            else
                akhir = tengah - 1;
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