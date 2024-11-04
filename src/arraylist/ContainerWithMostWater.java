package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        int ans = getMaximumWater2(height);
        System.out.println(ans);
    }

    // brute force approach
    private static int getMaximumWater(ArrayList<Integer> height) {
        int max = 0;
        int currMax = 0;
        for (int i = 1; i < height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                currMax = Math.min(height.get(j),height.get(i))*(j-i);
                max = Math.max(max,currMax);
            }
        }
        return max;
    }

    // optimised approach
    private static int getMaximumWater2(ArrayList<Integer> height) {
        int maxWater = 0;
        int currMax = 0;
        int left = 0;
        int right = height.size()-1;
        while(left < right) {
            currMax = Math.min(height.get(left),height.get(right))*(right-left);
            maxWater = Math.max(maxWater,currMax);
            if(height.get(left)>height.get(right)) {
                right--;
            }else{
                left++;
            }
        }
        return maxWater;
    }
}
















