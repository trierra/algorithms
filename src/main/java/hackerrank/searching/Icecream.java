package hackerrank.searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author trierra
 * @date 1/20/16.
 */
public class Icecream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[] arr = new int[N+1];

            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 1; i < arr.length; i++) {
                int next = sc.nextInt();
                arr[i] = next;
                map.put(next, i);
            }

            for (int i = 1; i < arr.length; i++) {
                int diff = M - arr[i];
                if (map.containsKey(diff) && map.get(diff) != i) {
                    System.out.print(i + " ");
                    System.out.print(map.get(diff));
                    System.out.println();

                    break;
                }
            }
            T--;
        }
    }
}
