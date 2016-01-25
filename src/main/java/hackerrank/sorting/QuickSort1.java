package hackerrank.sorting;

import java.util.Scanner;

/**
 * @author trierra
 * @date 12/10/15.
 */
public class QuickSort1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        partition(ar);

    }

    private static void partition(int[] ar) {
        int[] temp = new int[ar.length];
        int p = ar[0];
        int index = 0;
        for (int k : ar){
            if (k < p){
                temp[index++] = k;
            }
        }
        temp[index++] = p;
        for (int k : ar){
            if(k > p){
                temp[index++] = k;
            }
        }
        printArray(temp);
    }

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
