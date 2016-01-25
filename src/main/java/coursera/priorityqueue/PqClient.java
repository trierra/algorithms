package coursera.priorityqueue;

/**
 * @author trierra
 * @date 1/4/16.
 */
public class PqClient {
    public static void main(String[] args) {
//        MaxPQ maxPQ = new MaxPQ(14);
//        maxPQ.insert(5);
//        maxPQ.insert(1);
//        maxPQ.insert(5);
//        maxPQ.insert(7);
//        maxPQ.insert(3);
//        maxPQ.insert(8);
//        maxPQ.insert(2);
//        maxPQ.insert(1);
//        maxPQ.insert(34);
//        maxPQ.insert(67);
//        maxPQ.insert(9);
//        maxPQ.insert(12);
//        maxPQ.insert(120);
//        maxPQ.insert(1);
//        maxPQ.sort(maxPQ.pq);
//
//        for (Integer a : maxPQ.pq){
//            System.out.print(a + " ");
//        }
//        while (!maxPQ.isEmpty()) {
//            System.out.print(maxPQ.delMax() + " ");
//        }

        int[] arr = new int[]{0, 1, 3, 5, 4, 6, 12, 10 };
        isHeap(arr);


    }

    public  static void isHeap(int[] arr){

        int i = arr.length -1;
        while (i>=1){
            int p = i/2;
            int ch1 = i;
            int ch2 = i-1;
            if(arr[p] < arr[ch1] && arr[p] < arr[ch2] ){
                i=i-2;
            }else {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
