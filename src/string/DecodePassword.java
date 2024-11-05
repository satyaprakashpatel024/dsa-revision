package string;

public class DecodePassword {
    public static void main(String[] args) {
        String str ="796115110113721110141108";
        String password = decodePassword(str);
        System.out.println(password);
        m2(str);
    }

    private static String decodePassword(String str) {
        StringBuilder sb = new StringBuilder();
        str = new StringBuilder(str).reverse().toString();
        int i=0;
        while(i<str.length()) {
            String curr = str.charAt(i)+""+str.charAt(i+1);
            int indx = Integer.parseInt(curr);
            if(indx == 32){
                sb.append(" ");
                i = i+2;
            }else if((indx>=65 && indx<=90) || (indx>=97 && indx<=122)){
                sb.append((char)indx);
                i = i+2;
            }else{
                if(i+2>=str.length()){
                    break;
                }
                curr+=str.charAt(i+2);
                indx = Integer.parseInt(curr);
                sb.append((char)indx);
                i+=3;
            }
        }
        return sb.toString();
    }

    static void m2(String str) {
        char arr[] = str.toCharArray();
        String result = "";

        for(int i=arr.length-1;i>0;i=i-2){
            String current = "";
            current = "" + arr[i] + arr[i-1];
            int n = Integer.parseInt(current);
            if(n == 32)
                result +=" ";
            else if((n>=65 && n<=90 )|| (n>=97 && n<=99))
                result += (char)n;
            else{
                if(i-2<0)
                    break;
                current += arr[i-2];
                n=Integer.parseInt(current);
                result +=(char)n;
                i--;
            }
        }
        System.out.println(result);
    }
}
