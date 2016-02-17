package coursera.undirectedgpaphs;

import coursera.Bag;

/**
 * @author trierra
 * @date 2/16/16.
 */
public class UGraph {

    private final int V;
    private Bag<Integer>[] adj;

    public UGraph(int V) {

        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    /**
     * Number of vertises
     *
     * @return
     */
    int V() {
        return this.V;
    }

    /**
     * Number of edges
     *
     * @return
     */
//    int E() {
//
//    }

    /**
     * add edge v-w to this graph
     *
     * @param v edge
     * @param w edge
     */
    void addEdge(int v, int w) {

        adj[v].add(w);
        adj[w].add(v);
    }

    /**
     * Vertices adjacent to v
     *
     * @param v
     * @return
     */
    Iterable<Integer> adj(int v) {
        return adj[v];
    }

//    @Override
//    public String toString() {
//
//    }
}
