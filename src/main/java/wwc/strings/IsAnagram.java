package wwc.strings;

import java.util.HashMap;

/**
 * Created by trierra on 9/16/15.
 */
public class IsAnagram {
    static String first = "nnaannaa";
    static String second = "aannaann";

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character s : first.toCharArray()) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int i =0;
        for (Character k : second.toCharArray()) {
            int val = first.charAt(i++);
            System.out.println(val);

            if (!map.containsKey(k)) {
                System.out.println("NO");



            } else if (map.get(k) != 0) {
                map.put(k, map.get(k) - 1);
            } else {
                System.out.println("NO");
            }
        }

    }
}
