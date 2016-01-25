import java.util.Random;

/**
 * Created by trierra on 9/23/15.
 */
public class RussianRoulette {

    public static void main(String[] args) {
        int count = 0;
        int[] a = new int[]{0, 0, 0, 0, 0, 1};

        for (int i = 0; i < 600000; i++){
            Random random = new Random();
            int k = random.nextInt(6);
            if (a[k] == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
