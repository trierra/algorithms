/**
 * @author trierra
 * @date 1/11/16.
 */
public class Rent {
    static int startRent = 2785;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            startRent += startRent / 100 * 8;
        }
        StringBuilder builder = new StringBuilder();
        builder.toString();

        System.out.println(startRent);
    }
}
