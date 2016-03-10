package course.strings;

/**
 * @author trierra
 * @date 3/3/16.
 */
public class StringPermutation {

    public static void permutation(String str, String prefix){
        if (str.length() == 0){
            System.out.println(prefix);
        }else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i+1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        permutation("abc", "");
    }
}
