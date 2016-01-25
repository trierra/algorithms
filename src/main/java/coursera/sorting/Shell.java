package coursera.sorting;

/**
 * @author trierra
 * @date 9/30/15.
 */
public class Shell {

    public static void sort(Comparable[] a) {

        int N = a.length;
        int step = 1;

        while (step < N / 3) {
            step = step * 3 + 1;
//            System.out.print(h + " ");
        }

        int count = 0;
        while (step >= 1) {
            for (int i = step; i < N; i++) {
                for (int j = i; j >= step && less(a[j], a[j - step]); j -= step) {
                    exch(a, j, j - step);
                }
            }
            assert isSorted(a, step);
            step = step / 3;
        }
        System.out.print(count);
    }

    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, a.length);
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static boolean isSorted(Comparable[] a, int min) {
        for (int i = 0; i < min; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    private static boolean less(Comparable comparable, Comparable min) {
        return comparable.compareTo(min) < 0;

    }

    public static void main(String[] args) {
//        Integer[] arr = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2};
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort(arr);

//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
    }

}
