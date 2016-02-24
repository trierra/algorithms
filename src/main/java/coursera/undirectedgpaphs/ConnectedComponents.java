package coursera.undirectedgpaphs;

/**
 * Problem: find whether 2 vertexes connected in constant time
 *
 *
 * @author trierra
 * @date 2/23/16.
 */
public class ConnectedComponents {
    boolean[] marked;
    int[] id;
    int count;
    private int[] edgeTo; // previous vertex on path from s to v

    public ConnectedComponents(UGraph G) {

        marked = new boolean[G.V()];
        id = new int[G.V()];
        edgeTo = new int[G.V()];
        count = 0;
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                dfs(G, v);
                count++;
            }
        }
    }

    /**
     * is V connected to W?
     *
     * @param v
     * @param w
     * @return
     */
    boolean connected(int v, int w) {

        return id[v] == id[w];
    }

    /**
     * number of connected components
     *
     * @return
     */
    int count() {
        return 0;
    }

    /**
     * find vertices connected to s
     *
     * @param g graph
     * @param v vertex connection to which we are looking for
     */
    private void dfs(UGraph g, int v) {
        marked[v] = true; //mark that vertex is on the way

        //for each vertex adjacent to v check if not marked, recursively do mark and connect rhe edges
        for (int w : g.adj(v)) {

            if (!marked[w]) {
                dfs(g, w);
                edgeTo[w] = v;
            }
        }
    }


    int id(int v) {
        return 0;
    }
}
