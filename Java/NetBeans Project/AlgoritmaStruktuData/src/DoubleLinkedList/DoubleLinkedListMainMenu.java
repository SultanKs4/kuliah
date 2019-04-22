package DoubleLinkedList;

import java.util.Scanner;

/**
 * @author Sultan
 * @see DoubleLinkedListMaMenuin
 */
public class DoubleLinkedListMainMenu {
    static DoubleLinkedList dll = new DoubleLinkedList();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            while (true) {
                menu();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void menu() throws Exception {
        System.out.println("DOUBLE LINK LIST DENGAN MENU");
        System.out.println("================================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah Awal\n2. Tambah Akhir\n3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal\n5. Hapus Akhir\n6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data\n8. Cari\n9. Keluar");
        System.out.println("================================");
        System.out.print(">>");
        int piliihan = scan.nextInt();
        System.out.println("================================");

        String StringInput = "\nMasukan data : ";
        switch (piliihan) {
        case 1:
            System.out.print(StringInput);
            int data = scan.nextInt();
            dll.addFirst(data);
            break;
        case 2:
            System.out.print(StringInput);
            int data1 = scan.nextInt();
            dll.addLast(data1);
            break;
        case 3:
            System.out.print(StringInput);
            int data2 = scan.nextInt();
            System.out.print("Masukan Posisi indeks data : ");
            int index = scan.nextInt();
            dll.add(data2, index);
            break;
        case 4:
            dll.removeFirst();
            System.out.println("\nData awal telah terhapus");
            break;
        case 5:
            dll.removeLast();
            System.out.println("\nData akhir telah terhapus");
            break;
        case 6:
            System.out.print("Masukan Posisi indeks data yang akan dihapus : ");
            int index1 = scan.nextInt();
            System.out.println("\nData posisi : " + index1 + " dengan detail data : " + dll.get(index1));
            dll.remove(index1);
            System.out.println("Telah terhapus");
            break;
        case 7:
            System.out.println();
            dll.print();
            break;
        case 8:
            System.out.println("\nMasukan data yang ingin dicari : ");
            int data3 = scan.nextInt();
            System.out.println("Data : " + data3 + " ditemukan pada indeks ke : " + dll.getByKey(data3));
            break;
        case 9:
            throw new Exception("Keluar");
        default:
            System.out.println("Data Invalid");
        }
    }
}