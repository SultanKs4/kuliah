package Graph;

import java.util.Scanner;

public class MainInput {
    static graph graph;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Type Graph (0 = Directed Graph, 1 = Undirected Graph) : ");
            choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("Memilih type Undirected Graph!");
            } else if (choice == 0) {
                System.out.println("Memilih type Directed Graph!");
            }
            if (choice != 1 && choice != 0) {
                System.out.println("Input Invalid");
            } else {
                System.out.print("Input jumlah vertex : ");
                int vertex = scan.nextInt();
                graph = new graph(vertex, choice);
            }
        } while (choice != 1 && choice != 0);
        String pilihan;
        int source, destination;
        do {
            System.out.println("Input Edge :\n<source> <destination>");
            source = scan.nextInt();
            destination = scan.nextInt();
            graph.addEdge(source, destination);
            do {
                System.out.print("Ulangi ? (Y/N) : ");
                pilihan = scan.next();
                if (!pilihan.equalsIgnoreCase("Y") && !pilihan.equalsIgnoreCase("N")) {
                    System.out.println("Input Invalid");
                }
            } while (!pilihan.equalsIgnoreCase("Y") && !pilihan.equalsIgnoreCase("N"));
        } while (pilihan.equalsIgnoreCase("Y"));
        graph.printGraph();
    }
}