package course.recursion;

/**
 * Created by trierra on 1/15/17 for
 * algorithms.
 */
public class RecursionPractice {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        System.out.println(fibonacci(50));
//        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();

//        System.out.println(fibonacciCashed(50));
//        System.out.println(System.currentTimeMillis() - start);

//        System.out.println(factorial(5));

//        System.out.println(euclid(17, 30));
//        permutation("abc");
        char[] arr = {'a', 'b', 'c'};
        arrayPermutation(arr, 0);
    }

    public static int prev = 0;
    public static int prevPrev = 0;

    static int fibonacciCashed(int n) {
        for (int i = 0; i <= n; i++) {
            if (i <= 2) {
                prev = 1;
                prevPrev = 1;
            } else {
                int temp = prev;
                prev = prev + prevPrev;
                prevPrev = temp;
            }
        }
        return prev;
    }

    static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    private static int euclid(int first, int second) {

        if (first == 0) {
            return second;
        }

        int max = Math.max(first, second);
        int min = Math.min(first, second);

        return euclid(max % min, min);
    }


    public static void permutation(String input) {
        permutation("", input);
    }

    /*
     * Recursive method which actually prints all permutations
     * of given String, but since we are passing an empty String
     * as current permutation to start with,
     * I have made this method private and didn't exposed it to client.
     */
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i+1, word.length()));
            }
        }

    }

    private static void arrayPermutation(char[] arr, int index){
        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            arrayPermutation(arr, index+1);
            swap(arr, index, i);
        }
        if (index == arr.length-1){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }

    private static void swap(char[] arr, int i, int index) {
        char temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
