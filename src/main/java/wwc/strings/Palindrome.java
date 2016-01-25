package wwc.strings;

/**
 * Created by trierra on 9/14/15.
 */
public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        char arr[] = str.toCharArray();
        int i1 = 0;
        int i2 = arr.length - 1;

        while (i2 > i1){
            if(arr[i1] != arr[i2]){
                System.out.println("no");
            }
            i1++;
            i2--;
        }

        System.out.println("yes");

    }
}
