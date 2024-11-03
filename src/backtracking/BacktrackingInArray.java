package backtracking;

public class BacktrackingInArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        fillArray(arr,0);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static void fillArray(int[] arr, int i) {
        // base case
        if(i==arr.length) return;
        // putting the value in array first
        arr[i] = i+1;
        // remaining work done by recursion
        fillArray(arr,i+1);
        // decrementing the array values by 2
        arr[i]-=2;
    }
}
