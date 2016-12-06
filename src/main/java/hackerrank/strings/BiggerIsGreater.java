package hackerrank.strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created by trierra on 11/28/16 for
 * algorithms.
 */
public class BiggerIsGreater {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        String output = new File("/Users/trierra/IdeaProjects/algorithms/src/main/java/hackerrank/strings/outp.txt").getAbsolutePath();
        PrintWriter writer = new PrintWriter(output, "UTF-8");

//        Scanner in = new Scanner(new File("/Users/trierra/IdeaProjects/algorithms/src/main/java/hackerrank/strings/inp.txt"));

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        while (q > 0) {
            String line = in.nextLine();
            if (line.equals("")) {
                continue;
            }
            char[] arr = line.toCharArray();

            int fallIndex = 0;
            char fall = 0;
            int startReverce = 0;
            int lessThenFall = 0;

            for (int i = arr.length - 1; i > 0; i--) {

                if (arr[i - 1] < arr[i]) {
                    fallIndex = i - 1;
                    fall = arr[i - 1];

                    startReverce = i;

                    for (int j = arr.length - 1; j > fallIndex; j--) {
                        if (arr[j] > fall) {
                            lessThenFall = j;
                            while (arr[j] == arr[lessThenFall]) {
                                j--;
                            }
                            j++;
                            char temp = arr[j];
                            arr[j] = fall;
                            arr[fallIndex] = temp;
                            break;
                        }
                    }

                    if (lessThenFall != fallIndex + 1) {
                        int p = arr.length;
                        for (int k = startReverce; k < arr.length / 2; k++) {
                            --p;
                            if (arr[k] == arr[p]) {
                            } else {
                                char temp = arr[k];
                                arr[k] = arr[p];
                                arr[p] = temp;
                            }
                        }
                    }
                    break;
                }
            }

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                builder.append(arr[i]);
            }
            if (builder.toString().equals(line)) {
                writer.println("no answer");
//                System.out.println("no answer");
            } else {
                writer.println(q + " " + builder.toString());
                System.out.println(builder.toString());
            }
            q--;
        }

//        print();
    }

    public static void print() throws FileNotFoundException, UnsupportedEncodingException {
        Scanner outp = new Scanner(new File("/Users/trierra/IdeaProjects/algorithms/src/main/java/hackerrank/strings/outp.txt"));
        Scanner sc = new Scanner(new File("/Users/trierra/IdeaProjects/algorithms/src/main/java/hackerrank/strings/answ.txt"));


        while (outp.hasNext() && sc.hasNext()) {
            String my = outp.nextLine();
            String answer = sc.nextLine();
            if (!my.equals(answer)) {
                System.out.println("my: " + my);
                System.out.println("an: " + answer);
            }
        }
    }
}
