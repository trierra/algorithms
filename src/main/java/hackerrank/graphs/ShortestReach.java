package hackerrank.graphs;

import javafx.beans.binding.When;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author trierra
 * @date 4/25/16.
 */
public class ShortestReach {


    public static class Graph {
        int E = 0;
        int V = 0;

        LinkedList<Integer>[] adj;

        public void addEdge(int w, int v) {

            if (!hasEdge(w, v)) {
                adj[v].add(w);
                adj[w].add(v);
            }
        }

        public boolean hasEdge(int w, int v) {
            return adj[w].contains(v);
        }

        public Graph(int v) {
            V = v;
            adj = new LinkedList[v+1];
            for (int i = 0; i < V+1; i++) {
                adj[i] = new LinkedList<Integer>();
            }
        }

        public void search(Integer vertex) {

            for (Integer i : adj[vertex]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();


        while (N > 0) {
            N--;
            int V = in.nextInt();
            int E = in.nextInt();
            Graph graph = new Graph(V);
            graph.E = E;

            int cases = E+1;
            while (cases > 0) {
                cases--;
//                String line = in.nextLine();
//
//                if (line.equals("")) {
//                    continue;
//                }
//                String[] nums = in.nextLine().split(" ");
                if (cases == 0) {
                    graph.search(in.nextInt());
                } else {
                    graph.addEdge(in.nextInt(), in.nextInt());
                }
            }

        }
    }
}
