package Kuis2A;

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

    void getLeaf() {
        int childLeft, childRight;
        for (int i = 0; i < this.data.length; i++) {
            childLeft = 2 * i + 1;
            childRight = 2 * i + 2;
            if (childLeft >= 25 && childRight >= 25)
                break;
            if (this.data[childLeft] == 0 && this.data[childRight] == 0 && this.data[i] != 0)
                System.out.print(this.data[i] + " ");
        }
    }

    int getSize() {
        int count = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] != 0)
                count++;
        }
        return count;
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
}