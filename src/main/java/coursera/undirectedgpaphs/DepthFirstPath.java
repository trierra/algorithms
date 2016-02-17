package coursera.undirectedgpaphs;

import java.util.Stack;

/**
 * @author trierra
 * @date 2/16/16.
 */
public class DepthFirstPath {

    private boolean marked[]; // true if v connected to s

    private int[] edgeTo; // previous vertex on path from s to v

    private int s;

    public DepthFirstPath(UGraph G, int s) {
        this.s = s;
        marked = new boolean[s];
        edgeTo = new int[s];

        dfs(G, s);
    }

    public boolean hasPathTo(int v){
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v){
        if(!hasPathTo(v)){
            return null;
        }

        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x]){
            path.push(x);
        }
        path.push(s);
        return path;
    }

    /**
     * find vertices connected to s
     * @param g graph
     * @param v vertex connection to which we are looking for
     */
    private void dfs(UGraph g, int v) {
        marked[v] = true; //mark that vertex is on the way

        //for each vertex adjacent to v check if not marked, recursively do mark and connect rhe edges
        for (int w: g.adj(v)){

            if(!marked[w]){
                dfs(g, w);
                edgeTo[w] = v;
            }
        }
    }
}
