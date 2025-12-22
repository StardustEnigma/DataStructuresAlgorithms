import java.util.Arrays;

//Brute
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr={0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(arr);
        int longest=1;
        int cntCurrent=1;
        int lastSmallest=Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {


            if (arr[i] == lastSmallest) {
                continue;
            }
            if (arr[i]-1==lastSmallest){
                cntCurrent++;
                lastSmallest=arr[i];
            } else if (arr[i]!=lastSmallest) {
                cntCurrent=1;
                lastSmallest=arr[i];
            }


            longest=Math.max(cntCurrent,longest);
        }
        System.out.println(longest);
    }
}
