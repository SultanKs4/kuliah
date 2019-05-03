package Kuis2A;

import java.util.Scanner;

/**
 * @author Sultan
 * @see BinaryTreeArrayMain
 */
public class BinaryTreeArrayMain {
    static Scanner scan = new Scanner(System.in);
    static BinaryTreeArray bta;
    static int dataVar, max;

    public static void main(String[] args) {
        max = 25;
        int data[] = { 25, 20, 36, 10, 22, 30, 40, 5, 12, 0, 0, 28, 0, 38, 48, 1, 8, 0, 15, 0, 0, 0, 0, 45, 50 };
        int lastIdx = 24;
        bta = new BinaryTreeArray(max);
        bta.populateData(data, lastIdx);
        // System.out.println("Leaf dari binary tree adalah : ");
        // bta.getLeaf();
        System.out.print("Size dari BinaryTree adalah : " + bta.getSize());
        System.out.println();
        System.out.print("cari sibling dari data : ");
        dataVar = scan.nextInt();
        bta.getSibling(dataVar);
    }
}