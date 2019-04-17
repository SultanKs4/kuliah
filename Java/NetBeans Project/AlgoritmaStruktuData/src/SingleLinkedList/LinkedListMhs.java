package SingleLinkedList;

/**
 * @author Sultan
 * @see LinkedListMhs
 */
public class LinkedListMhs {
    NodeMhs head;
    int size;

    public LinkedListMhs() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int nim) {
        head = new NodeMhs(nama, nim, head);
        size++;
    }

    public void add(String nama, int nim, int index) throws Exception {
        if (index < 0 || index > size)
            throw new Exception("Nilai index di luar batas");
        if (isEmpty() || index == 0)
            addFirst(nama, nim);
        else {
            NodeMhs tmp = head;
            for (int i = 1; i < index; i++)
                tmp = tmp.next;
            NodeMhs next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeMhs(nama, nim, next);
            size++;
        }
    }

    public void addKey(String nama, int nim, int cari) throws Exception {
        if (isEmpty())
            addFirst(nama, nim);
        else {
            NodeMhs tmp = head;
            while (tmp.next != null) {
                if (tmp.nim == cari)
                    break;
                tmp = tmp.next;
            }
            if (tmp.nim == cari) {
                NodeMhs next = (tmp == null) ? null : tmp.next;
                tmp.next = new NodeMhs(nama, nim, next);
                size++;
            } else
                throw new Exception("Nilai yang dicari tidak ada");
        }
    }

    public void addLast(String nama, int nim) {
        if (isEmpty())
            addFirst(nama, nim);
        else {
            NodeMhs tmp = head;
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = new NodeMhs(nama, nim, null);
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
        NodeMhs tmp = head;
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
        NodeMhs tmp = head;
        int idxPos = 0;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
            idxPos++;
        }
        return idxPos;
    }

    public int getKey(int nim) throws Exception {
        if (isEmpty())
            throw new Exception("LinkedListMhs Kosong");
        NodeMhs tmp = head;
        int i = -1;
        while (tmp.next != null) {
            if (tmp.nim == nim)
                break;
            tmp = tmp.next;
            i++;
        }
        if (tmp.nim == nim)
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
            NodeMhs prev = head;
            NodeMhs cur = head.next;
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
            throw new Exception("LinkedListMhs Kosong");
        NodeMhs prev = head;
        NodeMhs cur = head.next;
        if (nim == prev.nim)
            removeFirst();
        else if (size > 1) {
            for (int i = 1; i < size; i++) {
                if (nim != cur.nim && i == (size - 1))
                    throw new Exception("Data yang dicari tidak ada");
                if (nim == cur.nim) {
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
            NodeMhs tmp = head;
            while (tmp != null) {
                System.out.println("==========================");
                System.out.println("Nama : " + tmp.nama);
                System.out.println("NIM : " + tmp.nim);
                tmp = tmp.next;
            }
            System.out.println();
        } else
            System.out.println("Linked List Kosong");
    }

    public void print1ByPos(int index) {
        if (!isEmpty()) {
            NodeMhs tmp = head;
            for (int i = 0; i < index; i++)
                tmp = tmp.next;
            System.out.println("==========================");
            System.out.println("Nama : " + tmp.nama);
            System.out.println("NIM : " + tmp.nim);
            System.out.println();
        } else
            System.out.println("Linked List Kosong");
    }
}