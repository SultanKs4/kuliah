package BinarySearchTree;

/**
 * @author Sultan
 * @see ProjectBTS
 */
public class ProjectBTS {
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(3);
        b.insert(8);
        b.insert(1);
        b.insert(4);
        b.insert(6);
        b.insert(2);
        b.insert(10);
        b.insert(9);
        b.insert(20);
        b.insert(25);
        b.insert(15);
        b.insert(16);
        System.out.println("Cek apakah ada node 4  : " + b.find(4));
        System.out.println("Cek apakah ada node 99 : " + b.find(99));
        System.out.println("Cetak tree dengan metode in order : ");
        b.display(b.root);
        System.out.println();
        System.out.println("Hapus node tanpa child (2) : " + b.delete(2));
        b.display(b.root);
        System.out.println("\nHapus node dengan satu child (4) : " + b.delete(4));
        b.display(b.root);
        System.out.println("\nHapus node dengan dua child (10) : " + b.delete(10));
        b.display(b.root);
        System.out.println();
    }
}