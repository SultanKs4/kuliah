package JS4Tugas;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static Scanner s1 = new Scanner(System.in);
    public static int[] jumlahArr;

    public static void main(String[] args) {
        KeranjangBelanja data = new KeranjangBelanja();
        int jmlBarang = 4;

        for (int i = 0; i < jmlBarang; i++) {
            System.out.print("Nama : ");
            String nama = s1.nextLine();
            System.out.print("Jumlah : ");
            int jumlah = s.nextInt();
            System.out.print("Harga Satuan : ");
            int hargaSatuan = s.nextInt();
            System.out.println("-------------------");

            Barang brg = new Barang(nama, jumlah, hargaSatuan);
            data.tambah(brg);
        }
        System.out.println("Data barang sebelum sorting");
        data.tampil();
        System.out.println("Data barang setelah sorting ASC berdasarkan harga Satuan menggunakan Bubble Sort");
        data.bubbleSort();
        data.tampil();
        System.out.println("Data barang setelah sorting ASC berdasarkan harga Total menggunakan Selection Sort");
        data.selectionSort();
        data.tampil();
        System.out.println("Data barang setelah sorting ASC berdasarkan jumlah menggunakan Merge Sort");
        data.mergeSort(0, data.listBarang.length - 1);
        data.tampil();
    }
}
