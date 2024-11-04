package queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(q);
        reverseQueue(q);
        System.out.println(q);
    }

    private static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()) {
            s.push(q.poll());
        }
        while(!s.isEmpty()) {
            q.offer(s.pop());
        }
    }
}
