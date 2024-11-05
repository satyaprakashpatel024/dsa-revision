package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int []start = {1,3,0,5,8,5};
        int []end = {2,4,6,7,9,9};
        System.out.println("\n Total Activities selected : "+maxActivity2(start,end));
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
        int activities[][] = new int[start.length][3];

        for(int i=0; i<start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
        int maxActivity = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(activities[0][0]);
        int lastActivityEnd = activities[0][2];
        maxActivity++;
        for(int i = 1; i < start.length; i++) {
            if(activities[i][1] >= lastActivityEnd) {
                maxActivity++;
                list.add(activities[i][0]);
                lastActivityEnd = activities[i][2];
            }
        }
        System.out.print(" list of activities selected : ");
        for(int i : list) {
            System.out.print("A"+i + " ");
        }
        return maxActivity;
    }
}

















