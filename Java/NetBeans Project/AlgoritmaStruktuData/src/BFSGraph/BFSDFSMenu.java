package BFSGraph;

import java.util.Scanner;

/**
 * @author Sultan
 * @see BFSDFSMenu
 */
public class BFSDFSMenu {
    static Scanner scan = new Scanner(System.in);
    static GraphBFSDFS g;
    static int start;

    public static void main(String[] args) {
        try {
            while (true) {
                menu();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void menu() throws Exception {
        System.out.println("BFS dan DFS Menu");
        System.out.println("1. Create Graph\n2. Do BFS\n3. Do DFS\n4. Exit");
        System.out.println("===============================");
        System.out.print(">> ");
        int pilihan = scan.nextInt();
        System.out.println("===============================");
        switch (pilihan) {
        case 1:
            System.out.print("Jumlah Vertex : ");
            int vertex = scan.nextInt();
            g = new GraphBFSDFS(vertex);

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
            break;
        case 2:
            System.out.print("Vertex Start : ");
            start = scan.nextInt();
            System.out.println("Following is Breadth First Traversal " + " (starting from vertex " + start + ")");
            g.BFS(start);
            System.out.println();
            break;
        case 3:
            System.out.print("Vertex Start : ");
            start = scan.nextInt();
            System.out.println("Following is Depth First Traversal " + " (starting from vertex " + start + ")");
            g.DFS(start);
            System.out.println();
            break;
        case 4:
            throw new Exception("EXIT!\nThank You!");
        default:
            System.out.println("Input Invalid!");
            break;
        }
        System.out.println();
    }
}