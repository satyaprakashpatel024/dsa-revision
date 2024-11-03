package divideAndConquer;

import java.util.ArrayList;

public class MergerSort {
    public static void main(String[] args) {
        int []arr = {6,3,9,5,2,8};
        int n = arr.length;
        printArr(arr);
        mergesort(arr,0,n-1);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }


    private static void mergesort(int[] arr, int strt, int end) {
        if(strt == end) {
            return;
        }
        int mid  = strt+(end-strt)/2;
        mergesort(arr,strt,mid);
        mergesort(arr,mid+1,end);
        mergerArray(arr,strt,mid,end);
    }

    private static void mergerArray(int[] arr, int strt, int mid, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = strt;
        int j = mid+1;
        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                list.add(arr[i++]);
            }
            else{
                list.add(arr[j++]);
            }
        }
        while(i <= mid) {
            list.add(arr[i++]);
        }
        while(j <= end) {
            list.add(arr[j++]);
        }
        i = strt;
        for(int x : list) {
            arr[i++] = x;
        }
    }
}
