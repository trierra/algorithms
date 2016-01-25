package hackerrank.searching;

import java.util.Scanner;

/**
 * @author trierra
 * @date 1/21/16.
 */
public class SherlockAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N + 1];

            for (int i = 1; i < N + 1; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            int elemIndex = 1;

            for (int i = 1; i < arr.length; i++) {

                if(N==2 && arr[elemIndex] == 0){
                    System.out.println("YES");
                    break;
                }


                if (sum == arr[elemIndex]) {
                    if(elemIndex == arr.length -1 && arr[elemIndex] != 0){
                        System.out.println("NO");
                        break;
                    }
                    sum = 0;
                    for (int j = elemIndex + 1; j < arr.length; j++) {
                        sum += arr[j];
                        if (sum == arr[elemIndex] && j == arr.length-1){
                            System.out.println("YES");
                            break;
                        }
                        if (sum > arr[elemIndex]){
                            System.out.println("NO");
                            break;
                        }

                    }
                } else {
                    sum += arr[i];
                    elemIndex++;
                }

            }
            T--;
        }
    }
}
