package Queue;

/**
 * @author Sultan Nasabah
 * @see QueueNasabah
 */
public class QueueNasabah {
    int max, front, rear, size;
    Nasabah[] q;

    QueueNasabah(int max) {
        this.max = max;
        create();
    }

    void create() {
        q = new Nasabah[max];
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

    void enqueue(Nasabah data) {
        if (isFull())
            System.out.println("\nAntrian sudah penuh!!");
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
            System.out.println("\nData Berhasil ditambahkan!");
        }
    }

    Nasabah dequeue() {
        Nasabah data = null;
        if (isEmpty())
            System.out.println("\nAntrian kosong!!");
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
                q[i].print();
                i++;
            }
            q[i].print();
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    void printFront() {
        System.out.println("Data yang ada pada posisi paling depan adalah : ");
        q[front].print();
    }

    void printRear() {
        System.out.println("Data yang ada pada posisi paling belakang adalah : ");
        q[rear].print();
    }

    void printPosition(Nasabah data) {
        int i = front;
        int print = 0;
        while (i != rear) {
            if (q[i].noRekening.equals(data.noRekening) && q[i].nama.equals(data.nama)) {
                print = 1;
                break;
            }
            i = (i + 1) % max;
        }
        if (q[i].noRekening.equals(data.noRekening) && q[i].nama.equals(data.nama))
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
        if (print == 1) {
            System.out.println("Data nomor antrian ke-" + (i + 1) + " adalah : ");
            q[i].print();
        } else
            System.out.println("Posisi antrian tidak ditemukan");
    }
}