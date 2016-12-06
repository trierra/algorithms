package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by trierra on 11/21/16 for
 * algorithms.
 */

public class LadyBugs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for (int a0 = 0; a0 < Q; a0++) {

            int n = in.nextInt();
            Map<Character, Integer> map = new HashMap();
            String b = in.next();
            char[] str = b.toCharArray();
            int und = 0;
            for (int i = 0; i < str.length; i++) {
                char key = str[i];
                if (key == '_') {
                    und += 1;
                }
                if (map.containsKey(key)) {
                    int val = map.get(key);
                    map.put(key, val + 1);
                } else {
                    map.put(key, 1);
                }
            }

            if (und == n) {
                System.out.println("YES");
            } else if (map.containsKey('_')) {
                boolean no = false;
                for (Character key : map.keySet()) {
                    if (key != '_' && map.get(key) < 2) {
                        no = true;
                    }
                }
                if (no) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else if (und == 0) {
                int i = 0;
                while (i < str.length) {
                    int count = 1;
                    char lady = str[i];
                    i++;
                    while (i < str.length && str[i] == lady) {
                        i++;
                        count++;
                    }
                    if (count < 2) {
                        System.out.println("NO");
                        break;
                    } else if (count >= 2 && i == n) {
                        System.out.println("YES");
                    }
                }
            }
        }
    }
}
