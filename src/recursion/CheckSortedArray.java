package recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        System.out.println(isSortedArray(arr,n));
    }

    static boolean helper(int[] arr,int i,int n){
        if(i==n-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return helper(arr,i+1,n);
        }
        return false;
    }

    private static boolean isSortedArray(int[] arr, int n) {
        return helper(arr,0,n);
    }
}
