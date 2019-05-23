package Graph;

import java.util.LinkedList;

/**
 * @author Sultan
 * @see WeightedGraph
 */
public class WeightedGraph {
    int vertices;
    LinkedList<Edge>[] adjacencyList;

    public WeightedGraph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencyList[source].addFirst(edge);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            LinkedList<Edge> linkedList = adjacencyList[i];
            for (int j = 0; j < linkedList.size(); j++) {
                System.out.println("Vertex " + i + " terhubung dengan " + linkedList.get(j).destination
                        + " dengan bobot " + linkedList.get(j).weight);
            }
        }
    }
}