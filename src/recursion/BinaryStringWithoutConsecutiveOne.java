package recursion;

import java.util.ArrayList;

public class BinaryStringWithoutConsecutiveOne {
    static int count = 0;
    public static void main(String[] args) {
        int n = 5;
        ArrayList<String> list = withoutConsecutiveOne(n);
        System.out.println(list);
        System.out.println("total binary string : "+count);
    }

    private static ArrayList<String>  withoutConsecutiveOne(int n) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();
        helper(n,0,sb,list);
        return list;
    }

    private static void helper(int n, int lastPlace,StringBuilder sb,ArrayList<String> list) {
        if(n==0){
            count++;
            list.add(sb.toString());
            return;
        }
        helper(n-1, 0, sb.append("0"),list);
        sb.deleteCharAt(sb.length()-1);
        if(lastPlace==0) {
            helper(n - 1, 1, sb.append("1"),list);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
