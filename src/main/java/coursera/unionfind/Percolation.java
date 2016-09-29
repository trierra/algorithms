package coursera.unionfind;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by trierra on 9/8/16 for
 * algorithms.
 */
public class Percolation {
    private int full[];
    private int opened[];
    private int grid[][];
    private int N;
    private WeightedQuickUnionUF wqu;

    public Percolation(int n) {
        wqu = new WeightedQuickUnionUF(n);
        this.N = n;
        this.opened = new int[n * n + 2];
        this.full = new int[n * n + 2];

        for (int i = 0; i < n * n; i++) {
            this.opened[i] = i;
            this.full[i] = 0;
        }
        this.grid = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                this.grid[i][j] = 0;
            }
        }
    }

    // open site (row i, column j) if it is not open already
    public void open(int i, int j) {
        if (!isOpen(i, j)) {
            grid[i][j] = 1;
        }
        List<Integer> neighbours = findOpenNeighbours(i, j);
        for (int neighbour : neighbours) {

        }
    }

    // is site (row i, column j) open?
    public boolean isOpen(int i, int j) {
        return grid[i][j] == 1;
    }

    // is site (row i, column j) full?
    public boolean isFull(int i, int j) {
        return full[openedId(i, j)] == 1;
    }

    // does the system percolate?
    public boolean percolates() {
        return wqu.connected(0, N * N + 1);
    }

    public static void main(String[] args) {

    }

    private List<Integer> findOpenNeighbours(int i, int j) {
        List<Integer> neighbours = new LinkedList<>();
        if (i > 0 && j > 0 && isOpen(i-1, j)){

        }
            return null;
    }

    private int openedId(int i, int j) {
        return N * (i - 1) + j - 1;
    }
}
