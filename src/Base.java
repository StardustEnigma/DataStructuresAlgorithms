public class Base {
    public static void main(String[] args) {
        int n=5;
        rec(n,n);
    }
    public static void rec(int i,int n){
        if (i<1){
            return;
        }
        System.out.println(i);
        rec(i-1,n);

    }
}
