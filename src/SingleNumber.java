public class SingleNumber {
    public static void main(String[] args) {
        int[] arr={2,2,1};
        int ans=0;
        for(int num:arr){
            ans^=num;
        }
        System.out.println(ans);
    }
}
