package hackerrank.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by trierra on 7/28/16 for
 * java-algorithms.
 * https://www.hackerrank.com/challenges/kmp-problem
 */
public class KMPProblem {
    //TODO: complete

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        int[] alphabet = new int[26];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 26; i++) {
            alphabet[i] = in.nextInt();
        }
        StringBuilder builder = new StringBuilder();
        int min = findMin(alphabet);

        if (min == 0 && alphabet[min] > 2){
            builder.append('a').append('a');
        }
    }

    public static StringBuilder fillBuilder(int[] arr, int j) {
        return null;
    }

    public char toChar(int i){
        return (char) (i + 'a');
    }

    public static int findMin(int[] arr) {
        int min = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    public static int[] getIndexesArray(String pattern) {

        char[] symbols = pattern.toCharArray();
        int[] indexes = new int[pattern.length()];

        int j = 0;

        for (int i = 1; i < symbols.length; ) {

            if (symbols[i] == symbols[j]) {
                indexes[i] = j + 1;
                j++;
                i++;
            } else {
                if (j != 0) {
                    j = indexes[j - 1];
                } else {
                    indexes[i] = 0;
                    i++;
                }
            }

        }

        return indexes;
    }
}
