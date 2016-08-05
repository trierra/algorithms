package coursera.graph;

/**
 * @author trierra
 * @date 5/12/16.
 */
public class DFS {
    private boolean marked[];
    private int edgeTo[];
    Graph graph;

    public DFS(Graph graph, int V) {
        this.graph = graph;
        marked = new boolean[V];
        edgeTo = new int[V];

        for (Boolean e : marked){
            e = false;
        }
        dfs(graph, V);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj.get(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }



}
