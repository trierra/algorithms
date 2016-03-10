package course.strings;

/**
 * @author trierra
 * @date 3/7/16.
 */
public class FindSubstring {


    /**
     * brute force approach
     * @param pattern
     * @param text
     * @return
     */
    public static int search(String pattern, String text) {
        int M = pattern.length();
        int N = text.length();
        for (int i = 0; i < N - M; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == M) return i;
        }
        return -1;
    }



    public static void main(String[] args) {
        System.out.println(search("ab", "abcdt"));
    }
}
