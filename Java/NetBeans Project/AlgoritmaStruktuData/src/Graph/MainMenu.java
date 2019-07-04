package Graph;

import java.util.Scanner;

public class MainMenu {
    static graph graph;
    static Scanner scan = new Scanner(System.in);
    static int choice, source, destination, vertex;
    static String pilihan;

    public static void main(String[] args) throws Exception {
        try {
            while (true)
                menu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void menu() throws Exception {
        System.out.println("Graph MENU");
        System.out.println("1. Jenis Graph (directed/undirected)\n2. Input Jumlah Vertex");
        System.out.println("3. Add Edge\n4. Remove Edge\n5. Remove All Edges\n6. Keluar");
        System.out.println("================================");
        System.out.print(">> ");
        int pilihan = scan.nextInt();
        System.out.println("================================");

        switch (pilihan) {
        case 1:
            System.out.print("Type Graph (0 = Directed Graph, 1 = Undirected Graph) : ");
            choice = scan.nextInt();
            System.out.println();
            if (choice == 1) {
                System.out.println("Memilih type Undirected Graph!");
            } else if (choice == 0) {
                System.out.println("Memilih type Directed Graph!");
            }
            if (choice != 1 && choice != 0) {
                System.out.println("Input Invalid");
            } else {
                System.out.println("Selanjutnya adalah pilih Input Jumlah Vertex");
            }
            break;
        case 2:
            System.out.print("Input jumlah vertex : ");
            vertex = scan.nextInt();
            graph = new graph(vertex, choice);
            break;
        case 3:
            System.out.println("Input Edge :\n<source> <destination>");
            source = scan.nextInt();
            destination = scan.nextInt();
            graph.addEdge(source, destination);
            graph.printGraph();
            break;
        case 4:
            System.out.println("Remove Edge :\n<source> <destination>");
            source = scan.nextInt();
            destination = scan.nextInt();
            graph.removeEdge(source, destination);
            graph.printGraph();
            break;
        case 5:
            graph.removeAllEdge();
            break;
        case 6:
            throw new Exception("Keluar");
        default:
            System.out.println("Input Invalid");
            break;
        }
        System.out.println();
    }
}