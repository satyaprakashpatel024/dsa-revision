package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,8,9,1,2,3,4,5));
        int target = 7;
        System.out.println("sorted array : "+printPairSumRotated2(list,target));
    }

    private static int getPivotPoint(ArrayList<Integer> list){
        int indx = 0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                indx = i;
                break;
            }
        }
        return indx;
    }

    private static ArrayList<ArrayList<Integer>> printPairSumRotated2(ArrayList<Integer> list, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = list.size();
        int right = getPivotPoint(list);
        int left = right+1;
        while(left!=right){
            if(list.get(left)+list.get(right)==target){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(list.get(left));
                temp.add(list.get(right));
                result.add(temp);
                left = (left+1)%n;
                right = (n+right-1)%n;
            }else if(list.get(left)+list.get(right)<target){
                left = (left+1)%n;
            }else{
                right = (right-1+n)%n;
            }
        }
        return result;
    }
}
