package recursion;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,1,3,4,5,6,7,8,9};
        int key = 7;
        int n = arr.length;
        System.out.println(lastIndexOf(arr,key,n));
    }

    private static int lastIndexOf(int[] arr, int key, int n) {
        return helper(arr,n-1,key);
    }

    private static int helper(int[] arr, int indx, int key) {
        if(indx<0) return -1;
        if(arr[indx]==key) return indx;
        return helper(arr,indx-1,key);
    }
}
