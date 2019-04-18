public class LinkedListMhs {
    NodeMahasiswa head;
    int size;
    Mahasiswa mhs;

    public LinkedListMhs() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, String nim) {
        mhs = new Mahasiswa(nama, nim);
        head = new NodeMahasiswa(mhs, head);
        size++;
    }

    public void add(String nama, String nim, int index) throws Exception {
        mhs = new Mahasiswa(nama, nim);
        if (index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas!!!");
        }
        if (isEmpty() || index == 0) {
            addFirst(nama, nim);
        } else {
            NodeMahasiswa tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            NodeMahasiswa next = (tmp == null) ? null : tmp.next;
            mhs = new Mahasiswa(nama, nim);
            tmp.next = new NodeMahasiswa(mhs, next);
        }
        size++;
    }

    public void addLast(String nama, String nim) {
        mhs = new Mahasiswa(nama, nim);
        if (isEmpty()) {
            addFirst(nama, nim);
        } else {
            NodeMahasiswa tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new NodeMahasiswa(mhs, null);
        }
        size++;
    }

    public void addKey(String nim) throws Exception {
        NodeMahasiswa tmp = head;
        String nama = "";
        for (int i = 0; i < size; i++) {
            if (tmp.data.nim.equalsIgnoreCase(nim)) {
                nama = tmp.data.nama;
                mhs = new Mahasiswa(nama, nim);
                add(nim, nama, i + 1);
                break;
            }
            tmp = tmp.next;
        }
    }

    public Mahasiswa get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas!!!");
        }
        NodeMahasiswa tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Mahasiswa getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLIst kosong!!!");
        }
        NodeMahasiswa tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Mahasiswa getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong!!!");
        }
        return head.data;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas!!!");
        }
        if (isEmpty() && index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa prev = head;
            NodeMahasiswa cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        Mahasiswa tmp = getFirst();
        head = head.next;
        size--;
    }

    public void removeKey(String nim) throws Exception {
        NodeMahasiswa tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data.nim.equals(nim)) {
                remove(i);
                break;
            }
            tmp = tmp.next;
        }
        if (!tmp.data.nim.equals(nim))
            throw new Exception("Data tidak ada");
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa tmp = head;
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedList kosong!!!");
        }
    }

    public int getKey(String nim) throws Exception {
        NodeMahasiswa tmp = head;
        int a = -1;
        for (int i = 0; i < size; i++) {

            if (tmp.data.nim.equalsIgnoreCase(nim)) {
                a = i;
                break;
            }
            tmp = tmp.next;
        }
        return a;
    }
}