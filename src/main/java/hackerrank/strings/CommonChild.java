package hackerrank.strings;

import java.util.ArrayList;

/**
 * Created by trierra on 6/6/16.
 */
public class CommonChild {
    static ArrayList<Integer>[] letters = new ArrayList[100];
    static ArrayList<ArrayList<Character>> strings = new ArrayList<ArrayList<Character>>();

    public static void main(String[] args) {
        for (int i = 0; i < letters.length; i++) {
            letters[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < strings.size(); i++) {
            strings.add(new ArrayList<Character>());
        }

        String str1 = "SGJLFKGUBHHFKLGLGIJHF";
        String str2 = "KGJHDUDHGBGKSWKFKGTUHG";
        char strArr2[] = str2.toCharArray();

        for (int i = 0; i < strArr2.length; i++) {
            int ascii = (int) strArr2[i];
            letters[ascii].add(i);
        }

        char[] str1arr = str1.toCharArray();
        for (int i = 0; i < str1arr.length; i++) {
            int ascii = (int) str1arr[i];
            for (Integer el : letters[ascii]) {
                if (el > i) {
                    for (ArrayList<Character> str : strings) {



                        //TODO: COMPLETE
                    }
                }
            }
        }
    }
}
