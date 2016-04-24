package hackerrank.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * There are NN strings. Each string's length is no more than 2020 characters. There are also QQ queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

 Input Format

 The first line contains NN, the number of strings.
 The next NN lines each contain a string.
 The N+2N+2nd line contains QQ, the number of queries.
 The following QQ lines each contain a query string.

 Constraints

 1≤N≤10001≤N≤1000
 1≤Q≤10001≤Q≤1000
 1≤1≤ length  of any string≤20

 Sample Input

 4
 aba
 baba
 aba
 xzxb
 3
 aba
 xzxb
 ab
 Sample Output

 2
 1
 0
 Explanation

 Here, "aba" occurs twice, in the first and third string.
 The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.

 * @author trierra
 * @date 4/11/16.
 */


public class SparseArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> strings = new HashMap<String , Integer>();

        while (N != 0){
            String key = sc.next();
            if (strings.containsKey(key)){
                strings.put(key, strings.get(key)+1);
            }else {
                strings.put(key, 1);
            }
            N--;
        }
        int Q = sc.nextInt();

        while (Q > 0){
            String key = sc.next();
            if(strings.containsKey(key)){
                System.out.println(strings.get(key));

            }else{
                System.out.println(0);
            }
            Q--;
        }

    }
}
