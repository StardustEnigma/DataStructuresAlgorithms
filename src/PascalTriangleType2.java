public class PascalTriangleType2 {
    public static void main(String[] args) {
        int row=6;
        int n=row-1;
        int ans=1;
        System.out.print(ans+" ");
        for (int i = 1; i <=n; i++) {
            ans=ans*(n-i+1);
            ans=ans/i;

            System.out.print(ans+" ");
        }
    }
}
