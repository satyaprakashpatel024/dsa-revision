package backtracking;

import java.util.ArrayList;

public class GridPath {
    static int count = 0;
    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        int ans = possiblePath(n,m,0,0);
        System.out.println("Normal method : "+ans);
        System.out.println("Optimised method : "+optimisedGridPath(n,m));
        System.out.println(getAllPath(n,m,0,0));
    }

    // printAll path to reach destination
    public static ArrayList<String> getAllPath(int n,int m, int x, int y) {
        ArrayList<String> list = new ArrayList<>();
        helperPath(n,m,x,y,list,"");
        return list;
    }

    private static void helperPath(int n, int m, int x, int y, ArrayList<String> list, String s) {
        if(x==n-1 && y==m-1){
            list.add(s);
            return;
        }
        else if(x == n || y == m) return ;
        helperPath(n,m,x+1,y,list,s+"R");
        helperPath(n,m,x,y+1,list,s+"D");
    }


    // brute force approach to get no of path to reach destination
    private static int possiblePath(int n,int m, int x, int y) {
        if(x==n-1 && y==m-1) return 1;
        else if(x == n || y == m) return 0;
        int way1 = possiblePath(n,m,x+1,y);
        int way2 = possiblePath(n,m,x,y+1);
        return way1+way2;
    }

    // optimised way to solve find the no of path to reach destination

    public static int optimisedGridPath(int n, int m) {
        int fact1 = factorial(n-1);
        int fact2 = factorial(m-1);
        int totalfact = factorial(n-1+m-1);
        return totalfact/(fact1*fact2);
    }

    private static int factorial(int n) {
        if(n==1) return 1;
        return n*factorial(n-1);
    }














}
