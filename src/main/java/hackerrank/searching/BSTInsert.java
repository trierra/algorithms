package hackerrank.searching;

import java.util.Arrays;

/**
 * Binary search tree insertion
 * @author trierra
 * @date 3/30/16.
 */
public class BSTInsert {

   static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node Insert(Node root,int value)
    {

        if (root == null){
            root = new Node();
            root.data = value;
            return root;
        }

        if (root.data < value){
            root.right = Insert(root.right, value);
        } else if (root.data > value){
            root.left = Insert(root.left, value);
        }else {
            root.data = value;
        }

        return root;

    }

    public static void main(String[] args) {

        Node node = new Node();
        node.data = 4;
        BSTInsert.Insert(node, 2);
        BSTInsert.Insert(node, 3);
        BSTInsert.Insert(node, 1);
        BSTInsert.Insert(node, 7);
    }

    /**
     * Created by trierra on 9/16/15.
     */
    public static class BinarySearch {
        /**
         * This class should not be instantiated.
         */
        private BinarySearch() {
        }

        /**
         * Returns the index of the specified key in the specified array.
         *
         * @param a   the array of integers, must be sorted in ascending order
         * @param key the search key
         * @return index of key in array <tt>a</tt> if present; <tt>-1</tt> otherwise
         */
        public static int indexOf(int[] a, int key) {
            int lo = 0;
            int hi = a.length - 1;
            while (lo <= hi) {
                // Key is in a[lo..hi] or not present.
                int mid = lo + (hi - lo) / 2;

                if (key < a[mid]) {
                    hi = mid - 1;
                } else if (key > a[mid]) {
                    lo = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }

        /**
         * Returns the index of the specified key in the specified array.
         * This function is poorly named because it does not give the <em>rank</em>
         * if the array has duplicate keys or if the key is not in the array.
         *
         * @param key the search key
         * @param a   the array of integers, must be sorted in ascending order
         * @return index of key in array <tt>a</tt> if present; <tt>-1</tt> otherwise
         * @deprecated Replaced by {@link #indexOf(int[], int)}.
         */
        public static int rank(int key, int[] a) {
            return indexOf(a, key);
        }

        /**
         * Reads in a sequence of integers from the whitelist file, specified as
         * a command-line argument; reads in integers from standard input;
         * prints to standard output those integers that do <em>not</em> appear in the file.
         */
        public static void main(String[] args) {

            // read the integers from a file
            int[] whitelist = new int[]{5, 6, 3, 6, 8, 12, 77, 34, 0};

            // sort the array
            Arrays.sort(whitelist);

            // read integer key from standard input; print if not in whitelist
            int key = 13;
            if (BinarySearch.indexOf(whitelist, key) == -1)
                System.out.println(key);
        }
    }
}
