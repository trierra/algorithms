package coursera.graph;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author trierra
 * @date 5/12/16.
 */
public class Graph {
    int E;
    ArrayList<LinkedList<Integer>> adj;
    private int V;

    public Graph(int v) {
        V = v;
        this.E = 0;
        adj = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < V; i++) {
            adj.add(new LinkedList<Integer>());
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 4);
        graph.addEdge(0, 3);

    }

    public void addEdge(int v, int w) {
        E++;
        adj.get(v).add(w);
        adj.get(w).add(v);
    }
}
