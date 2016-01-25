package course.sort;

import java.util.Scanner;

/**
 * @author trierra
 * @date 12/7/15.
 */
public class Counting1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[] arr = new int[100];

        for (int i = 0; i < size; i++) {
            int el = in.nextInt();
            in.next();
            arr[el] += 1;
        }

        int[] support = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            if (k == 0) {
                support[k] = arr[k];
            } else {
                support[k] = support[k - 1] + arr[k];
            }

        }
        for (int el : support){
            System.out.print(el + " ");
        }
    }
}
