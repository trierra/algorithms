package coursera.unionfind;

public class WeightedQuickUnionUF {
    private int[] id;
    private int size[];

    public WeightedQuickUnionUF(int N) {
        id = new int[]{0, 0, 0, 1, 1, 1, 3, 3, 6, 6, 8, 9, 9};
        size = new int[N];

        for (int i = 0; i < id.length; i++) {
//            id[i] = i;
            size[i] = 1;
        }
    }


    public boolean connected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public void union(int p, int q) {
        int rootP = findRoot(p);
        int rootQ = findRoot(q);
        if (connected(p, q)) {
            return;
        }
        if (size[rootQ] > size[rootP]) {
            id[rootP] = id[rootQ];
            size[rootQ] = size[rootP] + size[rootQ];
        } else {
            id[rootQ] = id[rootP];
            size[rootP] = size[rootQ] + size[rootP];
        }


    }

    public int findRoot(int p) {

        if (p == id[p]) {
            return p;
        }

        findRoot(id[p]);

        p = id[p];
        id[p] = id[id[p]];

        return p;
    }

    public static void main(String[] args) {
        WeightedQuickUnionUF unionUF = new WeightedQuickUnionUF(13);
//
//        unionUF.union(4, 3);
//        unionUF.union(3, 8);
//        unionUF.union(6, 5);
//        unionUF.union(9, 4);
//        unionUF.union(2, 1);
//        unionUF.union(8, 9); // +
//        unionUF.union(5, 0);
//        unionUF.union(7, 2);
//        unionUF.union(6, 1);
//        unionUF.union(7, 3);
//
//        int[] res = new int[]{1, 8, 1, 8, 3, 0, 5, 1, 8, 8};

//        unionUF.union(4, 3);
//        unionUF.union(3, 8);
//        unionUF.union(6, 5);
//        unionUF.union(9, 4);
//        unionUF.union(2, 1);
//        unionUF.union(5, 0);
//        unionUF.union(7, 2);
//        unionUF.union(6, 1);
//        unionUF.union(7, 3);
        unionUF.findRoot(11);
        int res[] = new int[]{6, 2, 6, 4, 6, 6, 6, 2, 4, 4};


        for (int i = 0; i < unionUF.id.length; i++) {

            System.out.println(i + ". " + unionUF.id[i]);
        }

    }
}
