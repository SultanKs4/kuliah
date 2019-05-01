package BinaryTree;

import java.util.Scanner;

/**
 * @author Sultan
 * @see BinaryTreeArrayMain
 */
public class BinaryTreeArrayMain {
    static Scanner scan = new Scanner(System.in);
    static BinaryTreeArray bta;
    static int data, idxLast = 0;

    public static void main(String[] args) {
        try {
            System.out.print("Max Index Array : ");
            int max = scan.nextInt();
            bta = new BinaryTreeArray(max);
            while (true) {
                menu();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void menu() throws Exception {
        System.out.println("BINARY TREE ARRAY");
        System.out.println("1. Add\n2. Traverse InOrder\n3. Traverse PreOrder");
        System.out.println("4. Traverse PostOrder\n5. Keluar");
        System.out.println("================================");
        System.out.print(">> ");
        int pilihan = scan.nextInt();
        System.out.println("================================");
        switch (pilihan) {
        case 1:
            System.out.print("input array index ke-" + idxLast + " : ");
            data = scan.nextInt();
            bta.add(data, idxLast);
            idxLast++;
            break;
        case 2:
            bta.traverseInOrder(0);
            System.out.println();
            break;
        case 3:
            bta.traversePreOrder(0);
            System.out.println();
            break;
        case 4:
            bta.traversePostOrder(0);
            System.out.println();
            break;
        case 5:
            throw new Exception("Keluar");
        default:
            System.out.println("Input Invalid");
            break;
        }
        System.out.println();
    }
}