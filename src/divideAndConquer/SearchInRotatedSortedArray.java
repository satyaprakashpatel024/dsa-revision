package divideAndConquer;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[]= {7,8,9,1,2,3,4,5,6};
        //          0 1 2 3 4 5 6 7 8
        int target = 11;
        System.out.println(findInRotatedArray(arr,target,0,arr.length-1));
    }




    private static boolean findInRotatedArray(int[] arr, int target,int start, int end) {
        if(start >= end) {
            return false;
        }
        // kaam recursion
        int mid = start + (end - start)/2;
        //case found
        if(arr[mid] == target) {
            return true;
        }
        // mid-on line 1 :
        if(arr[start] <= arr[mid]) {
            // case 1 : left
            if(arr[start] < target && target < arr[mid]) {
                return findInRotatedArray(arr,target,start,mid-1);
            }// case 2 : right
            else{
                return findInRotatedArray(arr,target,mid+1,end);
            }
        } // mid-n line 2 :
        else{// case 3 : right
            if(arr[mid] < target && target < arr[end]) {
                return findInRotatedArray(arr,target,mid+1,end);
            }// case 4 : left
            else{
                return findInRotatedArray(arr,target,start,mid-1);
            }
        }
    }
}
