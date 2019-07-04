/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author ASUS
 */
public class DoubleLL {

    Node head;
    Node tail;
    int size;

    public DoubleLL() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Buah item) {
        add(0, item);
    }

    public void addLast(Buah item) {
        add(size, item);
    }

    public void add(int index, Buah item) {
        if (index >= 0 && index <= size) {
            if (isEmpty()) {
                Node newNode = new Node(null, item, null);
                head = tail = newNode;
            } else if (index == 0) {
                Node newNode = new Node(null, item, head);
                head.prev = newNode;
                head = newNode;
            } else if (index == size) {
                Node newNode = new Node(tail, item, null);
                tail.next = newNode;
                tail = newNode;
            } else {
                Node current = head.next;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void update(int index, Buah item) {
        if (index >= 0 && index <= size) {
            if (isEmpty()) {
                System.out.println("KOSONG");
            } else {
                Node current = head;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                current.data.jumlahStok = item.jumlahStok;
                current.data.jumlahBusuk = item.jumlahBusuk;
            }
        }
    }

    public void removeFirst() {
        remove(0);
    }

    public void removeLast() {
        remove(size - 1);
    }

    public void remove(int index) {
        if (!isEmpty() && (index >= 0 && index < size)) {
            if (index == 0) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                } else {
                    tail = head;
                }
            } else if (index == size - 1) {
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                } else {
                    head = tail;
                }
            } else {
                Node current = head.next;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public Buah getFirst() {
        return get(0);
    }

    public Buah getLast() {
        return get(size - 1);
    }

    public Buah get(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index < 0 || index > size) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public void print() {
        int i = 1;
        Node tmp = head;
        System.out.println();
        System.out.println("Kode\tNama Buah\tStok\tBusuk");
        while (tmp != null) {
            // TODO: implementasi cetak data
            System.out.print(i + "\t");
            System.out.print(tmp.data.nama + "\t");
            System.out.print(tmp.data.jumlahStok + "\t");
            System.out.print(tmp.data.jumlahBusuk + "\t");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
