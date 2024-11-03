package recursion;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 41;
        int n = arr.length;
        System.out.println(firstIndexOf(arr,key,n));
    }

    private static int firstIndexOf(int[] arr, int key, int n) {
        return helper(arr,0,key,n);
    }

    private static int helper(int[] arr, int indx, int key, int n) {
        if(indx==n) return -1;
        if(arr[indx]==key) return indx;
        return helper(arr,indx+1,key,n);
    }
}
