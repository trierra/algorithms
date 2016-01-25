package coursera.analysis;

/**
 * Created by trierra on 9/17/15.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int N = 150;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    System.out.print(k);
                    cnt ++;
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("!!" + cnt);
    }

}
