package hackerrank.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * The median of a finite list of numbers can be found by arranging all the integers from lowest to highest value and picking the middle one. For example, the median of {3,3,5,9,11}{3,3,5,9,11} is 55. If there is an even number of integers, then there is no single middle value, and the median is then usually defined to be the mean of the two middle values. For examples, the median of {3,5,7,9}{3,5,7,9} is (5+7)2=6(5+7)2=6.
 * <p>
 * Given that integers are read from a data stream, find the median of elements read so far in an efficient way.
 * <p>
 * Input Format
 * <p>
 * The first line of input will contain integer NN, i.e. the number of integers in the data stream.
 * Each of the next NN lines will contain an integer aiai.
 * Constraints
 * 1≤N≤105
 * 0≤ai≤105
 * Output Format
 * <p>
 * Print NN integers, i.e. the median after each of the input. Report it with precision up to 10−110−1.
 * <p>
 * Sample Input
 * <p>
 * 10
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * <p>
 * Sample Output
 * <p>
 * 1.0
 * 1.5
 * 2.0
 * 2.5
 * 3.0
 * 3.5
 * 4.0
 * 4.5
 * 5.0
 * 5.5
 *
 * @author trierra
 * @date 4/21/16.
 */
public class FindMedian {


    //TODO: doesn't work properly
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        PriorityQueue<Double> minPq = new PriorityQueue<Double>();
        PriorityQueue<Double> maxPq = new PriorityQueue<Double>();
        double mediana = 0;

        while (N > 0) {
            N--;
            double nextInt = in.nextDouble();
            minPq.add(nextInt);
            if (minPq.size() == 1) {
                mediana = minPq.peek();
                System.out.println((String.format("%.1f", mediana)));

            } else if (maxPq.isEmpty() && minPq.size() == 2) {
                double temp = minPq.remove();
                mediana = (temp + minPq.peek()) / 2;
                minPq.add(temp);
                System.out.println((String.format("%.1f", mediana)));
            } else if (minPq.size() == 3 && maxPq.isEmpty()) {
                maxPq.add(minPq.remove() * (-1));
                mediana = minPq.peek();
                System.out.println((String.format("%.1f", mediana)));

            } else if (!maxPq.isEmpty()) {
                if(minPq.size() - maxPq.size() >= 2){
                    maxPq.add(minPq.remove() * (-1));
                }
                if (minPq.peek() < mediana) {
                    double temp = maxPq.remove() * (-1);
                    maxPq.add(minPq.remove() * (-1));
                    minPq.add(temp);
                    if (minPq.size() == maxPq.size()) {
                        mediana = (minPq.peek() + maxPq.peek() * (-1)) / 2;
                        System.out.println((String.format("%.1f", mediana)));
                    } else {
                        mediana = minPq.peek();
                        System.out.println((String.format("%.1f", mediana)));
                    }
                } else {
                    if (minPq.size() == maxPq.size()) {
                        mediana = (minPq.peek() + maxPq.peek() * (-1)) / 2;
                        System.out.println((String.format("%.1f", mediana)));
                    } else {
                        mediana = minPq.peek();
                        System.out.println((String.format("%.1f", mediana)));
                    }
                }

            } else {
                maxPq.add(minPq.remove()*(-1));
                mediana = minPq.peek();
                System.out.println((String.format("%.1f", mediana)));
            }

        }
    }
}
