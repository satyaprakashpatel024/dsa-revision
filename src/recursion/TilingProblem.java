package recursion;

public class TilingProblem {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(waysToFillFloor(n));
    }

    private static int waysToFillFloor(int n) {
        // base case
        if(n==1 || n==0) return 1;
        // choice 1 : vertical
        int vertical =  waysToFillFloor(n-1);
        // choice 2 : Horizontal
        int horizontal = waysToFillFloor(n-2);
        return vertical + horizontal;
    }
}
