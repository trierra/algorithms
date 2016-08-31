package coursera.tries;

import java.util.*;

/**
 * Created by trierra on 8/25/16 for
 * algorithms.
 */
public class T9 {

    private static class Node {
        List<String> value;
        Node[] next = new Node[10];
    }

    static Node root = new Node();


    static Map<String, Integer> dict = new HashMap<>();

    //TODO: Complete tests
    public static void main(String[] args) {
        fillMap();
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("hello");
        dictionary.add("hi");
        dictionary.add("if");
        dictionary.add("shop");
        dictionary.add("scope");
        dictionary.add("table");
        dictionary.add("feel");


        for (String word : dictionary) {
            int d = 0;
            root = fillTree(root, word, d, word);
        }

        int key[] = {4, 3};
        //TODO: find key not working. Fix.
        Node res = findKey(root, key, 0);
    }

    static Node fillTree(Node root, String key, int d, String value) {

        int next = dict.get(String.valueOf(key.charAt(d)));

        if (root == null) {
            root = new Node();
        }
        if (d == key.length() - 1) {

            if (root.value == null) {
                root.value = new LinkedList<>();
                root.value.add(value);
            } else {
                root.value.add(value);
            }
            return root;
        }

        root.next[next] = fillTree(root.next[next], key, d + 1, value);
        return root;
    }

    static Node findKey(Node root, int[] key, int d) {

        if (d == key.length) {
            return root;
        }

        if (root == null) {
            return new Node();
        }
        root = findKey(root.next[key[d]], key, d + 1);

        return root;
    }

    public static void fillMap() {
        dict.put("a", 2);
        dict.put("b", 2);
        dict.put("c", 2);

        dict.put("d", 3);
        dict.put("e", 3);
        dict.put("f", 3);

        dict.put("g", 4);
        dict.put("h", 4);
        dict.put("i", 4);

        dict.put("j", 5);
        dict.put("k", 5);
        dict.put("l", 5);

        dict.put("m", 6);
        dict.put("n", 6);
        dict.put("o", 6);

        dict.put("p", 7);
        dict.put("r", 7);
        dict.put("q", 7);
        dict.put("s", 7);

        dict.put("t", 8);
        dict.put("u", 8);
        dict.put("v", 8);
    }
}
