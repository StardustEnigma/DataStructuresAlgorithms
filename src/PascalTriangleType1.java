public class PascalTriangleType1 {
    public static void main(String[] args) {

        int n=5;
        int r=3;

        System.out.println(NCR(5,3));

    }
    public static int NCR(int n,int r){
        int res=1;

        for (int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}
