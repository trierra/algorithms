package hackerrank.bit;

import java.util.Scanner;

/**
 * Created by trierra on 6/30/16.
 */
public class FlippingBits {

    public static void main(String[] args) {
//TODO: finish
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        Long num = 0b11111111111111111111111111111111L;

        while (cases != 0){
            Long a = in.nextLong();
            Long n = num ^ a;
            System.out.println(n);
            cases--;
        }

    }
}
