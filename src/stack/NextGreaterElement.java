package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int []ans = findNextGreater(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] findNextGreater(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        ans[n-1] = -1;
        stack.push(arr[n-1]);
        for(int i=n-2; i>=0; i--) {
            while(!stack.isEmpty() && arr[i] > stack.peek()) {
                ans[i] = stack.pop();
            }
            if(stack.isEmpty()){
               ans[i] = -1;
            }else {
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
