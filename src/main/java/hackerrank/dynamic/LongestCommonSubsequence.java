package hackerrank.dynamic;

import java.util.Scanner;

/**
 * Created by trierra on 12/5/16 for
 * algorithms.
 */
public class LongestCommonSubsequence {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int first = in.nextInt()+1;
        int second = in.nextInt()+1;

        int[][] arr = new int[second][first];
        arr[0][0] = 0;

        for (int i = 1; i < first; i++) {
            arr[0][i] = in.nextInt();
        }
        for (int i = 1; i < second; i++) {
            arr[i][0] = in.nextInt();
        }

        for (int i = 0; i < second; i++) {
            for (int j = 0; j < first; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
