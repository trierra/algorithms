package hackerrank.sorting;

import java.util.Scanner;

/**
 * @author trierra
 * @date 12/14/15.
 */
public class Median {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        int hi = ar.length - 1;
        int lo = 0;
        part(ar, lo, hi);


    }

    private static int part(int[] ar, int lo, int hi) {
        int med = ar.length / 2;

        int j = lo;

        while (lo < hi) {
            if (j > med) {
                hi = j;
                part(ar, lo, hi);
            } else if (j < med) {
                lo = j;
                part(ar, lo, hi);
            } else {
                System.out.println(ar[med]);
            }
        }
        return j;
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

    private static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
