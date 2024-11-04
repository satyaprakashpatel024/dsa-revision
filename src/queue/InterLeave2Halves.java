package queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class InterLeave2Halves {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(q);
        findInterLeave(q);
        System.out.println(q);
    }

    private static void findInterLeave(Queue<Integer> q) {
        Queue<Integer> temp = new LinkedList<>();
        int n = q.size();
        for (int i = 0; i < n/2; i++) {
            temp.add(q.poll());
        }
        while(!temp.isEmpty()) {
            q.offer(temp.poll());
            q.offer(q.poll());
        }
    }
}
