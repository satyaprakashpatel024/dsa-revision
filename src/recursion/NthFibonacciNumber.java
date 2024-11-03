package recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        int ans = getNthFibonacciNumber(n);
        System.out.println(ans);
    }

    private static int getNthFibonacciNumber(int n) {
        if(n==0 || n==1) return n;
        return getNthFibonacciNumber(n-1)+ getNthFibonacciNumber(n-2);
    }
}
