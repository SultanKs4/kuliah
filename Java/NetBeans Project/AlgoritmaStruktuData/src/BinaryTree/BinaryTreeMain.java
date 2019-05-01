package BinaryTree;

import java.util.Scanner;

/**
 * @author Sultan
 * @see BinaryTreeMain
 */
public class BinaryTreeMain {
    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);
    static BinaryTree bt = new BinaryTree();
    static int data;

    public static void main(String[] args) {
        try {
            while (true)
                menu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void menu() throws Exception {
        System.out.println("BINARY TREE MENU");
        System.out.println("1. Add\n2. Delete\n3. Find\n4. Traverse inOrder");
        System.out.println("5. Traverse preOrder\n6. Traverse postOrder\n7. Keluar");
        System.out.println("================================");
        System.out.print(">> ");
        int pilihan = scan.nextInt();
        System.out.println("================================");

        switch (pilihan) {
        case 1:
            System.out.print("Masukkan data : ");
            data = scan.nextInt();
            bt.addRecursive(data);
            break;
        case 2:
            System.out.print("Masukkan data : ");
            data = scan.nextInt();
            bt.delete(data);
            break;
        case 3:
            System.out.print("Masukkan data : ");
            data = scan.nextInt();
            System.out.println("Find : " + bt.find(data));
            break;
        case 4:
            bt.traverseInOrder(bt.root);
            System.out.println();
            break;
        case 5:
            bt.traversePreOrder(bt.root);
            System.out.println();
            break;
        case 6:
            bt.traversePostOrder(bt.root);
            System.out.println();
            break;
        case 7:
            throw new Exception("Keluar");
        default:
            System.out.println("Input Invalid");
            break;
        }
        System.out.println();
    }
}