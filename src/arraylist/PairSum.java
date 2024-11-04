package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        int target = 5;
        System.out.println("unsorted array : "+printPairSum2(list,target));
        Collections.sort(list);
        System.out.println("sorted array : "+printPairSum(list,target));
    }

    // brute force unsorted array
    private static ArrayList<ArrayList<Integer>> printPairSum2(ArrayList<Integer> list, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            for(int j = i+1; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);
                if(sum == target) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(list.get(i));
                    temp.add(list.get(j));
                    result.add(temp);
                }
            }
        }
        return result;
    }

    // optimised approach for sorted array
    private static ArrayList<ArrayList<Integer>> printPairSum(ArrayList<Integer> list, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            if (list.get(left)+list.get(right)==target) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(list.get(left));
                temp.add(list.get(right));
                ans.add(temp);
                left++;
                right--;
            }
            else if(list.get(left)+list.get(right)< target) {
                left++;
            }
            else {
                right--;
            }
        }
        return ans;
    }
}
