package coursera.sorting;

/**
 * @author trierra
 * @date 9/30/15.
 */
public class Insertion {
    static int exch = 0;
    static int comp = 0;

    public static   void sortX(Comparable[] a) {
        int N = a.length;

        // put smallest element in position to serve as sentinel
        for (int i = N-1; i > 0; i--)
            if (less(a[i], a[i-1])) exch(a, i, i-1);

        // insertion sort with half-exchanges
        for (int i = 2; i < N; i++) {
            Comparable v = a[i];
            int j = i;
            while (less(v, a[j-1])) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = v;
        }

    }

    public static void sort(Comparable[] a) {


        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
//                }
            }
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        exch++;
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private  boolean isSorted(Comparable[] a, int min) {
        for (int i = 0; i < min; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    private static boolean less(Comparable comparable, Comparable min) {
        comp++;
        return comparable.compareTo(min) < 0;

    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 2};
//        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        sortX(arr);
        System.out.println("i exch " + exch);
        System.out.println("i comp = " + comp);


//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
    }
}
