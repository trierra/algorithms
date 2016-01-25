package course.recursion;

/**
 * @author trierra
 * @date 11/19/15.
 */
public class Hanoi2 {

    public static void hanoi(int n, String from, String to, String buff) {
        if (n < 1) {
            return;
        }
        hanoi(n - 1, from, buff, to);
        System.out.println(from + " -> " + to);
        hanoi(n - 1, buff, to, from);
    }

    public static void main(String[] args) {
        hanoi(3, "from", "to", "buff");
    }
}
