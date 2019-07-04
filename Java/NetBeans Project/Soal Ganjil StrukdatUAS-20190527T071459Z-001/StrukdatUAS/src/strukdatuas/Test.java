/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package strukdatuas;

/**
 *
 * @author rrism
 */
public class Test {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();

        dll.addFirst(new Buku(111, "Pemrograman", "Elex", 10, 0));
        dll.addLast(new Buku(112, "Database", "Elex", 20, 0));
        dll.addLast(new Buku(113, "Algoritma", "Andi", 7, 0));
        dll.addLast(new Buku(114, "Web Design", "Bandung", 15, 0));
        dll.addLast(new Buku(115, "Animasi 2D", "Andi", 5, 0));

        System.out.println("====================");
        dll.print();

        dll.removeLast();

        System.out.println("====================");
        dll.print();

        System.out.println();
        System.out.println("Data pertama: " + dll.getFirst().judul);
        System.out.println("Data terakhir: " + dll.getLast().judul);
        System.out.println("Data ke-2: " + dll.get(2).judul);

        // System.out.println("Buku dengan kode 114: " + dll.getByKode(114).judul);
    }
}
