package hackerrank.strings;

import java.util.Scanner;

/**
 * Created by trierra on 6/9/16.
 */
public class PalindromeIndex {


    //TODO: not completed
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int del;
        while(cases != 0 ){
            del = -1;
            String str = sc.next();
            char[] arr = str.toCharArray();
            int j = arr.length;
            for(int i = 0; i < arr.length; i++){
                --j;

                if(i == j){
                    continue;
                }
                if(j-i==1 && arr[i] != arr[j]){
                    del = i;
                }else if (j-1 == 1){
                    continue;
                }
                if (arr[i] == arr[j]){
                    continue;
                }else if(arr[i] != arr[j]){


                }
            }
            cases--;
            System.out.println(del);
        }
    }
}
