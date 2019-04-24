package DoubleLinkedList;

/**
 * @author Sultan
 * @see NodeMhs
 */
public class NodeMhs {
    MhsData data;
    NodeMhs next, prev;

    public NodeMhs(NodeMhs prev, MhsData data, NodeMhs next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}