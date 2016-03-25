package coursera.priorityqueue;

import java.util.NoSuchElementException;

/**
 * @author trierra
 * @date 1/4/16.
 */
public class MaxPQ {

    Integer[] pq;
    int N = 0;

    public MaxPQ(int n) {
        pq = new Integer[n + 1];
        N = 0;
    }

    public void insert(Integer x) {
        // double size of array if necessary
        pq[++N] = x;
        swim(N);
    }

    public Integer max() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        return pq[1];
    }

    public Integer delMax() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        int max = pq[1];
        pq[1] = pq[N];
        pq[N] = null;
        N--;
        sink(1);
        return max;
    }


    boolean isEmpty() {
        return N == 0;
    }


    int size() {
        return N;
    }

    private void swim(int k) {
        while (k > 1 && less(pq, k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (k * 2 <= N) {
            int j = 2 * k;
            if (j < N && less(pq, j, j + 1)) {
                j++;
            }
            if (!less(pq, k, j)) {
                break;
            } else {
                exch(k, j);
                k = j;
            }
        }

    }

    private void exch(int i, int j) {
        Integer temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }


    private static boolean less(Comparable[] pq, int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i - 1];
        pq[i - 1] = pq[j - 1];
        pq[j - 1] = swap;
    }

    public static void main(String[] args) {

    }

}
