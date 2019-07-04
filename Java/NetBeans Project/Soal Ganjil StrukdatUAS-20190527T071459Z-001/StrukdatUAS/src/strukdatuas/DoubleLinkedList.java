/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package strukdatuas;

/**
 *
 * @author rrism
 */
public class DoubleLinkedList {
    Node head;
    int size;

    DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Buku item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(Buku item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Buku item, int index) {
        if (isEmpty()) {
            addFirst(item);
        } else {

            // if(index < 0 || index > size) throw new Exception("Nilai index diluar
            // batas");
            if (index < 0 || index > size) {

            } else {
                Node current = head;
                int i = 0;

                while (i < index) {
                    current = current.next;
                    i++;
                }

                if (current.prev == null) {
                    Node newNode = new Node(null, item, current);
                    current.prev = newNode;
                    head = newNode;
                } else {
                    Node newNode = new Node(current.prev, item, current);
                    newNode.prev = current.prev;
                    newNode.next = current;
                    current.prev.next = newNode;
                    current.prev = newNode;
                }
                size++;
            }
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
            Node tmp = head;
            int idx = 0;
            while (tmp != null) {
                // tambahkan kode untuk cetak atribut buku disini
                System.out.print(idx + "\t" + tmp.data.kode + "\t");
                System.out.print(tmp.data.judul + "\t" + tmp.data.penerbit + "\t");
                System.out.print(tmp.data.jumlahStok + "\t" + tmp.data.jumlahRusak + "\n");
                tmp = tmp.next;
                idx++;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeFirst() {
        // if(isEmpty()) throw new Exception("Linked list masih kosong, tidak dapat
        // dihapus!");
        if (isEmpty()) {

        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        // if(isEmpty()) throw new Exception("Linked list masih kosong, tidak dapat
        // dihapus!");
        if (isEmpty()) {

        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        size--;
    }

    public void remove(int index) {
        // if(isEmpty() || index >= size) throw new Exception("Nilai index diluar
        // batas!");
        if (isEmpty() || index >= size) {

        }

        if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
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

    public Buku getFirst() {
        if (isEmpty()) {
            return null;
        }

        return head.data;
    }

    public Buku getLast() {
        if (isEmpty()) {
            return null;
        }

        Node tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }

        return tmp.data;
    }

    public Buku get(int index) {
        if (isEmpty()) {
            return null;
        }

        Node tmp = head;

        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        return tmp.data;
    }
}
