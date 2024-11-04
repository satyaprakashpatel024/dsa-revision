package queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabccxb";
        findNonRepeatingChar(str);
    }

    private static void findNonRepeatingChar(String str) {
        int []freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            q.offer(c);
            freq[c - 'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
}
