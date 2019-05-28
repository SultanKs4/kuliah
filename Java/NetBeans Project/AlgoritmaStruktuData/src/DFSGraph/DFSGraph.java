package DFSGraph;

import java.util.Scanner;

/**
 * @author Sultan
 * @see DFSGraph
 */
public class DFSGraph {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Jumlah Vertex : ");
        int vertex = scan.nextInt();
        Graph g = new Graph(vertex);

        System.out.print("Jumlah Edges : ");
        int edges = scan.nextInt();
        int count = 1;
        System.out.println("Edges :\n<Source> <Destination>");
        while (count <= edges) {
            int source = scan.nextInt();
            int desti = scan.nextInt();
            g.addEdge(source, desti);
            count++;
        }

        System.out.println();
        System.out.print("Vertex Start : ");
        int start = scan.nextInt();
        System.out.println("Following is Depth First Traversal " + " (starting from vertex " + start + ")");
        g.DFS(start);
    }
}