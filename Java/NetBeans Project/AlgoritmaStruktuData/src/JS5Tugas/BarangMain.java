package JS5Tugas;

import java.util.Scanner;

/**
 * @author Sultan BarangMain
 */
public class BarangMain {
    public static Scanner scanInt = new Scanner(System.in);
    public static Scanner scanLine = new Scanner(System.in);
    public static Barang[] ObjArr;
    public static int nBCari;

    public static void main(String[] args) {
        input();
        output();
    }

    public static void input() {
        System.out.print("Masukkan jumlah barang : ");
        int nData = scanInt.nextInt();
        System.out.println();
        ObjArr = new Barang[nData];

        for (int i = 0; i < ObjArr.length; i++) {
            ObjArr[i] = new Barang();
            System.out.print("Nama\t\t: ");
            ObjArr[i].nama = scanLine.nextLine();
            System.out.print("No Barang\t: ");
            ObjArr[i].noBarang = scanInt.nextInt();
            System.out.print("Stok\t\t: ");
            ObjArr[i].stok = scanInt.nextInt();
            System.out.print("Harga\t\t: ");
            ObjArr[i].harga = scanInt.nextInt();
            System.out.println("-----------------------------");
        }

        bubbleSort();
        System.out.println("\nData yang sudah diurutkan\n");
        for (int i = 0; i < ObjArr.length; i++)
            ObjArr[i].output();

        System.out.print("\nMasukkan No. Barang yang ingin dicari : ");
        nBCari = scanInt.nextInt();
    }

    public static void output() {
        int hasil = binarySearch(nBCari);

        if (hasil == -1) {
            System.out.println("\nNo. Barang tidak ditemukan");
        } else {
            System.out.println("\nNo. Barang ditemukan pada index ke-" + hasil + " dengan detail :");
            ObjArr[hasil].output();
        }
    }

    public static void bubbleSort() {
        for (int i = 0; i < ObjArr.length - 1; i++) {
            for (int j = 1; j < ObjArr.length - i; j++) {
                if (ObjArr[j].noBarang < ObjArr[j - 1].noBarang) {
                    Barang tmp = ObjArr[j];
                    ObjArr[j] = ObjArr[j - 1];
                    ObjArr[j - 1] = tmp;
                }
            }
        }
    }

    public static int binarySearch(int cari) {
        int awal = 0, akhir = ObjArr.length - 1;
        while (awal <= akhir) {
            int tengah = awal + (akhir - awal) / 2;
            if (cari == ObjArr[tengah].noBarang)
                return tengah;
            if (cari > ObjArr[tengah].noBarang)
                awal = tengah + 1;
            else
                akhir = tengah - 1;
        }
        return -1;
    }
}