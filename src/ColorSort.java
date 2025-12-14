import java.lang.reflect.Array;
import java.util.Arrays;

public class ColorSort {
    public static void main(String[] args) {
        int [] arr={2,0,2,1,1,0};
        int c0=0;
        int c1=0;
        int c2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                c0++;
            } else if (arr[i]==1) {
                c1++;
            } else if (arr[i]==2) {
                c2++;
            }
        }
        int index=0;
        for (int i = 0; i < c0; i++) {
            arr[index++]=0;
        }
        for (int i = 0; i <c1 ; i++) {
            arr[index++]=1;
        }
        for (int i = 0; i < c2; i++) {
            arr[index++]=2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
