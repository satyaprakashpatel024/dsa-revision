package recursion;

public class FriendsPairingProblem {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(waysToPair(n));
    }

    private static int waysToPair(int n) {
        if(n==1 || n==2) return n;
        int single = waysToPair(n-1);
        int group = waysToPair(n-2)*(n-1);
        return single+group;
    }
}
