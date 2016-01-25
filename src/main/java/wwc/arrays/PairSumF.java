package wwc.arrays;

import java.util.HashMap;

/**
 * Created by trierra on 9/16/15.
 */
public class PairSumF {
    static int[] arr = new int[]{1, 2, 3, 3, 4, 6, 7, 9, 12, 66, 11, 41, 51, 54};
    static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    static int k = 10;

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (int currKey : map.keySet()) {

            if (map.containsKey(k - currKey) && currKey != k - currKey) {

                System.out.println(currKey + " + " + (k - currKey));

            } else if (currKey == k - currKey && map.get(currKey) >= 2) {

                System.out.println(currKey + " + " + currKey);
            }


        }
    }
}
