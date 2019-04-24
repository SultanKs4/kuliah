package DoubleLinkedList;

import java.util.Scanner;

/**
 * @author Sultan
 * @see DoubleLinkedListMaMenuin
 */
public class DoubleLinkedListMainMenu {
    static DoubleLinkedList dll = new DoubleLinkedList();
    static Scanner scan = new Scanner(System.in);
    static int data, index;

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
        System.out.println("7. Cetak Data\n8. Cari\n9. Bubble Sort Ascending\n10. Keluar");
        System.out.println("================================");
        System.out.print(">> ");
        int piliihan = scan.nextInt();
        System.out.println("================================");

        String StringInput = "\nMasukan data : ";
        switch (piliihan) {
        case 1:
            System.out.print(StringInput);
            data = scan.nextInt();
            dll.addFirst(data);
            break;
        case 2:
            System.out.print(StringInput);
            data = scan.nextInt();
            dll.addLast(data);
            break;
        case 3:
            System.out.print(StringInput);
            data = scan.nextInt();
            System.out.print("Masukan Posisi indeks data : ");
            index = scan.nextInt();
            dll.add(data, index);
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
            index = scan.nextInt();
            System.out.println("\nData posisi : " + index + " dengan detail data : " + dll.get(index));
            dll.remove(index);
            System.out.println("Telah terhapus");
            break;
        case 7:
            System.out.println();
            dll.print();
            break;
        case 8:
            System.out.print("\nMasukan data yang ingin dicari : ");
            data = scan.nextInt();
            System.out.println("Data : " + data + " ditemukan pada indeks ke : " + dll.getByKey(data));
            break;
        case 9:
            System.out.println("\nBubble Sort Ascending");
            dll.bubbleSortASC();
            System.out.println("Data telah tersorting secara ASCENDING");
            break;
        case 10:
            throw new Exception("Keluar");
        default:
            System.out.println("Data Invalid");
        }
        System.out.println();
    }
}