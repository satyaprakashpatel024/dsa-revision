package backtracking;

import java.util.ArrayList;

public class SubSetsOfString {
    static ArrayList<String> subsets = new ArrayList<>();
    public static void main(String[] args) {
        String str = "abc";
        printSubSets(str,"");
        System.out.println(subsets);
    }

    private static void printSubSets(String str,String ans) {
        if(str.isEmpty()){
            subsets.add(ans);
            return;
        }
        char c = str.charAt(0);
        printSubSets(str.substring(1),ans+c);
        printSubSets(str.substring(1),ans);
    }
}
