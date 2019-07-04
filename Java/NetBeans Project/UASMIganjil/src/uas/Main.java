/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    static String nama;
    static int stok, stoklayu, idx = 0, idxCari;

    static void menu() {
        System.out.println("===================================================");
        System.out.println("                    TOKO BUAH                      ");
        System.out.println("===================================================");
        System.out.println("1. Buah Masuk");
        System.out.println("2. Buah Keluar");
        System.out.println("3. Update Buah Busuk");
        System.out.println("4. Lihat Daftar Buah");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan anda (1-5): ");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        Buah b;
        Scanner intScan = new Scanner(System.in);
        Scanner stringScan = new Scanner(System.in);

        // TODO: tambahkan buah

        while (true) {
            menu();
            int menu = intScan.nextInt();

            switch (menu) {
            case 1:
                // TODO: implementasi Buah Masuk
                System.out.print("Masukan Buah: ");
                nama = stringScan.nextLine();
                System.out.println("Stok");
                stok = intScan.nextInt();
                if (idx > 0) {
                    Node current = dll.head;
                    for (int i = 1; i < dll.size; i++) {
                        if (current.data.nama.equalsIgnoreCase(nama)) {
                            break;
                        }
                        current = current.next;
                    }
                    if (current.data.nama.equalsIgnoreCase(nama)) {
                        b = new Buah(dll.get(dll.size - 1).nama, stok, dll.get(dll.size - 1).jumlahBusuk);
                        dll.update(idxCari, b);
                    } else {
                        b = new Buah(nama, stok);
                        dll.add(idx, b);
                        idx += 1;
                    }
                } else {
                    b = new Buah(nama, stok);
                    dll.add(idx, b);
                    idx+=;
                }
                break;
            case 2:
                System.out.println("Index yang akan dihapus");
                idxCari = intScan.nextInt();
                dll.remove(idxCari - 1);
                // TODO: implementasi Buah Keluar
                break;
            case 3:
                dll.print();
                System.out.println("Masukkan kode buah");
                idxCari = intScan.nextInt();
                if (dll.get(idxCari - 1) != null) {
                    System.out.println("Masukkan stok busuk");
                    stoklayu = intScan.nextInt();
                    b = new Buah(dll.get(idxCari - 1).nama, dll.get(idxCari - 1).jumlahStok, stoklayu);
                    dll.update(idxCari, b);
                }

                // TODO: implementasi Update Buah Busuk
                break;
            case 4:
                dll.print();
                // TODO: implementasi Lihat Daftar Buah
                break;
            case 5:
                System.out.println("Out");
                // TODO: implementasi Keluar
                break;
            default:
                System.out.println("Pilihan menu 1 - 5");
            }
        }
    }
}
