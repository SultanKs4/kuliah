package UTS;

import java.util.Scanner;

/**
 * swalayanMain
 */
public class swalayanMain {
    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);
    static swalayan[] objArr;

    public static void main(String[] args) {
        input();
        output();
        searching();
        sorting();
    }

    public static void input() {
        System.out.print("Jumlah Barang yang akan dimasukkan : ");
        int length = scan.nextInt();
        objArr = new swalayan[length];
        System.out.println("Masukkan data barang baru : \n");
        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = new swalayan();
            System.out.print("Kode Barang \t\t: ");
            objArr[i].kode_barang = scan.nextInt();
            System.out.print("Nama Barang \t\t: ");
            objArr[i].nama_barang = scan1.nextLine();
            System.out.print("Jumlah Barang di Toko \t: ");
            objArr[i].jumlah_barang_toko = scan.nextInt();
            System.out.print("Stok Barang di Gudang \t: ");
            objArr[i].stok_barang_gudang = scan.nextInt();
            System.out.println("======================");
        }
    }

    public static void output() {
        for (int i = 0; i < objArr.length; i++) {
            objArr[i].tampil();
        }
    }

    public static void sorting() {
        System.out.println("\nSorting Bubble Sort Descending");
        for (int i = 0; i < objArr.length; i++) {
            for (int j = 1; j < objArr.length - i; j++) {
                if (objArr[j].stok_barang_gudang > objArr[j - 1].stok_barang_gudang) {
                    swalayan temp = objArr[j];
                    objArr[j] = objArr[j - 1];
                    objArr[j - 1] = temp;
                }
            }
        }
        output();
    }

    public static void searching() {
        System.out.println("\nSearching Sequential Search");
        System.out.println("Masukkan Kode Barang yang dicari : ");
        int cari = scan.nextInt();
        int index = -1;
        for (int i = 0; i < objArr.length; i++) {
            if (cari == objArr[i].kode_barang) {
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("Kode Barang tidak ketemu di list data");
        else {
            System.out.println("Kode Barang ketemu di index ke-" + index + " dengan detail : ");
            objArr[index].tampil();
        }
    }
}