public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        int n= arr.length;
        int sum= n*(n+1)/2;
        int s2=0;
        for (int i = 0; i < arr.length; i++) {
                s2=s2+arr[i];
        }

        int missing_number=sum-s2;
        System.out.println(missing_number);
    }
}
