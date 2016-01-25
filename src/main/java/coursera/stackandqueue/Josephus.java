package coursera.stackandqueue;


public class Josephus {


    public static void main(String[] args) {

//        Josephus josephus = new Josephus();
//        System.out.println(josephus.joseph(5, 2));
        int M = 2;
        int N = 7;

        // initialize the queue
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < N; i++)
            q.enqueue(i);

        while (!q.isEmpty()) {
            for (int i = 0; i < M - 1; i++)
                q.enqueue(q.dequeue());
            System.out.print(q.dequeue() + " ");
        }
        System.out.println();
    }

}
