package Graph;

public class MainString {
    public static void main(String[] args) throws Exception {
        graphString graph = new graphString(6, 1);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 1);
        graph.addEdge(3, 5);
        graph.addEdge(4, 2);
        graph.addEdge(5, 0);
        graph.printGraph();
    }
}