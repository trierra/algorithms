package coursera.elementarytable;

/**
 * @author trierra
 * @date 1/27/16.
 */
public class BinarySearchTree {

    public static boolean RED = true;
    public static boolean BLACK = false;

    private Node root = null;

    private class Node {
        Integer data;
        Node left;
        Node right;
        boolean color;
    }

    public void publicInsert(Integer data){
        this.root = insert(root, data);
    }

    private Node insert(Node root, int data){
        if (root == null){
            Node node = new Node();
            node.data = data;
            node.color = RED;
            return node;

        }else if(root.data < data){
            root.right = insert(root.right, data);
        }else if (root.data > data){
            root.left = insert(root.left, data);
        }else {
            root.data = data;
        }
        return root;
    }
}
