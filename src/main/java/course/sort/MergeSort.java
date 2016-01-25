package course.sort;

/**
 * @author trierra
 * @date 10/14/15.
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 5, 0, 2, 4};
        sort(arr);

        for (int i : arr) {
            System.out.print(i);
        }

    }

    public static void sort(int[] a) {
        int[] temp = new int[a.length];
        sort(a, temp, 0, a.length - 1);
    }

    private static void merge(int[] orig, int[] temp, int left, int mid, int right) {


        //first copy to additional array
        for (int i = 0; i < orig.length; i++) {
            temp[i] = orig[i];
        }

        //set indexes for each subarrays

        int i = left;
        int j = mid + 1;

        //start merge
        for (int k = left; k <= right; k++) {

            //first check if first subarray is exausted
            if (i > mid) {
                orig[k] = temp[j++];
            }

            //check if second subarray is exausted
            else if (j > right) {
                orig[k] = temp[i++];
            }

            //start compare because all arrays are not empty
            else if (temp[j] < temp[i]) {
                orig[k] = temp[j++];
            } else {
                orig[k] = temp[i++];
            }
        }

    }

    private static void sort(int[] arr, int[] temp, int left, int right) {

        //check if we have smt to do first
        if (right <= left) {
            return;
        }
        //calculate mid for e
        int mid = left + (right - left) / 2;
        sort(arr, temp, left, mid);
        sort(arr, temp, mid + 1, right);
        merge(arr, temp, left, mid, right);
    }

}
