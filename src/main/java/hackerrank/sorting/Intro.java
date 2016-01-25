package hackerrank.sorting;

import java.util.Scanner;

/**
 * @author trierra
 * @date 11/30/15.
 */
public class Intro {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int size = in.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = in.nextInt();
        }

        find(arr, 0, arr.length - 1, num);
    }

    public static void find(int[] arr, int lo, int hi, int num) {
        int med = lo + (hi - lo)/2;

        if (arr[med] == num) {
            System.out.println( med);
            return;
        }

        if (arr[med] > num) {
            find(arr, lo, med, num);
        } else if (arr[med] < num) {
            find(arr, med + 1, arr.length - 1, num);
        }

    }
}
