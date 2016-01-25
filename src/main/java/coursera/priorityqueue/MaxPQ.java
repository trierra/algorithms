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
//        if (N >= pq.length - 1) resize(2 * pq.length);

        // add x, and percolate it up to maintain heap invariant
        pq[++N] = x;
        swim(N);
    }

//    private void resize(int capacity) {
//        assert capacity > N;
//        Integer[] temp = new Integer[capacity];
//        for (int i = 1; i <= N; i++) {
//            temp[i] = pq[i];
//        }
//        pq = temp;
//    }

    public Integer max() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        return pq[1];
    }

    public Integer delMax() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        Integer max = pq[1];
        exch(1, N--);
        sink(1);
        pq[N + 1] = null;     // to avoid loiterig and help with garbage collection
//        if ((N > 0) && (N == (pq.length - 1) / 4)) resize(pq.length / 2);
        return max;
    }


    boolean isEmpty() {
        return N == 0;
    }


    int size() {
        return N;
    }

    private void swim(int lastElem) {
        while (lastElem > 1 && (pq[lastElem / 2] < pq[lastElem])) {
            exch(lastElem, lastElem / 2);
            lastElem = lastElem / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int ch = 2 * k;

            if (ch < N && (pq[ch] < pq[ch + 1])) {
                ch++;
            }
            if (pq[k] > pq[ch]) {
                break;
            }
            exch(k, ch);
            k = ch;
        }
    }

    private void exch(int i, int j) {
        Integer temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    public static void sort(Comparable[] pq) {
        int N = pq.length;
        for (int k = N/2; k >= 1; k--)
            sink(pq, k, N);
        while (N > 1) {
            exch(pq, 1, N--);
            sink(pq, 1, N);
        }
    }

    private static void sink(Comparable[] pq, int k, int N) {
        while (2*k <= N) {
            int j = 2*k;
            if (j < N && less(pq, j, j+1)) j++;
            if (!less(pq, k, j)) break;
            exch(pq, k, j);
            k = j;
        }
    }

    private static boolean less(Comparable[] pq, int i, int j) {
        return pq[i-1].compareTo(pq[j-1]) < 0;
    }

    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i-1];
        pq[i-1] = pq[j-1];
        pq[j-1] = swap;
    }

}
