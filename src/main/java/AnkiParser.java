import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created by trierra on 11/27/16 for
 * algorithms.
 */
public class AnkiParser {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Starting feature 1.....");


        Scanner sc = new Scanner(new File("/Users/trierra/IdeaProjects/algorithms/src/main/java/lingualeo-dict-export.csv"));
        String output = new File("dict.csv").getAbsolutePath();

        PrintWriter writer = new PrintWriter(output, "UTF-8");
        sc.nextLine();

        while (sc.hasNext()) {

            String line = sc.nextLine();
            String[] arr = line.split(";");
            String front = arr[0] + ";" + arr[1];
            writer.println(front);
            String back = arr[1] + ";" + arr[0];
            writer.println(back);
        }
        writer.close();
    }
}
