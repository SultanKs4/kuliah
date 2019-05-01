package BinaryTree;

/**
 * @author Sultan
 * @see BinaryTreeMain
 */
public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Min : " + bt.min());
        System.out.println("Max : " + bt.max());
        bt.leaf();
        System.out.println("Jumlah Leaf : " + bt.countLeaf());
    }
}