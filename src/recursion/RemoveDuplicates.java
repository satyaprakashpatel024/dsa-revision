package recursion;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "appnnacollege";
        System.out.println(removeDuplicates(str));
    }

    private static StringBuilder removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean []map = new boolean[26];
        helper(str,sb,0,map);
        return sb;
    }

    private static void helper(String str, StringBuilder sb, int i, boolean[] map) {
        if(i==str.length()) return;
        if(!map[str.charAt(i)-'a']) {
            map[str.charAt(i)-'a'] = true;
            sb.append(str.charAt(i));
        }
        helper(str,sb,i+1,map);
    }
}
