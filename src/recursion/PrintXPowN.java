package recursion;

public class PrintXPowN {
    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        System.out.println(xPowN(x,n));
        System.out.println(xPowOptimise(x,n));
    }

    private static int xPowN(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        return xPowN(x, n-1)*x;
    }

    private static int xPowOptimise(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        int x2 = xPowOptimise(x, n/2);
        return x%2==0? x2*x2 : x2*x+x2*x;
    }
}
