package course.recursion;

import java.util.ArrayList;
import java.util.Stack;

public class Hanoi {

    ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();


    Stack<Integer> from = new Stack<Integer>();
    Stack<Integer> to = new Stack<Integer>();
    Stack<Integer> buff = new Stack<Integer>();

    //move disk from one stack to another
    void move(Stack<Integer> from, Stack<Integer> to) {
        to.push(from.pop());
    }

    //use buffer
    Stack<Integer> free(Stack from, Stack to) {
        Stack buffer = null;
        for (Stack stack : stacks) {
            if (stack != from && stack != to) {
                buffer = stack;
            }
        }
        return buffer;
    }

    void init(int N) {
        for (int i = N; i > 0; i--) {
            from.push(i);
        }
        stacks.add(from);
        stacks.add(to);
        stacks.add(buff);
    }

    void print() {
//        System.out.println("from:");
//        for (Integer el : from) {
//            System.out.print(el + " ");
//        }
//
//        System.out.println();
//        System.out.println("buff:");
//        for (Integer el : buff) {
//            System.out.print(el + " ");
//        }
//
//        System.out.println();
//        System.out.println("to:");

        for (Integer el : to) {
            System.out.print(el + " ");
        }

    }

    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        hanoi.init(4);
        hanoi.solve(4, hanoi.from, hanoi.to);
        hanoi.print();
    }

    void solve(int discs, Stack from, Stack to) {
        if (discs < 2) {
            move(from, to);
        }else {
            solve(discs -1, from, free(from, to));
            move(from, to);
            solve(discs-1, free(from, to), to);        }

    }
}
