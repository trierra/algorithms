package hackerrank.dynamic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by trierra on 7/7/16 for
 * java-algorithms.
 */
public class Knapsack {

    //TODO: finish
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        while (cases > 0) {
            Integer n = in.nextInt();
            Integer k = in.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            Arrays.sort(arr);
            int one = binarySearch(arr, 1);
            if (one >= 0 && arr[one] == 1) {
                System.out.println(k);
            } else {

                int start = binarySearch(arr, k);
                int reminder = 0;
                int sum = 0;
                if (start >= 0) {
                    reminder = k % arr[start];
                } else {
                    System.out.println(reminder);
                    continue;
                }
                sum += arr[start];
                for (int i = start; i >= 0; i--) {
                    if (k % arr[i] == 0) {
                        sum = k;
                        break;
                    }
                    if (reminder < arr[i]) {
                        continue;
                    } else {
                        reminder = reminder % arr[i];
                        sum += arr[i];
                    }
                }

                System.out.println(sum);
                cases--;
            }
        }
    }

    public static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else return mid;
        }
        return lo - 1;
    }

}
