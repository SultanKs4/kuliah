package DoubleLinkedList;

/**
 * @author Sultan
 * @see DoubleLinkedListMain
 */
public class DoubleLinkedListMain {
    static DoubleLinkedList dll = new DoubleLinkedList();

    public static void main(String[] args) {
        try {
            Praktikum1();
            Praktikum2();
            Praktikum3();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Praktikum1() throws Exception {
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===================================");
        // dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
    }

    public static void Praktikum2() throws Exception {
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
    }

    public static void Praktikum3() throws Exception {
        System.out.println("Data pada awal Linked List adalah\t: " + dll.getFirst());
        System.out.println("Data pada akhir Linked List adalah\t: " + dll.getLast());
        System.out.println("Data yang diambil dari method get(int index) adalah\t: " + dll.get(0));
    }
}