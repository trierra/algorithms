package course.recursion;

public class RecursionDemo {

    //print all numbers from 1 to n in asc order
    void printAll(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            printAll(n - 1);
            System.out.print(n);
        }
    }


    //find  наибольший общий делитель
    void euclid(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.println(a + " " + b);
        }
        if (b == 0) {
            System.out.println("NOD: " + a);
        } else {
            euclid(a - 1, b);
        }
    }

    // 2^8 (num power)
    int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a;
        }
        int res = power(a, n - 1);
        res = res * a;
        return res;
    }

    int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        int fib1 = fibonacci(n - 1);
        int fib2 = fibonacci(n - 2);
        return fib1 + fib2;
    }

    int factorial(int n) {
        if (n == 1) {
            return n;
        }
        int prev = factorial(n - 1);
        int res = n * prev;
        return res;
    }

    int sum(int n) {
        int k;
        if (n < 2) {
            return n;
        } else {
            k = n-1;
            return sum(k) + n;
        }
    }

    int ifPower(int N) {
        if (N % 2 == 1) {
            return N;
        }
        return ifPower(N / 2);
    }

    //179 = 1+7+9

    int sumN(int n, int k) {
        if (n % 10 == n) {
            return n;
        } else {
            int res = n / k;
            return sumN(n % k, k / 10) + res;
        }

    }

    //179 == 9 7 1
    void fromLeftToRight(int n, int k) {
        if (n % 10 == n) {

        }
    }

    static int max = 0;
    static int[] arr = new int[]{10, 6, 3, 4, 90};

    int findMax(int N) {
        if (N == arr.length) {
            return arr[N];
        }

        return findMax(N + 1) * 2;
    }

    public static void main(String[] args) {
        RecursionDemo demo = new RecursionDemo();

//        demo.printAll(5);
//        demo.euclid(2, 7);
//        System.out.println(demo.power(2, 5));
//        System.out.println(demo.fibonacci(17));
//        System.out.println(demo.factorial(5));
//        System.out.println(demo.sum(5));

//        if (demo.ifPower(259) != 1) {
//            System.out.println("NO");
//        } else {
//            System.out.println("YES");
//        }

//        System.out.println(demo.sumN(22222, 10000));
//        demo.findMax(0);
        demo.sum(5);
//        System.out.println(max);
    }
}
