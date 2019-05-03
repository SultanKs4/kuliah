package Kuis2A;

import java.util.Scanner;

/**
 * @author Sultan
 * @see DoubleLinkedListMainMhs
 */
public class DoubleLinkedListMainMhs {
    static DoubleLinkedListMhs dll = new DoubleLinkedListMhs();
    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);
    static int nim, nilai, index;
    static String nama;

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
        System.out.println("7. Cetak Data\n8. Cari\n9. Bubble Sort Descending\n10. Keluar");
        System.out.println("================================");
        System.out.print(">> ");
        int piliihan = scan.nextInt();
        System.out.println("================================");

        String StringInput = "\nMasukan nama : ";
        String intInputNIM = "Masukan NIM : ";
        String intInput = "Masukan nilai : ";
        switch (piliihan) {
        case 1:
            System.out.print(StringInput);
            nama = scan1.nextLine();
            System.out.print(intInputNIM);
            nim = scan.nextInt();
            System.out.print(intInput);
            nilai = scan.nextInt();
            dll.addFirst(nama, nim, nilai);
            break;
        case 2:
            System.out.print(StringInput);
            nama = scan1.nextLine();
            System.out.print(intInputNIM);
            nim = scan.nextInt();
            System.out.print(intInput);
            nilai = scan.nextInt();
            dll.addLast(nama, nim, nilai);
            break;
        case 3:
            System.out.print(StringInput);
            nama = scan1.nextLine();
            System.out.print(intInputNIM);
            nim = scan.nextInt();
            System.out.print(intInput);
            nilai = scan.nextInt();
            System.out.print("Masukan Posisi indeks data : ");
            index = scan.nextInt();
            dll.add(nama, nim, nilai, index);
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
            System.out.println("\nPosisi : " + index + " dengan detail Mahasiswa : ");
            dll.print1ByPos(index);
            dll.remove(index);
            System.out.println("Telah terhapus");
            break;
        case 7:
            System.out.println();
            dll.print();
            break;
        case 8:
            System.out.print("\nMasukan nama yang ingin dicari : ");
            nama = scan1.nextLine();
            System.out.print("Masukan NIM yang ingin dicari : ");
            nim = scan.nextInt();
            System.out.print("Masukan nilai yang ingin dicari : ");
            nilai = scan.nextInt();
            System.out.println("Nama : " + nama);
            System.out.println("NIM : " + nim);
            System.out.println("Nilai : " + nilai);
            System.out.println("Ditemukan pada indeks ke : " + dll.getByKey(nama, nim, nilai));
            break;
        case 9:
            System.out.println("\nBubble Sort Descending");
            dll.bubbleSortDESC();
            System.out.println("Data telah tersorting secara DESCENDING");
            break;
        case 10:
            throw new Exception("Keluar");
        default:
            System.out.println("Data Invalid");
        }
        System.out.println();
    }
}