package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    static double[][] sortRatio(int[] weight, int[] value) {
        int n = weight.length;
        double[][] ratio = new double[n][2];
        for (int i = 0; i < n; i++) {
            ratio[i][0] = i;  // Store index
            ratio[i][1] = ((double)value[i]) / weight[i];  // Store value-to-weight ratio
        }
        // Sort ratios in descending order
        Arrays.sort(ratio, Comparator.comparingDouble(a -> a[1]));
        return ratio;
    }

    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;
        int[] weight1 = {10, 20, 30, 40, 20};
        int[] value1 = {60, 100, 120, 100, 90};
        int ans = fractionalKnapsack(weight1,value1,capacity);
        System.out.println(ans);
    }

    static int fractionalKnapsack(int[] weight, int[] value, int capacity) {
        int n = weight.length;
        double[][] ratio = sortRatio(weight, value);
        int totalProfit = 0;
        for(int i=n-1; i>=0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]) {
                capacity -= weight[idx];
                totalProfit += value[idx];
            }else{
                totalProfit += (int)ratio[i][1]*capacity;
            }
        }
        return totalProfit;
    }

    private static void print2Darray(double[][] ans) {
        System.out.println("index " + " ratio");
        for (double[] an : ans) {
            System.out.println("  " + (int) an[0] + "    " + an[1]);
        }
    }
}
