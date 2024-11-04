package greedyAlgorithm;

import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int []start = {1,3,0,5,8,5};
        int []end = {2,4,6,7,9,9};
        System.out.println("\n Total Activities selected : "+maxActivity(start,end));
    }

    // if sorted array of ending time is given
    private static int maxActivity(int[] start, int[] end) {
        int maxActivity = 0;
        ArrayList<Integer> list = new ArrayList<>();
        maxActivity++;
        list.add(0);
        int lastEnd = end[0];
        for(int i = 1; i < start.length; i++) {
            if(start[i] >= lastEnd) {
                maxActivity++;
                list.add(i);
                lastEnd = end[i];
            }
        }
        System.out.print(" list of activities selected : ");
        for(int i : list) {
            System.out.print("A"+i + " ");
        }
        return maxActivity;
    }

    // if unsorted array of ending time is given
    private static  int maxActivity2(int []start,int []end){
        int arr[][] = new int[start.length][3];
        return 0;
    }
}
