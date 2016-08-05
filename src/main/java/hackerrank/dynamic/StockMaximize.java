package hackerrank.dynamic;

import java.util.Scanner;

/**
 * Created by trierra on 7/18/16 for
 * java-algorithms.
 */
public class StockMaximize {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        while (cases > 0) {
            cases--;
            int stocks = in.nextInt();

            int[] arr = new int[stocks];

            for (int i = 0; i < stocks; i++) {
                arr[i] = in.nextInt();
            }

            int localmax = findMax(arr, 0);
            int prevLocalMax = 0;
            long sum = 0;

            if (localmax == arr.length - 1) {
                for (int i = 0; i <= localmax; i++) {
                    sum += arr[localmax] - arr[i];
                }
            } else {
                int k = localmax;
                while (k <= arr.length) {
                    for (int i = prevLocalMax; i < localmax; i++) {
                        sum += arr[localmax] - arr[i];
                    }
                    prevLocalMax = localmax+1;
                    localmax = findMax(arr, localmax+1);
                    k++;
                }
            }

            System.out.println(sum);
        }
    }

    public static int findMax(int[] arr, int lo) {
        int max = lo;


        for (int i = lo; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
