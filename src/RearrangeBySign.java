import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int [] arr={3,1,-2,-5,2,-4};
        int[] ans=new int[arr.length];

        int posIndex=0;
        int negativeIndex=1;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i]<0){
                ans[negativeIndex]=arr[i];
                negativeIndex+=2;
            } else  {
                ans[posIndex]=arr[i];
                posIndex+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
