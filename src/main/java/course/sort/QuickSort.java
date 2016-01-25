package course.sort;

/**
 * @author trierra
 * @date 11/18/15.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 1, 7, 3, 5, 8, 1};
        System.out.println("lo = " + arr[0]);
        System.out.println("hi = " + arr[arr.length - 1]);
        sort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        while (true) {
            while (a[++i] < a[lo]) {
                if (i == hi) {
                    break;
                }
            }
            while (a[--j] > a[lo]) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }

            swap(a, i, j);
        }
        //swap with partitioning item (left and j)
        swap(a, lo, j);
        //return index of item now known to be in place
        System.out.println("middle = " + a[j]);
        return j;
    }

    public static void sort(int[] a) {

        sort(a, 0, a.length - 1);


    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
