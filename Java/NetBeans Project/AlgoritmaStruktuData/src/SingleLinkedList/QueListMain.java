package SingleLinkedList;

import java.util.Scanner;

/**
 * @author Sultan
 * @see QueListMain
 */
public class QueListMain {
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
        System.out.println("1. Enqueue\n2. Dequeue\n3. Cari\n4. Keluar");
        System.out.print("Masukkan Pilihan : ");
        int pilihMenu = scan.nextInt();
        System.out.println();
        switch (pilihMenu) {
        case 1:
            System.out.print("Masukkan Nama yang akan ditambahkan : ");
            String nama = scan1.nextLine();
            System.out.print("Masukkan Nim yang akan ditambahkan : ");
            int nim = scan.nextInt();
            data.addLast(nama, nim);
            System.out.println("ENQUEUE");
            data.print();
            break;
        case 2:
            data.removeFirst();
            System.out.println("DEQUEUE");
            data.print();
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
}