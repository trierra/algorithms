package course.sort;

/**
 * Created by trierra on 9/10/15.
 */
public class BubbleSort {
//    int[] arr = new int[]{3, 1, 7, 4, 8, 2, 9, 5, 6};
    int[] arr = new int[]{9, 8, 7, 6, 5};


    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.sort(sort.arr);
    }

}
