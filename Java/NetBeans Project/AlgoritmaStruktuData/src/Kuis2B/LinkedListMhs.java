package Kuis2B;

public class LinkedListMhs {
    NodeKuis head;
    int size;

    public class NodeKuis {
        MhsNode data;
        NodeKuis next;

        public NodeKuis(MhsNode data, NodeKuis next) {
            this.data = data;
            this.next = next;
        }
    }

    public LinkedListMhs() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int nim, int nilai) {
        MhsNode data = new MhsNode(nama, nim, nilai);
        head = new NodeKuis(data, head);
        size++;
    }

    public void add(String nama, int nim, int nilai, int index) throws Exception {
        if (index < 0 || index > size)
            throw new Exception("Nilai index di luar batas");
        if (isEmpty() || index == 0)
            addFirst(nama, nim, nilai);
        else {
            MhsNode data = new MhsNode(nama, nim, nilai);
            NodeKuis tmp = head;
            for (int i = 1; i < index; i++)
                tmp = tmp.next;
            NodeKuis next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeKuis(data, next);
            size++;
        }
    }

    public void addKey(String nama, int nim, int nilai, int cari) throws Exception {
        if (isEmpty())
            addFirst(nama, nim, nilai);
        else {
            MhsNode data = new MhsNode(nama, nim, nilai);
            NodeKuis tmp = head;
            while (tmp.next != null) {
                if (tmp.data.nim == cari)
                    break;
                tmp = tmp.next;
            }
            if (tmp.data.nim == cari) {
                NodeKuis next = (tmp == null) ? null : tmp.next;
                tmp.next = new NodeKuis(data, next);
                size++;
            } else
                throw new Exception("Nilai yang dicari tidak ada");
        }
    }

    public void addLast(String nama, int nim, int nilai) {
        if (isEmpty())
            addFirst(nama, nim, nilai);
        else {
            MhsNode data = new MhsNode(nama, nim, nilai);
            NodeKuis tmp = head;
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = new NodeKuis(data, null);
            size++;
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty())
            throw new Exception("Linked List Kosong");
        return 0;
    }

    public int getLast() throws Exception {
        if (isEmpty())
            throw new Exception("Linked List Kosong");
        NodeKuis tmp = head;
        int idxPos = 0;
        while (tmp.next != null) {
            tmp = tmp.next;
            idxPos++;
        }
        return idxPos;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size)
            throw new Exception("Nilai Index di luar batas");
        NodeKuis tmp = head;
        int idxPos = 0;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
            idxPos++;
        }
        return idxPos;
    }

    public int getKey(int nim) throws Exception {
        if (isEmpty())
            throw new Exception("LinkedList Kosong");
        NodeKuis tmp = head;
        int i = -1;
        while (tmp.next != null) {
            if (tmp.data.nim == nim)
                break;
            tmp = tmp.next;
            i++;
        }
        if (tmp.data.nim == nim)
            i += 1;
        else
            throw new Exception("Data tidak ada!");
        return i;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size)
            throw new Exception("Nilai index di luar batas");
        if (index == 0)
            removeFirst();
        else {
            NodeKuis prev = head;
            NodeKuis cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeKey(int nim) throws Exception {
        if (isEmpty())
            throw new Exception("LinkedList Kosong");
        NodeKuis prev = head;
        NodeKuis cur = head.next;
        if (nim == prev.data.nim)
            removeFirst();
        else if (size > 1) {
            for (int i = 1; i < size; i++) {
                if (nim != cur.data.nim && i == (size - 1))
                    throw new Exception("Data yang dicari tidak ada");
                if (nim == cur.data.nim) {
                    prev.next = cur.next;
                    size--;
                    break;
                }
                prev = cur;
                cur = prev.next;
            }
        } else
            throw new Exception("Data yang dicari tidak ada");
    }

    public void removeFirst() throws Exception {
        int tmp = getFirst();
        tmp += tmp;
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeKuis tmp = head;
            while (tmp != null) {
                System.out.println("==========================");
                System.out.println("Nama : " + tmp.data.nama);
                System.out.println("NIM : " + tmp.data.nim);
                System.out.println("Nilai : " + tmp.data.nilai);
                tmp = tmp.next;
            }
            System.out.println();
        } else
            System.out.println("Linked List Kosong");
    }

    public void print1ByPos(int index) {
        if (!isEmpty()) {
            NodeKuis tmp = head;
            for (int i = 0; i < index; i++)
                tmp = tmp.next;
            System.out.println("==========================");
            System.out.println("Nama : " + tmp.data.nama);
            System.out.println("NIM : " + tmp.data.nim);
            System.out.println("Nilai : " + tmp.data.nilai);
            System.out.println();
        } else
            System.out.println("Linked List Kosong");
    }
}