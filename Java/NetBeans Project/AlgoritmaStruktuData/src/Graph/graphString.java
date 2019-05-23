package Graph;

public class graphString {
    int vertex, type;
    LinkedList list[];
    String[] namaKota;

    public graphString(int vertex, int choice) {
        this.vertex = vertex;
        list = new LinkedList[vertex];

        namaKota = new String[vertex];
        namaKota[0] = "Malang";
        namaKota[1] = "Semarang";
        namaKota[2] = "Surabaya";
        namaKota[3] = "Jakarta";
        namaKota[4] = "Bandung";
        namaKota[5] = "Gresik";

        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
        graphType(choice);
    }

    public boolean graphType(int choice) {
        // 1 = undirected graph 0 = directed graph
        type = choice;
        if (choice == 1)
            return true;
        else
            return false;
    }

    public void addEdge(int source, int destination) {
        // directed graph
        list[source].addFirst(destination);

        // undirected graph
        if (type == 1)
            list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        if (type == 1) {
            // undirected graph
            System.out.println("degree vortex " + source + " : " + list[source].size());
        } else {
            // directed graph

            // inDegree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size; j++) {
                    if (list[i].get(j) == source) {
                        ++totalIn;
                    }
                }
                // outDegree
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
        }
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < list[source].size(); i++) {
            if (list[source].get(i) == destination)
                list[source].remove(i);
        }
        if (type == 1) {
            for (int i = 0; i < list[destination].size(); i++) {
                if (list[destination].get(i) == source)
                    list[destination].remove(i);
            }
        }
    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + namaKota[i] + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    for (int k = 0; k < vertex; k++) {
                        if (list[i].get(j) == k) {
                            System.out.print(namaKota[k] + " ");
                        }
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}