package hackerrank.searching;

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
}
