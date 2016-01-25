package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Warmup {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(factorial(55));
    }


    public static BigInteger factorial(int a) {
        BigInteger n = BigInteger.valueOf(a);
        BigInteger result = BigInteger.ONE;

        while (!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }

        return result;
    }
}
