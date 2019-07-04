
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ;

import java.util.Scanner;

/**
 *
 * @author rrism
 */
public class MainProgram {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        boolean lagi = true;
        int pilihan, kode, jumlahStok, jumlahRusak, index = 0, idxCari;
        String judul, penerbit;

        DoubleLinkedList dll = new DoubleLinkedList();
        Buku buku;

        while (lagi) {
            System.out.println("=============================================");
            System.out.println("Pilih Menu:");
            System.out.println("1. Buku Masuk");
            System.out.println("2. Buku Keluar");
            System.out.println("3. Buku Rusak");
            System.out.println("4. Tampilkan semua data");
            System.out.println("5. Cari buku");
            System.out.println("6. Exit");

            System.out.print("Masukkan pilihan menu: ");
            pilihan = scInt.nextInt();
            System.out.println("=============================================");

            if (pilihan == 1) {
                System.out.print("Kode: ");
                kode = scInt.nextInt();
                System.out.print("Judul: ");
                judul = scString.nextLine();
                System.out.print("Penerbit: ");
                penerbit = scString.nextLine();
                System.out.print("Jumlah Stok: ");
                jumlahStok = scInt.nextInt();
                System.out.print("Jumlah Rusak: ");
                jumlahRusak = scInt.nextInt();
                buku = new Buku(kode, judul, penerbit, jumlahStok, jumlahRusak);
                dll.add(buku, index);
                index++;
            } else if (pilihan == 2) {
                System.out.println("index\tkode\tjudul\tpenerbit\tJumlah Stok\tJumlah Stok Rusak");
                dll.print();
                System.out.print("Index yang dicari: ");
                idxCari = scInt.nextInt();
                System.out.println("Jumlah Stok baru : ");
                jumlahStok = scInt.nextInt();
                Buku a = dll.get(idxCari);
                buku = new Buku(a.kode, a.judul, a.penerbit, jumlahStok, a.jumlahRusak);
                dll.remove(idxCari);
                dll.add(buku, idxCari);
            } else if (pilihan == 3) {
                System.out.println("index\tkode\tjudul\tpenerbit\tJumlah Stok\tJumlah Stok Rusak");
                dll.print();
                System.out.print("Index yang dicari: ");
                idxCari = scInt.nextInt();
                System.out.println("Jumlah Stok Rusak baru : ");
                jumlahRusak = scInt.nextInt();
                Buku a = dll.get(idxCari);
                buku = new Buku(a.kode, a.judul, a.penerbit, a.jumlahStok, jumlahRusak);
                dll.remove(idxCari);
                dll.add(buku, idxCari);
            } else if (pilihan == 4) {
                System.out.println("index\tkode\tjudul\tpenerbit\tJumlah Stok\tJumlah Stok Rusak");
                dll.print();
            } else if (pilihan == 5) {
                System.out.println("kode buku yang ingin dicari:");
                kode = scInt.nextInt();
                Buku a = dll.get(dll.size - 1);
                if (a.kode == kode) {
                    System.out.println("index\tkode\tjudul\tpenerbit\tJumlah Stok\tJumlah Stok Rusak");
                    System.out.print(a.judul + "\t" + a.penerbit + "\t");
                    System.out.print(a.jumlahStok + "\t" + a.jumlahRusak + "\t");
                    System.out.println();
                }
            } else {
                lagi = false;
            }
        }
    }
}
