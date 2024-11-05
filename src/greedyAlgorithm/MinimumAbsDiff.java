package greedyAlgorithm;

import java.util.Arrays;

public class MinimumAbsDiff {
    public static void main(String[] args) {
        int arr[] = {4,1,7,8};
        int brr[] = {2,3,6,5};
        System.out.println(minPairDiff(arr,brr));
    }

    private static int minPairDiff(int[] arr, int[] brr) {
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(brr);
        int minDiff = 0;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
        for(int i=0;i<n;i++){
            minDiff+=Math.abs(arr[i]-brr[i]);
        }
        return minDiff;
    }
}
