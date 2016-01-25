package coursera.stackandqueue;

/**
 * @author trierra
 * @date 10/1/15.
 */
public class Queue<I> {

    Node first;
    Node last;

    public Queue() {
    }

    private static class Node<I> {
        I data;
        Node next;

        public Node(I i) {
            data = i;
        }
    }

    public void enqueue(I i) {
        Node node = new Node(i);

    }

    public boolean isEmpty() {
        return false;
    }

    public I dequeue() {

        return null;
    }
}
