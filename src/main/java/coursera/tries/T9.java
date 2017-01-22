package coursera.tries;

import java.util.*;

/**
 * Created by trierra on 8/25/16 for
 * algorithms.
 */
public class T9 {
    static Node root = new Node();

    static class Node {
        ArrayList<String> val = new ArrayList<>();
        Node[] next = new Node[256];
    }

    static Map<Character, Character> dict = new HashMap<>();

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
             root = put(root, word, 0);
        }

        assert getWords("44").get(0).equals("hi");
        assert getWords("43").get(0).equals("if");
        assert getWords("43556").get(0).equals("hello");
        assert getWords("7467").get(0).equals("shop");
        assert getWords("72673").get(0).equals("scope");
        assert getWords("82253").get(0).equals("table");
    }

    private static ArrayList<String> getWords(String key) {
       return getWords(root, key, 0);
    }

    private static ArrayList<String> getWords(Node root, String key, int index) {
        if(root == null){
            return null;
        }
        if(index == key.length()){
            return root.val;
        }
        char c = key.charAt(index);
        return getWords(root.next[c], key, index+1);
    }


    private static Node put(Node root, String word, int index) {
        if(root == null){
            root = new Node();
        }
        if(index == word.length()){
            root.val.add(word);
            return root;
        }
        int key = dict.get(word.charAt(index));
        root.next[key] = put(root.next[key], word, index+1);
        return root;
    }


    public static void fillMap() {
        dict.put('a', '2');
        dict.put('b', '2');
        dict.put('c', '2');

        dict.put('d', '3');
        dict.put('e', '3');
        dict.put('f', '3');

        dict.put('g', '4');
        dict.put('h', '4');
        dict.put('i', '4');

        dict.put('j', '5');
        dict.put('k', '5');
        dict.put('l', '5');

        dict.put('m', '6');
        dict.put('n', '6');
        dict.put('o', '6');

        dict.put('p', '7');
        dict.put('r', '7');
        dict.put('q', '7');
        dict.put('s', '7');

        dict.put('t', '8');
        dict.put('u', '8');
        dict.put('v', '8');
    }
}
