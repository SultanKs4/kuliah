package Queue;

/**
 * @author sultan
 * @see Queue
 */
public class Queue {
    int max, size, front, rear;
    int[] q;

    Queue(int m) {
        max = m;
        create();
    }

    void create() {
        q = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (size == max)
            return true;
        else
            return false;
    }

    void enqueue(int data) {
        if (isFull())
            System.out.println("Antrian sudah penuh!!");
        else {
            if (isEmpty())
                front = rear = 0;
            else {
                if (rear == max - 1)
                    rear = 0;
                else
                    rear++;
            }
            q[rear] = data;
            size++;
        }
    }

    int dequeue() {
        int data = 0;
        if (isEmpty())
            System.out.println("Antrian kosong!!");
        else {
            data = q[front];
            size--;
            if (isEmpty())
                front = rear = -1;
            else {
                if (front == max - 1)
                    front = 0;
                else {
                    front++;
                }
            }
        }
        return data;
    }

    void print() {
        if (isEmpty())
            System.out.println("Antrian Kosong!!");
        else {
            int i = front;
            while (i != rear) {
                System.out.print(q[i] + "-");
                i = (i + 1) % max;
            }
            System.out.println(q[i] + " ");
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    void printFront() {
        System.out.println("Data yang ada pada posisi paling depan adalah : " + q[front]);
    }

    void printRear() {
        System.out.println("Data yang ada pada posisi paling belakang adalah : " + q[rear]);
    }

    void printPosition(int data) {
        int i = front;
        int print = 0;
        while (i != rear) {
            if (q[i] == data) {
                print = 1;
                break;
            }
            i = (i + 1) % max;
        }
        if (q[i] == data)
            print = 1;
        if (print == 1)
            System.out.println("Data berada pada nomor antrian ke : " + (i + 1));
        else
            System.out.println("Data tidak ditemukan pada antrian!");
    }

    void printDataByPos(int position) {
        int i = front;
        int print = 0;
        while (i != rear) {
            if (position == i) {
                print = 1;
                break;
            }
            i = (i + 1) % max;
        }
        if (position == i) {
            print = 1;
        }
        if (print == 1)
            System.out.println("Data nomor antrian ke-" + (i + 1) + " adalah : " + q[i]);
        else
            System.out.println("Posisi antrian tidak ditemukan");
    }
}