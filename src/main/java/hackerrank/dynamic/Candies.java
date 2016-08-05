package hackerrank.dynamic;

import java.util.Scanner;

/**
 * Created by trierra on 6/16/16.
 * Dynamic programming
 */
public class Candies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kids = in.nextInt();

        long[] scores = new long[kids];
        long[] candies = new long[kids];
        for (int i = 0; i < candies.length; i++) {
            candies[i] = 1;
        }

        for (int i = 0; i < kids; i++) {
            scores[i] = in.nextInt();
        }

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[i -1]){
                candies[i] = candies[i-1] + 1;
            }
        }

        for (int i = scores.length -2; i >= 0 ; i--) {
            if (scores[i] > scores[i+1]){
                if (candies[i] <= candies[i+1]){
                    candies[i] = candies[i+1]+1;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < candies.length; i++) {
            sum+= candies[i];
        }
        System.out.println(sum);
    }
}
