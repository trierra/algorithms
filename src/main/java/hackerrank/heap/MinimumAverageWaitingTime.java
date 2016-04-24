package hackerrank.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author trierra
 * @date 4/11/16.
 */
public class MinimumAverageWaitingTime {


    private static class Customer<T>  implements Comparable<T>{
        int time = 0;
        Integer duration = 0;

        Customer(int time, int duration) {
            this.time = time;
            this.duration = duration;
        }


        public int compareTo(T o) {
            return 0;
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        PriorityQueue<Customer> queue = new PriorityQueue<Customer>();

        int customers = sc.nextInt();
        int servedCustomers = customers;

        int clock = 0;
        int averWaightingTime = 0;
        int server = 0;

        Customer customer = new Customer(sc.nextInt(), sc.nextInt());
        server = customer.duration;

        while (server > 0) {
            if (server == 1) {
                averWaightingTime = clock - customer.time;
                customer = queue.remove();
                server = customer.duration;
            } else {
                if(sc.hasNext()) {
                    queue.add(new Customer(sc.nextInt(), sc.nextInt()));
                }
                clock++;
                server--;
            }
        }
        System.out.println(averWaightingTime / servedCustomers);
    }
}

