package BinarySearchTree;

/**
 * @author Sultan
 * @see BinarySearchTree
 */
public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public boolean find(int id) {
        Node current = root;
        while (current != null) {
            if (current.data == id) {
                return true;
            } else if (current.data > id) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void insert(int id) {
        Node newNode = new Node(id);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (id < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }

    public boolean delete(int id) {
        Node parent = root;
        Node current = root;
        boolean isLesftChild = false;
        while (current.data != id) {
            parent = current;
            if (current.data > id) {
                isLesftChild = true;
                current = current.left;
            } else {
                isLesftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            }
            if (isLesftChild == true) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLesftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLesftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.left != null && current.right != null) {
            Node successor = getSucceccor(current);
            if (current == root) {
                root = successor;
            } else if (isLesftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    public Node getSucceccor(Node deleteNode) {
        Node succeccor = null;
        Node successorParent = null;
        Node current = deleteNode.right;

        while (current != null) {
            successorParent = succeccor;
            succeccor = current;
            current = current.left;
        }
        if (succeccor != deleteNode.right) {
            successorParent.left = succeccor.right;
            succeccor.right = deleteNode.right;
        }
        return succeccor;
    }
}