package coursera.tries;

import java.util.Scanner;

/**
 * Created by trierra on 6/20/16.
 */
public class Contacts {

    private static Node root;

    private static class Node {
        int value = 0;
        Node right, left, middle = null;
        char key;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while (cases != 0) {
            String command = sc.next();
            String key = sc.next();

            if (command.equals("add")) {
                root = add(root, key, 0);
            } else {
                find(root, key);
            }

            cases--;
        }

    }

    private static Node add(Node root, String key, int d) {

//TODO: fix test case with key len 1

        if (root == null) {
            root = new Node();
            root.key = key.charAt(d);
            if (d == key.length() - 1){
                return root;
            }
            root.middle = add(root.middle, key, d+1);
        }

        char c = key.charAt(d);
        if (root.key < c) {
            root.right = add(root.right, key, d);
        } else if (root.key > c) {
            root.left = add(root.left, key, d);
        }else if (root.key == c){
            root.middle = add(root.middle, key, d);
        }


        return root;
    }

    private static void find(Node root, String key) {


    }


}
