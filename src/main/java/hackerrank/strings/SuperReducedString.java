package hackerrank.strings;

import java.util.Scanner;

/**
 * Created by trierra on 9/28/16 for
 * algorithms.
 */
public class SuperReducedString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        char[] first = line.toCharArray();
        char prev = first[0];

        StringBuilder builder = new StringBuilder();
        int count = 0;
        while (first.length != count) {

            for (int i = 1; i < first.length -1 ; i++) {
                if (first[i] == prev) {
                    prev = ' ';
                } else if (first[i] != prev && first[i] != first[i + 1]) {
                    builder.append(first[i]);
                    count++;
                    prev = first[i];
                }
            }
            first = builder.toString().toCharArray();
        }
        System.out.println(builder.toString());
    }
}
