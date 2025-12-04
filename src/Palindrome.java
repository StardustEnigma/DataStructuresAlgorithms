import java.awt.datatransfer.StringSelection;

public class Palindrome {
    public static void main(String[] args) {
        String s = "MADaM";
        int i=0;
        int n=s.length();
        System.out.println(check(s,i,n));
    }
    public static boolean check(String s , int i,int n ){
        if (i>=n/2){
            return true;
        }
        if (s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return check(s,i+1,n);
    }
}
