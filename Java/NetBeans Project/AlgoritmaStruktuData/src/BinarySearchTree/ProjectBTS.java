package BinarySearchTree;

import java.util.Scanner;

/**
 * @author Sultan
 * @see ProjectBTS
 */
public class ProjectBTS {
    static BinarySearchTree b = new BinarySearchTree();
    static Scanner scan = new Scanner(System.in);
    static int data;

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    public static void menu() {
        System.out.println("MENU BINARY SEARCH TREE");
        System.out.println("1. Insert\n2. Delete\n3. Find");
        System.out.println("4. Display\n5. Keluar");
        System.out.println("==============================");
        System.out.print(">> ");
        int pilihan = scan.nextInt();
        System.out.println("==============================");
        switch (pilihan) {
        case 1:
            System.out.print("Masukkan data : ");
            data = scan.nextInt();
            b.insert(data);
            break;
        case 2:
            System.out.print("Masukkan data : ");
            data = scan.nextInt();
            b.delete(data);
            break;
        case 3:
            System.out.print("Masukkan data : ");
            data = scan.nextInt();
            System.out.println("Cek apakah node " + data + " ada : " + b.find(data));
            break;
        case 4:
            System.out.println("Cetak tree dengan metode in order : ");
            b.display(b.root);
            System.out.println();
            break;
        case 5:
            System.exit(0);
            break;
        default:
            System.out.println("Input tidak valid!");
            break;
        }
        System.out.println();
    }
}