package backtracking;

import java.util.ArrayList;

public class FindPermutations {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String str = "abc";
        findAllPermutations(str,"");
        System.out.println(list);
    }

    private static void findAllPermutations(String str, String s) {
        if(str.isEmpty()){
            list.add(s);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findAllPermutations(newStr,s+c);
        }
    }
}
