package coursera.strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by trierra on 6/2/16.
 */
public class Subsequence {

    public static boolean isSubsequence(String s, String t) {
        int M = s.length();
        int N = t.length();

        int i = 0;
        for (int j = 0; j < N; j++) {
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            if (i == M) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        String s = "fs";
//        String t = "fjdksfjksdfsssffff";
//        System.out.println(isSubsequence(s, t));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashMap<Character, String> map;
        while (T != 0){
            map = new HashMap();
            T--;
            String first = sc.next();
            String second = sc.next();
            for(Character item : first.toCharArray()){
                map.put(item, "");
            }

            int i = 0;
            for (Character item2 : second.toCharArray()){
                i++;
                if (map.containsKey(item2)){
                    System.out.println("YES");
                    break;
                } else if (i == second.length()){
                    System.out.println("NO");
                }
            }

        }
    }

}
