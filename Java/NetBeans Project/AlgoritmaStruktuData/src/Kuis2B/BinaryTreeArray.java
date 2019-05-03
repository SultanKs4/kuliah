package Kuis2B;

/**
 * @author Sultan
 * @see BinaryTreeArray
 */
public class BinaryTreeArray {
    int[] data;
    int idxLast = -1, idxCur;

    public BinaryTreeArray(int max) {
        data = new int[max];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void add(int data) {
        idxLast++;
        this.data[idxLast] = data;
    }

    void getParent(int data) {
        for (int i = 0; i < this.data.length; i++) {
            if (data == this.data[i]) {
                idxCur = i;
                break;
            }
        }
        if (idxCur == 0) {
            System.out.println("Data adalah root!");
        } else {
            int parent = idxCur / 2;
            if (idxCur % 2 == 0 && idxCur > 2)
                parent = (idxCur / 2) - 1;
            System.out.println("Parent dari data : " + data + " adalah : " + this.data[(parent)]);
        }
    }

    void getChild(int data) {
        for (int i = 0; i < this.data.length; i++) {
            if (data == this.data[i]) {
                idxCur = i;
                break;
            }
        }
        int childLeft = 2 * idxCur + 1;
        int childRight = 2 * idxCur + 2;
        System.out.println(
                "Chlid dari data : " + data + " adalah : " + this.data[(childLeft)] + " & " + this.data[childRight]);
    }

    void getSibling(int data) {
        for (int i = 0; i < this.data.length; i++) {
            if (data == this.data[i]) {
                idxCur = i;
                break;
            }
        }
        if (idxCur == 0) {
            System.out.println("Data adalah root!");
        } else {
            int sibling = idxCur + 1;
            if (idxCur % 2 == 0)
                sibling = idxCur - 1;
            System.out.println("Sibling dari data : " + data + " adalah : " + this.data[sibling]);
        }
    }

    void getHeight() {
        int count = 0;
        int countIdx = idxLast;
        for (int i = idxLast; i >= 0; i--) {
            System.out.println(countIdx);
            countIdx = countIdx / 2;
            System.out.println(countIdx);
            count++;
            if (countIdx == 0)
                break;
        }
        System.out.println("Height adalah : " + count);
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}