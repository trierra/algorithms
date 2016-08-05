package hackerrank.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by trierra on 6/18/16.
 */
public class SwapBST {

    private static Node root = new Node();
    static LinkedList<Node> queue = new LinkedList<Node>();
    static int k = 0;
    static int height = 0;


    private static class Node {
        Node left, right = null;
        int lvl;
        int value;
    }

    public static void main(String[] args) {

        root.value = 1;
        root.lvl = 1;
        queue.add(root);

        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        while (cases != 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            put(a, b);
            cases--;
        }

        int swapAmount = in.nextInt();
        height = height(root);

        while (swapAmount != 0) {
            while (k <= height) {

                k = in.nextInt();
                dfs(root, k);
                k = k * 2;
                Inorder(root);
            }
            swapAmount--;
        }


    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;

    }
   static void Inorder(Node root) {

        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.value + " ");
        Inorder(root.right);

    }

    private static void put(int a, int b) {

        if (!queue.isEmpty()) {
            Node node = queue.removeFirst();
            if (a != -1) {
                node.left = new Node();
                node.left.value = a;
                queue.add(node.left);
            }

            if (b != -1) {
                node.right = new Node();
                node.right.value = b;
                queue.add(node.right);
            }

        }
    }

    private static void dfs(Node root, int depth) {

        if (depth == k + 1 || root == null) {
            return;
        }

        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
        swap(root);

    }

    private static void swap(Node root) {
        Node temp = root.left;
        root.right = root.left;
        root.left = temp;
    }
}
