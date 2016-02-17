package coursera.elementarytable;

import java.util.*;

/**
 * @author trierra
 * @date 1/24/16.
 */
public class BinarySearchST <Key extends Comparable<Key>, Value>{
    private Key[] keys;
    private Value[] values;
    Queue queue;

    private int N;

    public BinarySearchST(int capacity) {
        queue = new ArrayDeque();
        queue.add(3);
        queue.add(1);
        queue.add(8);
        queue.add(2);

        keys = (Key[]) new Comparable[capacity];
        values = (Value[]) new Object[capacity];
    }

    public int size(){
        return N;
    }

    public Value get(Key key){
        HashMap <String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        if (isEmpty()){
            return null;
        }

        int i = rank(key);
        return null;
    }

    private int rank(Key key) {
        return 0;
    }

    private boolean isEmpty() {
       return N==0;
    }

    public static void main(String[] args) {
        BinarySearchST searchST = new BinarySearchST(3);
        System.out.println(searchST.queue.remove());
        System.out.println(searchST.queue.remove());
        searchST.queue.add(12);

        System.out.println(searchST.queue.remove());
        System.out.println(searchST.queue.remove());
        System.out.println(searchST.queue.remove());
    }
}
