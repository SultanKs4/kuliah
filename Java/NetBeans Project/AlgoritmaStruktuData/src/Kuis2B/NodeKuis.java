package Kuis2B;

public class NodeKuis {
    MhsNode data;
    NodeKuis next;

    public NodeKuis(MhsNode data, NodeKuis next) {
        this.data = data;
        this.next = next;
    }
}