package coursera.unionfind;

public class QuickFindUF {

    int[] id;

    public QuickFindUF(int N) {

        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
//        int pid = id[p];
//        int qid = id[q];
//
//        for (int i = 0; i < id.length; i++) {
//            if (id[i] == pid) {
//                id[i] = qid;
//            }
//        }
        if (connected(p, q)) return;

        for (int i = 0; i < id.length; i++) {
            if (id[i] == id[p]) id[i] = id[q];
        }
    }

    public static void main(String[] args) {
        QuickFindUF unionUF = new QuickFindUF(10);
        unionUF.union(1, 0);
        unionUF.union(1, 2);
        unionUF.union(1, 3);
        unionUF.union(1, 4);
        unionUF.union(6, 5);
        unionUF.union(7, 5);
        unionUF.union(8, 5);
        unionUF.union(9, 5);
        unionUF.union(1, 9);

        for (int i : unionUF.id) {
            System.out.print(i);
        }
    }
}
