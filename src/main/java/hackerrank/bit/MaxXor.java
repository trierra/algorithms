package hackerrank.bit;

import java.util.Scanner;

/**
 * Created by trierra on 6/30/16.
 */
public class MaxXor {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String binaryStringL = Integer.toBinaryString(in.nextInt());
        String binaryStringR = Integer.toBinaryString(in.nextInt());


        int sameI = 0;
        if(binaryStringL.length() == binaryStringR.length()){
            for (;binaryStringL.charAt(sameI) == binaryStringR.charAt(sameI); sameI++ );
        }
        System.out.println((int)Math.pow(2, binaryStringR.length() - sameI) - 1);



    }
}
