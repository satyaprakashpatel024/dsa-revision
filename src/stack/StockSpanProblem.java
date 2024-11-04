package stack;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int []stock = {100,80,60,70,60,85,100};
        int []span = stockSpan(stock);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }

    private static int[] stockSpan(int[] stock) {
        int[] span = new int[stock.length];
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);
        for(int i=1;i<stock.length;i++){
            while(!stack.isEmpty() && stock[stack.peek()]<stock[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i] = i+1;
            }else{
                span[i] = i-stack.peek();
            }
            stack.push(i);
        }
        return span;
    }
}
