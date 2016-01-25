package course;

/**
 * Created by trierra on 9/18/15.
 */
public class Test {
    public static void main(String[] args) {
        int N = 16;
        int sum = 0;

        for (int i = 1; i <= N; i = i * 2)

        for (int j = 1; j <= N; j = j * 2) {
            System.out.println(j);
            for (int k = 1; k <= j; k++)
                sum++;
        }


    }
}
