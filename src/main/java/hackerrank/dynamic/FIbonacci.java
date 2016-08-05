package hackerrank.dynamic;

/**
 * Created by trierra on 6/20/16.
 */
public class FIbonacci {

    private int one = 0;
    private int two = 1;

    public static void main(String[] args) {
        FIbonacci fIbonacci = new FIbonacci();
        System.out.println(fIbonacci.fib(20));

    }

    private int fib(int n){
        int a = 0;
        for (int i = 1; i < n; i++) {
             a = one + two;
            one = two;
            two = a;
        }
        return a;
     }
}
