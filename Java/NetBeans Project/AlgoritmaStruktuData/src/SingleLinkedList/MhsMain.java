package SingleLinkedList;

import java.util.Scanner;

/**
 * @author Sultan
 * @see MhsMain
 */
public class MhsMain {
    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);
    static LinkedListMhs data = new LinkedListMhs();

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
            System.out.print("Masukkan Nama yang akan ditambahkan : ");
            String nama = scan1.nextLine();
            System.out.print("Masukkan Nim yang akan ditambahkan : ");
            int nim = scan.nextInt();
            data.addFirst(nama, nim);
            data.print();
            break;
        case 2:
            System.out.print("Masukkan Nama yang akan ditambahkan : ");
            String nama1 = scan1.nextLine();
            System.out.print("Masukkan Nim yang akan ditambahkan : ");
            int nim1 = scan.nextInt();
            System.out.print("Masukkan Index baru : ");
            int index = scan.nextInt();
            data.add(nama1, nim1, index);
            data.print();
            break;
        case 3:
            addKey();
            data.print();
            break;
        case 4:
            System.out.print("Masukkan Nama yang akan ditambahkan : ");
            String nama2 = scan1.nextLine();
            System.out.print("Masukkan Nim yang akan ditambahkan : ");
            int nim2 = scan.nextInt();
            data.addLast(nama2, nim2);
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
            System.out.println("Index " + index + " berisi data : ");
            data.print1ByPos(data.get(index));
            break;
        case 2:
            System.out.print("Masukkan NIM yang akan dicari : ");
            int item1 = scan.nextInt();
            data.print1ByPos(data.getKey(item1));
            System.out.println("Posisi : " + data.getKey(item1));
            break;
        default:
            System.out.println("Input tidak valid!");
            break;
        }
    }

    public static void addKey() throws Exception {
        System.out.print("Masukkan NIM yang dicari : ");
        int cari = scan.nextInt();
        System.out.print("Masukkan Nama yang akan ditambahkan : ");
        String nama = scan1.nextLine();
        System.out.print("Masukkan Nim yang akan ditambahkan : ");
        int nim = scan.nextInt();
        data.addKey(nama, nim, cari);
    }

    public static void removeKey() throws Exception {
        System.out.print("Masukkan NIM yang akan di Hapus : ");
        int nim = scan.nextInt();
        data.removeKey(nim);
    }
}