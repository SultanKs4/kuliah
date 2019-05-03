package Kuis2B;

import java.util.Scanner;

/**
 * @author Sultan
 * @see BinaryTreeArrayMain
 */
public class BinaryTreeArrayMain {
    static Scanner scan = new Scanner(System.in);
    static BinaryTreeArray bta;
    static int data, max;

    public static void main(String[] args) {
        try {
            System.out.print("Length Array : ");
            max = scan.nextInt();
            bta = new BinaryTreeArray(max);
            bta.add(25);
            bta.add(20);
            bta.add(36);
            bta.add(10);
            bta.add(22);
            bta.add(30);
            bta.add(40);
            bta.add(5);
            bta.add(12);
            bta.add(0);
            bta.add(0);
            bta.add(28);
            bta.add(0);
            bta.add(38);
            bta.add(48);
            bta.add(1);
            bta.add(8);
            bta.add(0);
            bta.add(15);
            bta.add(0);
            bta.add(0);
            bta.add(0);
            bta.add(0);
            bta.add(45);
            bta.add(50);
            System.out.print("cari parent dari data : ");
            int data = scan.nextInt();
            bta.getParent(data);
            System.out.println("cari child dari data : ");
            int data1 = scan.nextInt();
            bta.getChild(data1);
            System.out.println("cari sibling dari data : ");
            int data2 = scan.nextInt();
            bta.getSibling(data2);
            bta.getHeight();
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
            if (bta.idxLast + 1 >= max)
                System.out.println("Array Full");
            else {
                System.out.print("input array index ke-" + (bta.idxLast + 1) + " : ");
                data = scan.nextInt();
                bta.add(data);
            }
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