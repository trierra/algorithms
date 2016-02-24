package coursera.undirectedgpaphs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author trierra
 * @date 2/18/16.
 */
public class BreadthFirstSearch {

    private boolean marked[];
    private int[] edgeTo;
    private int s;


    public BreadthFirstSearch(UGraph G, int s) {
        this.s = s;
        marked = new boolean[s];
        edgeTo = new int[s];

        bfs(G, s);
    }

    void bfs(UGraph G, int s){

        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(s);
        marked[s] = true;
        while (!q.isEmpty()){
            int v = q.remove();

            for (int w : G.adj(v)){
                q.add(w);
                marked[w] = true;
                edgeTo[w] = v;

            }
        }
    }
}
