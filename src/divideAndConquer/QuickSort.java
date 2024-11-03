package divideAndConquer;

import static divideAndConquer.MergerSort.printArr;

public class QuickSort {
    public static void main(String[] args) {
        int []arr = {6,3,9,5,2,8};
        int n = arr.length;
        System.out.print("Unsorted Array : ");
        printArr(arr);
        quickSort(arr,0,n-1);
        System.out.print("\nSorted Array : ");
        printArr(arr);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[right] = arr[i];
        arr[i] = temp;
        return i;
    }

    private static void quickSort(int[] arr, int strt,int end) {
        if(strt>=end) return;
        int pivit = partition(arr, strt, end);
        quickSort(arr,strt,pivit-1);
        quickSort(arr,pivit+1,end);
    }
}
