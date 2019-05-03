package Kuis2A;

/**
 * @author Sultan
 * @see DoubleLinkedListMhs
 */
public class DoubleLinkedListMhs {
    NodeMhs head;
    int size;

    public DoubleLinkedListMhs() {
        head = null;
        size = 0;
    }

    public class NodeMhs {
        MhsData data;
        NodeMhs next, prev;

        public NodeMhs(NodeMhs prev, MhsData data, NodeMhs next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int nim, int nilai) {
        MhsData data = new MhsData(nama, nim, nilai);
        if (isEmpty())
            head = new NodeMhs(null, data, null);
        else {
            NodeMhs newNode = new NodeMhs(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String nama, int nim, int nilai) {
        if (isEmpty())
            addFirst(nama, nim, nilai);
        else {
            MhsData data = new MhsData(nama, nim, nilai);
            NodeMhs current = head;
            while (current.next != null)
                current = current.next;
            NodeMhs newNode = new NodeMhs(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String nama, int nim, int nilai, int index) throws Exception {
        if (index < 0 || index > size)
            throw new Exception("Nilai Index Diluar Batas");
        if (isEmpty())
            addFirst(nama, nim, nilai);
        else {
            MhsData data = new MhsData(nama, nim, nilai);
            NodeMhs current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeMhs newNode = new NodeMhs(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeMhs newNode = new NodeMhs(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih Kosong, tidak dapat dihapus!");
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeMhs current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (index == 0) {
            removeFirst();
        } else {
            NodeMhs current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
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
        NodeMhs tmp = head;
        int idx = 0;
        while (tmp.next != null) {
            tmp = tmp.next;
            idx++;
        }
        return idx;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Index di luar batas");
        }
        NodeMhs tmp = head;
        int idx = 0;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
            idx++;
        }
        return idx;
    }

    public int getByKey(String nama, int nim, int nilai) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        NodeMhs tmp = head;
        int idx = -1;
        int i = 0;
        while (tmp != null) {
            if (tmp.data.nilai == nilai && tmp.data.nama.equals(nama) && tmp.data.nim == nim) {
                idx = i;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (idx == -1)
            throw new Exception("Data tidak ada");
        return idx;
    }

    public void bubbleSortDESC() throws Exception {
        if (isEmpty())
            throw new Exception("LinkedList Kosong");
        NodeMhs tmp = head;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                if (tmp.data.nilai < tmp.next.data.nilai) {
                    MhsData t = tmp.data;
                    tmp.data = tmp.next.data;
                    tmp.next.data = t;
                }
                tmp = tmp.next;
            }
            tmp = head;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMhs tmp = head;
            while (tmp != null) {
                System.out.println("==========================");
                System.out.println("Nama : " + tmp.data.nama);
                System.out.println("NIM : " + tmp.data.nim);
                System.out.println("Nilai : " + tmp.data.nilai);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedList Kosong");
        }
    }

    public void print1ByPos(int index) {
        if (!isEmpty()) {
            NodeMhs tmp = head;
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