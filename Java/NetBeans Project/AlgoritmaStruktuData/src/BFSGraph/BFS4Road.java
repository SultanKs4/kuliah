package BFSGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS4Road {

    private Queue<Node> queue;
    static ArrayList<Node> nodes = new ArrayList<Node>();

    static class Node {

        String data;
        boolean visited;
        List<Node> neighbours;

        Node(String data) {
            this.data = data;
            this.neighbours = new ArrayList<>();

        }

        public void addneighbours(Node neighbourNode) {
            this.neighbours.add(neighbourNode);
        }

        public List<Node> getNeighbours() {
            return neighbours;
        }

        public void setNeighbours(List<Node> neighbours) {
            this.neighbours = neighbours;
        }
    }

    public BFS4Road() {
        queue = new LinkedList<Node>();
    }

    public void bfs(Node node) {
        queue.add(node);
        node.visited = true;
        while (!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.println(element.data);
            List<Node> neighbours = element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;
                }
            }
        }
        System.out.println("===================================");
    }

    public static void main(String arg[]) {

        Node node1 = new Node("Tottenham Court Road");
        Node node2 = new Node("London Bridge");
        Node node3 = new Node("Canary Warf");
        Node node4 = new Node("Trafalgar Square");
        Node node5 = new Node("Waterloo");
        Node node6 = new Node("Westminster");

        node1.addneighbours(node2);
        node1.addneighbours(node3);
        node2.addneighbours(node1);
        node2.addneighbours(node3);
        node2.addneighbours(node4);
        node3.addneighbours(node1);
        node3.addneighbours(node2);
        node3.addneighbours(node4);
        node4.addneighbours(node2);
        node4.addneighbours(node3);
        node4.addneighbours(node5);
        node4.addneighbours(node6);
        node5.addneighbours(node3);
        node5.addneighbours(node4);
        node5.addneighbours(node6);
        node6.addneighbours(node4);
        node6.addneighbours(node5);
        System.out.println("===================================");
        System.out.println("BFS Traversal: ");
        System.out.println("===================================");
        BFS4Road bfsExample = new BFS4Road();
        bfsExample.bfs(node1);
    }
}