package SingleLinkedList;

import java.util.Scanner;

/**
 * @author Sultan
 * @see LinkedListTest
 */
public class LinkedListTest {
    static Scanner scan = new Scanner(System.in);
    static LinkedList data = new LinkedList();

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
        System.out.println("Menu : ");
        System.out.println("1. Tambah\n2. Hapus\n3. Cari\n4. Keluar");
        System.out.print("Masukkan Pilihan : ");
        int pilihMenu = scan.nextInt();
        System.out.println();
        switch (pilihMenu) {
        case 1:
            subMenuTambah();
            break;
        case 2:
            subMenuHapus();
            break;
        case 3:
            subMenuCari();
            break;
        case 4:
            throw new Exception("Keluar");
        default:
            System.out.println("Input tidak valid!");
            break;
        }
    }

    public static void subMenuTambah() throws Exception {
        System.out.println("Sub Menu Tambah : ");
        System.out.println("1. Tambah (First)\n2. Tambah (Index)\n3. Tambah (Key)\n4. Tambah (Last)");
        System.out.print("Masukkan Pilihan : ");
        int pilihSubMenu = scan.nextInt();
        switch (pilihSubMenu) {
        case 1:
            System.out.print("Masukkan Data yang akan ditambahkan : ");
            int item = scan.nextInt();
            data.addFirst(item);
            data.print();
            break;
        case 2:
            System.out.print("Masukkan Data yang akan ditambahkan : ");
            int item1 = scan.nextInt();
            System.out.print("Masukkan referensi Index : ");
            int index = scan.nextInt();
            data.add(item1, index);
            data.print();
            break;
        case 3:
            addKey();
            data.print();
            break;
        case 4:
            System.out.print("Masukkan Data yang akan ditambahkan : ");
            int item3 = scan.nextInt();
            data.addLast(item3);
            data.print();
            break;
        default:
            System.out.println("Input tidak valid!");
            break;
        }
    }

    public static void subMenuHapus() throws Exception {
        System.out.println("Sub Menu Hapus : ");
        System.out.println("1. Hapus (Index)\n2. Hapus (Key)\n3. Clear");
        System.out.print("Masukkan Pilihan : ");
        int pilihSubMenu = scan.nextInt();
        switch (pilihSubMenu) {
        case 1:
            System.out.print("Masukkan referensi Index : ");
            int index = scan.nextInt();
            data.remove(index);
            data.print();
            break;
        case 2:
            removeKey();
            data.print();
            break;
        case 3:
            System.out.println("Clear LinkedList");
            data.clear();
            data.print();
            break;
        default:
            System.out.println("Input tidak valid!");
            break;
        }
    }

    public static void subMenuCari() throws Exception {
        System.out.println("Sub Menu Cari : ");
        System.out.println("1. Cari (Index)\n2. Cari (Key)");
        System.out.print("Masukkan Pilihan : ");
        int pilihSubMenu = scan.nextInt();
        switch (pilihSubMenu) {
        case 1:
            System.out.print("Masukkan referensi Index : ");
            int index = scan.nextInt();
            System.out.println("Index " + index + " berisi data : " + data.get(index));
            break;
        case 2:
            System.out.print("Masukkan Data yang akan dicari : ");
            int item1 = scan.nextInt();
            System.out.println("Posisi data " + item1 + " : " + data.getKey(item1));
            break;
        default:
            System.out.println("Input tidak valid!");
            break;
        }
    }

    public static void addKey() throws Exception {
        System.out.print("Masukkan Nilai yang dicari : ");
        int cari = scan.nextInt();
        System.out.print("Masukkan Data yang akan ditambahkan : ");
        int dataInp = scan.nextInt();
        data.addKey(dataInp, cari);
    }

    public static void removeKey() throws Exception {
        System.out.print("Masukkan Nilai yang akan di Hapus : ");
        int item = scan.nextInt();
        data.removeKey(item);
    }
}